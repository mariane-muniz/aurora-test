package com.omni.aurora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan({"com.omni.aurora.core.model"})
@EnableJpaRepositories({"com.omni.aurora.core.repository"})
public class AuroraApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuroraApplication.class, args);
    }
}