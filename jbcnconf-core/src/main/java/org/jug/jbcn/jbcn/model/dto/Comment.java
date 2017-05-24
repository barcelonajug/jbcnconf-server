package org.jug.jbcn.jbcn.model.dto;

import java.util.Date;

/**
 * Created by mkbrv on 08/02/2017.
 */
public interface Comment {

    String getId();

    String getDeviceId();

    String getName();

    String getText();

    String getTalkId();

    Date getDate();

    int getVote();


}
