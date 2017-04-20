package org.jug.jbcn.jbcn.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;

/**
 * Created by jguitart on 29/3/17.
 */
@Entity(name = "talk")
public class TalkJPA {

    @Id
    private Long id;

    @Column(name = "meeting_id", unique = true, nullable = false)
    private String meetingId;

    double voteAverage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
