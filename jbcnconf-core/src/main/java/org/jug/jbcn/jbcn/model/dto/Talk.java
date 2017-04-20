package org.jug.jbcn.jbcn.model.dto;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * Created by jguitart on 29/3/17.
 */
public interface Talk {

    Long getId();

    String getMeetingId();

    double getVoteAverage();

}
