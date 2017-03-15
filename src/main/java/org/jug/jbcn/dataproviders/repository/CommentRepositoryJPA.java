package org.jug.jbcn.dataproviders.repository;


import org.jug.jbcn.dataproviders.model.CommentJPA;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by mkbrv on 08/02/2017.
 */

public interface CommentRepositoryJPA extends CrudRepository<CommentJPA, Long> {

    List<CommentJPA> findByTalkId(String talkId);

    CommentJPA findByTalkIdAndDeviceId(String talkId, String deviceId);
}
