package org.bcn.jug.jbcnconf.api.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Created by mkbrv on 08/02/2017.
 */
public interface Talk {

    @JsonIgnore
    Long getId();

    String getScheduleId();
}
