package org.jug.jbcn.jbcn.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by mkbrv on 08/02/2017.
 */
@Document(collection = "comment")
public class CommentJPA {

    @Id
    private String id;

    private String talkId;

    private String deviceId;

    private String name;

    private String text;

    private Date date;

    private int vote;


    public CommentJPA() {
    }

    public CommentJPA(String talkId, String deviceId, String name, String text, Date date, int vote) {
        this.talkId = talkId;
        this.deviceId = deviceId;
        this.name = name;
        this.text = text;
        this.date = date;
        this.vote = vote;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTalkId() {
        return talkId;
    }

    public void setTalkId(String talkId) {
        this.talkId = talkId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }
}
