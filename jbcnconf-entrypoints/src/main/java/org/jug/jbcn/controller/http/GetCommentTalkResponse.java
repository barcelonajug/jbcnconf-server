package org.jug.jbcn.controller.http;

import org.jug.jbcn.jbcn.model.dto.Comment;

import java.util.List;

/**
 * Created by jguitart on 17/5/17.
 */
public class GetCommentTalkResponse extends RestBasicResponse {

    public GetCommentTalkResponse(boolean status, String[] error, List<Comment> comments) {
        super(status, error);
        this.comments = comments;
    }

    private List<Comment> comments;

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
