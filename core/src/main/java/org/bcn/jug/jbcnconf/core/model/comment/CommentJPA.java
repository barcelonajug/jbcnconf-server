package org.bcn.jug.jbcnconf.core.model.comment;

import org.bcn.jug.jbcnconf.api.domain.Client;
import org.bcn.jug.jbcnconf.api.domain.Comment;
import org.bcn.jug.jbcnconf.api.domain.Talk;
import org.bcn.jug.jbcnconf.core.model.ClientJPA;
import org.bcn.jug.jbcnconf.core.model.TalkJPA;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created by mkbrv on 08/02/2017.
 */
@Entity(name = "comment")
public class CommentJPA implements Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "talkId")
    private TalkJPA talk;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "clientId")
    private ClientJPA client;

    private String name;

    private String text;


    public CommentJPA() {
    }

    /**
     * @param talk
     * @param client
     * @param name
     * @param text
     */
    public CommentJPA(final TalkJPA talk,
                      final ClientJPA client,
                      final String name,
                      final String text) {
        this.talk = talk;
        this.client = client;
        this.name = name;
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    @Override
    public Client getClient() {
        return client;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public Talk getTalk() {
        return talk;
    }
}
