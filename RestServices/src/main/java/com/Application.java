package com;



import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.search.jpa.FullTextEntityManager;
import org.hibernate.search.jpa.Search;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author T.Menad
 */
/**
 * @author MENAD
 */
@SpringBootApplication(scanBasePackages = "com.*")
@EnableAutoConfiguration
@ComponentScan({"com.*","core.com.*" })
@EnableJpaRepositories({"core.com.*","com.*" })
@EnableMongoRepositories({"core.com.*","com.*" })
@EntityScan({"core.com.*" ,"com.*"})

public class Application implements CommandLineRunner{

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @PersistenceContext
    private EntityManager entityManager;

    /**
     * @param args
     * @throws Exception
     */
    @Transactional
    @Override
    public void run(String... args) throws Exception {
        FullTextEntityManager fullTextEntityManager = Search.getFullTextEntityManager(entityManager);
      fullTextEntityManager.createIndexer().startAndWait();
        
    }
}