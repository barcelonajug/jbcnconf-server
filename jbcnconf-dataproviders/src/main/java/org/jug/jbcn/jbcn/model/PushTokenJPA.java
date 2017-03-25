package org.jug.jbcn.jbcn.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by jguitart on 25/3/17.
 */

@Entity(name = "push_token")
public class PushTokenJPA {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String deviceId;

    String token;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
