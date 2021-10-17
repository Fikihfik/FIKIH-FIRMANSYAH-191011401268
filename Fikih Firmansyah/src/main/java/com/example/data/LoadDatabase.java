package com.example.data;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(DataRepository repository) {
        return args -> {
            log.info("Preloading" + repository.save(new Data(101011L, "Pendaki","Rian",
                    "2017", "50", 430000L )));
            log.info("Preloading" + repository.save(new Data(101012L, "Puncak Gunung", "Dian",
                    "2003", "60", 350000L )));
            log.info("Preloading" + repository.save(new Data(10101011L, "Gunung Merapi", "Abdul",
                    "2009", "80", 250000L )));
        };
    }
}
