package org.bcn.jug.jbcnconf.core.repository;

import org.bcn.jug.jbcnconf.api.repository.TalkRepository;
import org.bcn.jug.jbcnconf.core.model.TalkJPA;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mkbrv on 08/02/2017.
 */
public interface TalkRepositoryJPA extends TalkRepository<TalkJPA>, CrudRepository<TalkJPA, Long> {

}
