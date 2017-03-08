package org.bcn.jug.jbcnconf.core.uc;

import org.bcn.jug.jbcnconf.repository.CommentRepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jguitart on 6/3/17.
 */

@Service
public class CommentService {

    @Autowired
    CommentRepositoryJPA commentRepository;

    

}
