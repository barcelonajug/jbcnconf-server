package org.bcn.jug.jbcnconf.core.uc;

import org.bcn.jug.jbcnconf.core.model.CommentImpl;
import org.bcn.jug.jbcnconf.core.model.dto.Device;
import org.bcn.jug.jbcnconf.core.model.dto.Comment;
import org.bcn.jug.jbcnconf.core.model.dto.Talk;
import org.bcn.jug.jbcnconf.repository.DeviceRepositoryJPA;
import org.bcn.jug.jbcnconf.repository.TalkRepositoryJPA;
import org.bcn.jug.jbcnconf.repository.model.DeviceJPA;
import org.bcn.jug.jbcnconf.repository.model.TalkJPA;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

/**
 * Created by mkbrv on 08/02/2017.
 */
@Component
public class CommentFactory {


    @Resource
    private TalkRepositoryJPA talkRepository;

    @Resource
    private DeviceRepositoryJPA clientRepository;


    public CommentBuilder newComment(final Comment comment) {
        return new CommentBuilder(comment);
    }


    public class CommentBuilder {

        private Talk Talk;
        private Device client;
        private String name;
        private String text;

        private CommentBuilder(final Comment comment) {
            this.Talk = comment.getTalk();
            this.client = comment.getClient();
            this.name = comment.getName();
            this.text = comment.getText();
        }

        public CommentBuilder forTalk(final Talk Talk) {
            this.Talk = Talk;
            return this;
        }

        public CommentBuilder byClient(final Device client) {
            this.client = client;
            return this;
        }

        public Comment build() {
            return new CommentImpl(validateTalk().getId(), validateClient().getDeviceId(), name, text);
        }

        private DeviceJPA validateClient() {
            assert client != null;
            assert !StringUtils.isEmpty(client.getDeviceId());
            Device existingClient = clientRepository.findByPhoneId(client.getDeviceId());
            if (existingClient != null) {
                client = existingClient;
            }

            return (DeviceJPA) client;

        }

        private TalkJPA validateTalk() {
            assert Talk != null;
            assert !StringUtils.isEmpty(Talk.getScheduleId());
            Talk existingTalk = talkRepository.findByScheduleId(Talk.getScheduleId());
            if (existingTalk != null) {
                Talk = existingTalk;
            }
            return (TalkJPA) Talk;
        }

    }


}
