package org.bcn.jug.jbcnconf.core.model.comment;

import org.bcn.jug.jbcnconf.api.domain.Client;
import org.bcn.jug.jbcnconf.api.domain.Comment;
import org.bcn.jug.jbcnconf.api.domain.Talk;
import org.bcn.jug.jbcnconf.api.repository.ClientRepository;
import org.bcn.jug.jbcnconf.api.repository.TalkRepository;
import org.bcn.jug.jbcnconf.core.model.ClientJPA;
import org.bcn.jug.jbcnconf.core.model.TalkJPA;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

/**
 * Created by mkbrv on 08/02/2017.
 */
@Component
public class CommentFactory {


    @Resource
    private TalkRepository talkRepository;

    @Resource
    private ClientRepository clientRepository;


    public CommentBuilder newComment(final Comment comment) {
        return new CommentBuilder(comment);
    }


    public class CommentBuilder {

        private Talk talk;
        private Client client;
        private String name;
        private String text;

        private CommentBuilder(final Comment comment) {
            this.talk = comment.getTalk();
            this.client = comment.getClient();
            this.name = comment.getName();
            this.text = comment.getText();
        }

        public CommentBuilder forTalk(final Talk talk) {
            this.talk = talk;
            return this;
        }

        public CommentBuilder byClient(final Client client) {
            this.client = client;
            return this;
        }

        public Comment build() {
            return new CommentJPA(validateTalk(), validateClient(), name, text);
        }

        private ClientJPA validateClient() {
            assert client != null;
            assert !StringUtils.isEmpty(client.getPhoneId());
            Client existingClient = clientRepository.findByPhoneId(client.getPhoneId());
            if (existingClient != null) {
                client = existingClient;
            }

            return (ClientJPA) client;

        }

        private TalkJPA validateTalk() {
            assert talk != null;
            assert !StringUtils.isEmpty(talk.getScheduleId());
            Talk existingTalk = talkRepository.findByScheduleId(talk.getScheduleId());
            if (existingTalk != null) {
                talk = existingTalk;
            }
            return (TalkJPA) talk;
        }

    }


}
