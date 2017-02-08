package org.bcn.jug.jbcnconf.api.repository;

import org.bcn.jug.jbcnconf.api.domain.Talk;

import java.util.List;

/**
 * Created by mkbrv on 08/02/2017.
 */
public interface TalkRepository<T extends Talk> {

    List<T> findAll();

    T save(final T comment);

    T findOne(final Long id);

    T findByScheduleId(final String scheduleId);

}
