package org.bcn.jug.jbcnconf.core.repository;

import org.bcn.jug.jbcnconf.api.repository.CommentRepository;
import org.bcn.jug.jbcnconf.core.model.comment.CommentJPA;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by mkbrv on 08/02/2017.
 */

public interface CommentRepositoryJPA extends CommentRepository<CommentJPA>, CrudRepository<CommentJPA, Long> {

}
