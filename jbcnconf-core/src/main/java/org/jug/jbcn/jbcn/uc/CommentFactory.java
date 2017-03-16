package org.jug.jbcn.jbcn.uc;

import org.jug.jbcn.jbcn.model.dto.Comment;
import org.jug.jbcn.jbcn.model.CommentJPA;
import org.jug.jbcn.jbcn.repository.DeviceRepositoryJPA;
import org.jug.jbcn.jbcn.repository.TalkRepositoryJPA;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

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

        private String talkId;
        private String deviceId;
        private String name;
        private String text;
        private Date date;

        private CommentBuilder(final Comment comment) {
            this.talkId = comment.getTalkId();
            this.deviceId = comment.getDeviceId();
            this.name = comment.getName();
            this.text = comment.getText();
            this.date = comment.getDate();
        }

        public CommentBuilder setTalkId(String talkId) {
            this.talkId = talkId;
            return this;
        }

        public CommentBuilder setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        public CommentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public CommentBuilder setText(String text) {
            this.text = text;
            return this;
        }

        public CommentBuilder setDate(Date date) {
            this.date = date;
            return this;
        }


        public CommentJPA build() {
            return new CommentJPA(talkId, deviceId, name, text, date);
        }

    }


}
