package org.jug.jbcn.jbcn.uc;

import org.jug.jbcn.jbcn.model.VoteJPA;
import org.jug.jbcn.jbcn.repository.VoteRepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by jguitart on 29/3/17.
 */
@Service
public class VoteService {

    @Autowired
    VoteRepositoryJPA voteRepository;

    public double voteMeeting(String meetingId, String deviceId, int vote) {
        Optional<VoteJPA> voteOpt = voteRepository.getVote(meetingId, deviceId);
        VoteJPA voteJpa = null;
        if(voteOpt.isPresent()) {
            voteJpa = voteOpt.get();
        } else {
            voteJpa = new VoteJPA();
        }

        voteJpa.setDeviceId(deviceId);
        voteJpa.setMeetingId(meetingId);
        voteJpa.setVote(vote);

        this.voteRepository.save(voteJpa);

        List<VoteJPA> meetingVotes = voteRepository.getMeetingVotes(meetingId);
        int totalVotes = 0;
        for(VoteJPA meetingVote: meetingVotes) {
            totalVotes += meetingVote.getVote();
        }
        double result = totalVotes / meetingVotes.size();

        return result;
    }
}
