package org.bcn.jug.jbcnconf.repository.model;

import javax.persistence.*;

/**
 * Created by mkbrv on 08/02/2017.
 */
@Entity(name = "talk")
public class TalkJPA {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true, nullable = false)
    private String talkId;

    public Long getId() {
        return id;
    }

    public String getTalkId() {
        return talkId;
    }

    /**
     * @param id
     * @param talkId
     */
    public TalkJPA(final Long id,
                   final String talkId) {
        this.id = id;
        this.talkId = talkId;
    }

    /**
     * @param talkId
     */
    public TalkJPA(final String talkId) {
        this(null, talkId);
    }


    public TalkJPA() {

    }
}
