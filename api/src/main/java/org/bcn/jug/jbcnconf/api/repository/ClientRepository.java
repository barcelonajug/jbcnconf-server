package org.bcn.jug.jbcnconf.api.repository;

import org.bcn.jug.jbcnconf.api.domain.Client;

import java.util.List;

/**
 * Created by mkbrv on 08/02/2017.
 */
public interface ClientRepository<T extends Client> {

    List<T> findAll();

    T findByPhoneId(final String phoneId);

    T save(final T client);

}
