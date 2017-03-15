package org.jug.jbcn.entrypoints.controller.comment.http;

/**
 * Created by jguitart on 10/3/17.
 */
public class RestBasicResponse {

    private boolean status;
    private String error[];

    public RestBasicResponse(boolean status, String[] error) {
        this.status = status;
        this.error = error;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String[] getError() {
        return error;
    }

    public void setError(String[] error) {
        this.error = error;
    }
}
