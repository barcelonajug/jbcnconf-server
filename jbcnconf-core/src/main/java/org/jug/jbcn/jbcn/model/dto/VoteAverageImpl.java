package org.jug.jbcn.jbcn.model.dto;

/**
 * Created by jguitart on 20/4/17.
 */
public class VoteAverageImpl implements VoteAverage {

    private String meetingId;
    private double voteAverage;

    @Override
    public String getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    @Override
    public double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(double voteAverage) {
        this.voteAverage = voteAverage;
    }
}
