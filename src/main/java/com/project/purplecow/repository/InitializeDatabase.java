package com.project.purplecow.repository;

import com.project.purplecow.entity.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class InitializeDatabase {

    private static final Logger log = LoggerFactory.getLogger(InitializeDatabase.class);

    /**
     * Inserts mock Item data into the repo. Would be set up as a test in production environment
     * @param repository
     * @return all mock Items in the repo
     */
    @Bean
    CommandLineRunner init(ItemRepository repository) {
        return args -> {
            log.info("Loading Items into database... ");
            repository.save(new Item("Purple Cow"));
            repository.save(new Item("Culture"));
            repository.save(new Item("Create Belonging"));
            repository.save(new Item("Make an Impact"));
            log.info(repository.findAll().toString());
        };
    }
}
