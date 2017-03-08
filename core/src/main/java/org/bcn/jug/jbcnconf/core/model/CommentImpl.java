package org.bcn.jug.jbcnconf.core.model;

import org.bcn.jug.jbcnconf.core.model.dto.Comment;
import org.bcn.jug.jbcnconf.repository.model.CommentJPA;

/**
 * Created by jguitart on 7/3/17.
 */
public class CommentImpl extends CommentJPA implements Comment {

    public CommentImpl() {
    }

    public CommentImpl(String talkId, String deviceId, String name, String text) {
        super(talkId, deviceId, name, text);
    }
}
