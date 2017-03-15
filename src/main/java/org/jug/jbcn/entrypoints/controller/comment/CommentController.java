package org.jug.jbcn.entrypoints.controller.comment;

import org.jug.jbcn.core.model.dto.Comment;

import org.jug.jbcn.core.uc.CommentService;
import org.jug.jbcn.entrypoints.controller.RouterConsts;
import org.jug.jbcn.entrypoints.controller.comment.http.CommentsListResponse;
import org.jug.jbcn.entrypoints.controller.comment.http.RestBasicResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by mkbrv on 08/02/2017.
 */
@RestController
@RequestMapping(RouterConsts.API_PREFIX + RouterConsts.API_COMMENT_PREFIX)
public class CommentController {

    @Autowired
    CommentService commentService;

    @RequestMapping(value = "/{talkId}", method = RequestMethod.GET)
    @SuppressWarnings("unchecked")
    public CommentsListResponse getComments(@PathVariable String talkId) {
        List<Comment> result = commentService.findCommentsByTalkId(talkId);
        return new CommentsListResponse(true, null, talkId, result);
    }

    @RequestMapping(value = "/{talkId}", method = RequestMethod.POST)
    @SuppressWarnings("unchecked")
    public RestBasicResponse getComments(@PathVariable("scheduleId") final String scheduleId,
                                         @RequestBody final Comment comment) {
        this.commentService.save(comment);
        return new RestBasicResponse(true, null);
    }


}
