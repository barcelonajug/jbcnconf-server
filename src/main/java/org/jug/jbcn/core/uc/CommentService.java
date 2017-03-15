package org.jug.jbcn.core.uc;

import org.jug.jbcn.core.model.CommentImpl;
import org.jug.jbcn.core.model.dto.Comment;
import org.jug.jbcn.dataproviders.model.CommentJPA;
import org.jug.jbcn.dataproviders.repository.CommentRepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jguitart on 6/3/17.
 */


@Service
public class CommentService {

    @Autowired
    CommentRepositoryJPA commentRepository;

    @Autowired
    CommentFactory commentFactory;


    public List<Comment> findCommentsByTalkId(String talkId) {
        List<CommentJPA> comments = this.commentRepository.findByTalkId(talkId);
        List<Comment> result = new ArrayList<Comment>();
        for(CommentJPA comment: comments) {
            result.add(new CommentImpl(comment));
        }
        return result;
    }

    public void save(Comment comment) {
        CommentJPA commentJPA = this.commentRepository.findByTalkIdAndDeviceId(comment.getTalkId(), comment.getDeviceId());
        if(commentJPA == null) {
            commentJPA = this.commentFactory.newComment(comment).build();
        } else {
            commentJPA.setDate(comment.getDate());
            commentJPA.setText(comment.getText());
            commentJPA.setDeviceId(comment.getDeviceId());
            commentJPA.setName(comment.getName());
            commentJPA.setTalkId(comment.getTalkId());
        }
        this.commentRepository.save(commentJPA);
    }
}
