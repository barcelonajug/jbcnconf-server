package org.jug.jbcn.jbcn.model.dto;

/**
 * Created by jguitart on 29/3/17.
 */
public interface Vote {

    Long getId();
    String getDeviceId();
    String getMeetingId();
    int getVote();

}
