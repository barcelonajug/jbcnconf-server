package org.jug.jbcn.controller.http;

import org.jug.jbcn.jbcn.model.dto.Comment;

import java.util.List;

/**
 * Created by jguitart on 17/5/17.
 */
public class SaveCommentTalkResponse extends RestBasicResponse {

    List<Comment> comments;
    double averageVote;

    public SaveCommentTalkResponse(boolean status, String[] error) {
        super(status, error);
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public double getAverageVote() {
        return averageVote;
    }

    public void setAverageVote(double averageVote) {
        this.averageVote = averageVote;
    }
}
