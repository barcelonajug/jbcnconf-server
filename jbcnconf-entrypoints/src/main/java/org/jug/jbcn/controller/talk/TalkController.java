package org.jug.jbcn.controller.talk;

import org.jug.jbcn.controller.RouterConsts;
import org.jug.jbcn.controller.http.RestBasicResponse;
import org.jug.jbcn.controller.http.VoteTalkResponse;
import org.jug.jbcn.jbcn.uc.TalkService;
import org.jug.jbcn.jbcn.uc.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    public VoteTalkResponse voteMeeting(String meetingId, String deviceId, int vote) {
        double voteAverage = this.voteService.voteMeeting(meetingId, deviceId, vote);
        return new VoteTalkResponse(true, null, meetingId, voteAverage);
    }




}
