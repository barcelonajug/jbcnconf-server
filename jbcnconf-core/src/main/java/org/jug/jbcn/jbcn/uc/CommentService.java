package org.jug.jbcn.jbcn.uc;

import org.jug.jbcn.jbcn.model.CommentImpl;
import org.jug.jbcn.jbcn.model.dto.Comment;
import org.jug.jbcn.jbcn.model.CommentJPA;
import org.jug.jbcn.jbcn.repository.CommentRepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
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
            commentJPA.setVote(comment.getVote());
        }
        this.commentRepository.save(commentJPA);
    }

    public List<Comment> getTalkComments(String talkId){
        List<CommentJPA> comments = this.commentRepository.findAllByTalkId(talkId, new Sort(Sort.Direction.DESC, "date"));
        List<Comment> result = new ArrayList<>();
        for(CommentJPA comment: comments) {
            result.add(new CommentImpl(comment));
        }
        return result;
    }
}
