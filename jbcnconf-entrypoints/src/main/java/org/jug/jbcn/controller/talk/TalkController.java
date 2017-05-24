package org.jug.jbcn.controller.talk;

import org.jug.jbcn.controller.RouterConsts;
import org.jug.jbcn.controller.http.CommentTalkRequest;
import org.jug.jbcn.controller.http.GetCommentTalkResponse;
import org.jug.jbcn.controller.http.SaveCommentTalkResponse;
import org.jug.jbcn.controller.http.VoteTalkResponse;
import org.jug.jbcn.jbcn.model.dto.Comment;
import org.jug.jbcn.jbcn.uc.TalkService;
import org.jug.jbcn.jbcn.uc.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by mkbrv on 08/02/2017.
 */
@RestController
@RequestMapping(RouterConsts.API_PREFIX + RouterConsts.API_TALK_PREFIX)
public class TalkController {

    @Autowired
    TalkService talkService;

    @Autowired
    VoteService voteService;

    @RequestMapping(value="/{meetingId}/vote/{deviceId}/{vote}", method = RequestMethod.GET)
    public VoteTalkResponse voteMeeting(@PathVariable String meetingId, @PathVariable String deviceId, @PathVariable int vote) {
        double voteAverage = this.voteService.voteMeeting(meetingId, deviceId, vote);
        return new VoteTalkResponse(true, null, meetingId, voteAverage);
    }

    @RequestMapping(value="/comment", method = RequestMethod.POST)
    public SaveCommentTalkResponse saveCommentTalk(@RequestBody CommentTalkRequest payload) {
        this.talkService.saveComment(payload.getDeviceId(), payload.getTalkId(), payload.getName(), payload.getText(), payload.getVote());
        double voteAverage = this.talkService.getVoteAverage(payload.getTalkId());
        List<Comment> talkComments = this.talkService.getTalkComments(payload.getTalkId());
        SaveCommentTalkResponse response = new SaveCommentTalkResponse(true, null);
        response.setAverageVote(voteAverage);
        response.setComments(talkComments);
        return response;
    }

    @RequestMapping(value="/{meetingId}/comment", method = RequestMethod.GET)
    public GetCommentTalkResponse getTalkComments(@PathVariable String meetingId) {
        List<Comment> talkComments = this.talkService.getTalkComments(meetingId);
        return new GetCommentTalkResponse(true, null, talkComments);
    }
}
