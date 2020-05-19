package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author T.Menad
 */
/**
 * @author MENAD
 */
@SpringBootApplication(scanBasePackages = "com.*")
@EnableAutoConfiguration
@EnableWebMvc
@ComponentScan({"com.*","core.com.*" })
@EnableJpaRepositories({"core.com.*","com.*" })
@EnableMongoRepositories({"core.com.*","com.*" })
@EntityScan({"core.com.*" ,"com.*"})

public class Application {

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }
}