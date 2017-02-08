package org.bcn.jug.jbcnconf.core.model;

import org.bcn.jug.jbcnconf.api.domain.Client;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by mkbrv on 08/02/2017.
 */
@Entity(name = "client")
public class ClientJPA implements Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String phoneId;

    public ClientJPA() {
    }

    /**
     * @param id
     * @param phoneId
     */
    public ClientJPA(final Long id,
                     final String phoneId) {
        this.phoneId = phoneId;
        this.id = id;
    }

    /**
     * @param phoneId
     */
    public ClientJPA(final String phoneId) {
        this(null, phoneId);
    }

    public Long getId() {
        return id;
    }

    public String getPhoneId() {
        return phoneId;
    }
}
