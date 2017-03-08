package org.bcn.jug.jbcnconf.web.api.comment;

import org.bcn.jug.jbcnconf.api.domain.Comment;
import org.bcn.jug.jbcnconf.service.comment.CommentRepository;
import org.bcn.jug.jbcnconf.core.model.TalkJPA;
import org.bcn.jug.jbcnconf.core.model.comment.CommentFactory;
import org.bcn.jug.jbcnconf.core.model.comment.CommentJPA;
import org.bcn.jug.jbcnconf.web.Application;
import org.bcn.jug.jbcnconf.web.api.talk.TalkController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by mkbrv on 08/02/2017.
 */
@RestController
@RequestMapping(Application.API_PREFIX + TalkController.API_PREFIX + "/{scheduleId}")
public class CommentController {

    @Resource
    private CommentRepository commentRepository;

    @Resource
    private CommentFactory commentFactory;

    @RequestMapping(value = "/comment", method = RequestMethod.GET)
    @SuppressWarnings("unchecked")
    public List<Comment> getComments(@PathVariable("scheduleId") final String scheduleId) {
        return new ArrayList<Comment>(commentRepository.findByTalk(new TalkJPA(scheduleId)));
    }

    @RequestMapping(value = "/comment", method = RequestMethod.POST)
    @SuppressWarnings("unchecked")
    public Comment getComments(@PathVariable("scheduleId") final String scheduleId,
                               @RequestBody final CommentJPA commentDTO) {
        final Comment comment = commentFactory.newComment(commentDTO)
                .forTalk(new TalkJPA(scheduleId))
                .build();
        return commentRepository.save(comment);
    }


}
