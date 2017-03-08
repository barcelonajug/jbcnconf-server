package org.bcn.jug.jbcnconf.repository;


import org.bcn.jug.jbcnconf.repository.model.DeviceJPA;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mkbrv on 08/02/2017.
 */
public interface DeviceRepositoryJPA extends CrudRepository<DeviceJPA, Long> {

}
