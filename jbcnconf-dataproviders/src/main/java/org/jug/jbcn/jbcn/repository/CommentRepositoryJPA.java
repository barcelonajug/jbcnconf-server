package org.jug.jbcn.jbcn.repository;


import org.jug.jbcn.jbcn.model.CommentJPA;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by mkbrv on 08/02/2017.
 */

public interface CommentRepositoryJPA extends org.springframework.data.mongodb.repository.MongoRepository<CommentJPA, Long> {

    List<CommentJPA> findByTalkId(String talkId);

    CommentJPA findByTalkIdAndDeviceId(String talkId, String deviceId);

    List<CommentJPA> findAllByTalkId(String talkId, Sort sort);
}
