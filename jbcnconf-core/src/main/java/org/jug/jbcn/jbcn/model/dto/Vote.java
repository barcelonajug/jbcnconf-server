package org.jug.jbcn.jbcn.model.dto;

/**
 * Created by jguitart on 29/3/17.
 */
public interface Vote {

    String getId();
    String getDeviceId();
    String getMeetingId();
    int getVote();

}
