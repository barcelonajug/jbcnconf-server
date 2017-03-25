package org.jug.jbcn.jbcn.repository;

import org.jug.jbcn.jbcn.model.PushTokenJPA;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by jguitart on 25/3/17.
 */
public interface PushTokenRepositoryJPA extends CrudRepository<PushTokenJPA, Long> {

    Optional<PushTokenJPA> findByDeviceId(String deviceId);

}
