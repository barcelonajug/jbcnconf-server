package org.jug.jbcn.controller.http;

/**
 * Created by jguitart on 29/3/17.
 */
public class VoteTalkResponse extends RestBasicResponse {

    String meetingId;
    double voteAverage;

    public VoteTalkResponse(boolean status, String[] error, String meetingId, double voteAverage) {
        super(status, error);
        this.meetingId = meetingId;
        this.voteAverage = voteAverage;
    }

    public VoteTalkResponse(boolean status, String[] error) {
        super(status, error);
    }

    public String getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    public double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(double voteAverage) {
        this.voteAverage = voteAverage;
    }
}
