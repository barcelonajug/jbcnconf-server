package org.jug.jbcn.controller.http;

/**
 * Created by jguitart on 29/3/17.
 */
public class PushTokenRegisterRequest {

    String deviceId;
    String token;

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
