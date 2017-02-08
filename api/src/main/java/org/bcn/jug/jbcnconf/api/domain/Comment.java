package org.bcn.jug.jbcnconf.api.domain;

/**
 * Created by mkbrv on 08/02/2017.
 */
public interface Comment {

    Long getId();

    Client getClient();

    String getName();

    String getText();

    Talk getTalk();


}
