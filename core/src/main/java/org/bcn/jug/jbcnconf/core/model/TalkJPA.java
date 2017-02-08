package org.bcn.jug.jbcnconf.core.model;

import org.bcn.jug.jbcnconf.api.domain.Talk;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by mkbrv on 08/02/2017.
 */
@Entity(name = "talk")
public class TalkJPA implements Talk {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true, nullable = false)
    private String scheduleId;

    public Long getId() {
        return id;
    }

    @Override
    public String getScheduleId() {
        return scheduleId;
    }

    /**
     * @param id
     * @param scheduleId
     */
    public TalkJPA(final Long id,
                   final String scheduleId) {
        this.id = id;
        this.scheduleId = scheduleId;
    }

    /**
     * @param scheduleId
     */
    public TalkJPA(final String scheduleId) {
        this(null, scheduleId);
    }


    public TalkJPA() {

    }
}
