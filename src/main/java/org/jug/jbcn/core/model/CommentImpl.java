package org.jug.jbcn.core.model;


import org.jug.jbcn.core.model.dto.Comment;
import org.jug.jbcn.dataproviders.model.CommentJPA;

import java.util.Date;

/**
 * Created by jguitart on 7/3/17.
 */
public class CommentImpl extends CommentJPA implements Comment {

    public CommentImpl() {

    }

    public CommentImpl(String talkId, String deviceId, String name, String text, Date date) {
        super(talkId, deviceId, name, text, date);
    }

    public CommentImpl(CommentJPA commentJPA) {
        this.setTalkId(commentJPA.getTalkId());
        this.setDeviceId(commentJPA.getDeviceId());
        this.setName(commentJPA.getName());
        this.setText(commentJPA.getText());
        this.setDate(commentJPA.getDate());
    }
}
