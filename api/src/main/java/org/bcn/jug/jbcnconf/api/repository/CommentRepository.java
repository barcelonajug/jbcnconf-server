package org.bcn.jug.jbcnconf.api.repository;

import org.bcn.jug.jbcnconf.api.domain.Comment;
import org.bcn.jug.jbcnconf.api.domain.Talk;

import java.util.List;

/**
 * Created by mkbrv on 08/02/2017.
 */
public interface CommentRepository<T extends Comment> {

    List<T> findAll();

    List<T> findByTalk(final Talk talk);

    T save(final T comment);


}
