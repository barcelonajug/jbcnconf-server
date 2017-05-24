package org.jug.jbcn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jguitart on 24/5/17.
 */
@RestController
@RequestMapping(RouterConsts.API_PREFIX + "/echo")
public class EchoController {

    @RequestMapping(path = "", method = RequestMethod.GET)
    public String ping() {
        return "Received " + System.currentTimeMillis();
    }

}
