package org.jug.jbcn.dataproviders.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by mkbrv on 08/02/2017.
 */
@Entity(name = "comment")
public class CommentJPA {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String talkId;

    private String deviceId;

    private String name;

    private String text;

    private Date date;


    public CommentJPA() {
    }

    public CommentJPA(String talkId, String deviceId, String name, String text, Date date) {
        this.talkId = talkId;
        this.deviceId = deviceId;
        this.name = name;
        this.text = text;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
}
