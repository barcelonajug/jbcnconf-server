package org.jug.jbcn.jbcn.uc;

import org.jug.jbcn.jbcn.model.CommentImpl;
import org.jug.jbcn.jbcn.model.dto.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by jguitart on 29/3/17.
 */
@Service
public class TalkService {

    @Autowired
    private CommentService commentService;

    public void saveComment(String deviceId, String talkId, String name, String text, int vote) {
        CommentImpl comment = new CommentImpl(talkId, deviceId, name, text, new Date(), vote);
        this.commentService.save(comment);
    }

    public List<Comment> getTalkComments(String talkId) {
        List<Comment> result = this.commentService.getTalkComments(talkId);
        return result;
    }

    public double getVoteAverage(String talkId) {
        List<Comment> comments = this.commentService.getTalkComments(talkId);
        int sum = 0;
        for(Comment comment: comments) {
            sum = sum + comment.getVote();
        }
        double result = sum / comments.size();
        return result;
    }
}
