package org.bcn.jug.jbcnconf.repository;


import org.bcn.jug.jbcnconf.repository.model.TalkJPA;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mkbrv on 08/02/2017.
 */
public interface TalkRepositoryJPA extends CrudRepository<TalkJPA, Long> {

}
