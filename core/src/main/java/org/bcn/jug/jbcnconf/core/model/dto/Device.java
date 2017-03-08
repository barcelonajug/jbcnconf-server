package org.bcn.jug.jbcnconf.core.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Created by mkbrv on 08/02/2017.
 */
public interface Device {

    @JsonIgnore
    Long getId();

    String getDeviceId();

}
