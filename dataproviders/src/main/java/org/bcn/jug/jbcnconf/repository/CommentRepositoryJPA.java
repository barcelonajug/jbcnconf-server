package org.bcn.jug.jbcnconf.repository;

import org.bcn.jug.jbcnconf.repository.model.CommentJPA;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mkbrv on 08/02/2017.
 */

public interface CommentRepositoryJPA extends CrudRepository<CommentJPA, Long> {

}
