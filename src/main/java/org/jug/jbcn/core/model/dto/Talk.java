package org.jug.jbcn.core.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Created by mkbrv on 08/02/2017.
 */
public interface Talk {

    @JsonIgnore
    Long getId();

    String getScheduleId();
}
