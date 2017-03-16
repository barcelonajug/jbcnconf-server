package org.jug.jbcn.jbcn.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by mkbrv on 08/02/2017.
 */
@Entity(name = "device")
public class DeviceJPA  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String phoneId;

    public DeviceJPA() {
    }

    /**
     * @param id
     * @param phoneId
     */
    public DeviceJPA(final Long id,
                     final String phoneId) {
        this.phoneId = phoneId;
        this.id = id;
    }

    /**
     * @param phoneId
     */
    public DeviceJPA(final String phoneId) {
        this(null, phoneId);
    }

    public Long getId() {
        return id;
    }

    public String getDeviceId() {
        return phoneId;
    }
}
