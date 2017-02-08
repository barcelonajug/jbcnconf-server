package org.bcn.jug.jbcnconf.core.repository;

import org.bcn.jug.jbcnconf.api.repository.ClientRepository;
import org.bcn.jug.jbcnconf.core.model.ClientJPA;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mkbrv on 08/02/2017.
 */
public interface ClientRepositoryJPA extends ClientRepository<ClientJPA>, CrudRepository<ClientJPA, Long> {

}
