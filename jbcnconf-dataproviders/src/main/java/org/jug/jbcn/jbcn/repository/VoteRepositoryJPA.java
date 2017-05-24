package org.jug.jbcn.jbcn.repository;

import org.jug.jbcn.jbcn.model.VoteJPA;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

/**
 * Created by jguitart on 29/3/17.
 */
public interface VoteRepositoryJPA extends CrudRepository<VoteJPA, Long> {

    Optional<VoteJPA> findByMeetingIdAndDeviceId(String meetingId, String deviceId);

    List<VoteJPA> findAllByMeetingId(String meetingId);

}
