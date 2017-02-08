package org.bcn.jug.jbcnconf.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mkbrv on 08/02/2017.
 */
@SpringBootApplication
@RestController
@RequestMapping("/")
@ComponentScan({"org.bcn.jug.jbcnconf.core.service", "org.bcn.jug.jbcnconf.web", "org.bcn.jug.jbcnconf.core.model"})
@EntityScan("org.bcn.jug.jbcnconf.core.model")
@EnableJpaRepositories("org.bcn.jug.jbcnconf.core.repository")
public class Application {

    public static final String API_PREFIX = "/jbcn/2017";

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping
    private String index() {
        return "JBCN :: Conf :: 2017 :: API";
    }


}
