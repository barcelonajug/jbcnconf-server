package org.jug.jbcn.entrypoints.controller.comment.http;

import org.jug.jbcn.core.model.dto.Comment;

import java.util.List;

/**
 * Created by jguitart on 10/3/17.
 */
public class CommentsListResponse extends RestBasicResponse {

    public CommentsListResponse(boolean status, String[] error, String talkId, List<Comment> comments) {
        super(status, error);
        this.comments = comments;
        this.talkId = talkId;
    }

    List<Comment> comments;
    String talkId;

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public String getTalkId() {
        return talkId;
    }

    public void setTalkId(String talkId) {
        this.talkId = talkId;
    }
}
