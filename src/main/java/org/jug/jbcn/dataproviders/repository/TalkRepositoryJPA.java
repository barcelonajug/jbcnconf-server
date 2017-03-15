package org.jug.jbcn.dataproviders.repository;


import org.jug.jbcn.dataproviders.model.TalkJPA;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mkbrv on 08/02/2017.
 */
public interface TalkRepositoryJPA extends CrudRepository<TalkJPA, Long> {

}
