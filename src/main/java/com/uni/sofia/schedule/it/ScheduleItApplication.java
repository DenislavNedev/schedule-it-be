package com.uni.sofia.schedule.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.uni.sofia.schedule.it.repositories")
@SpringBootApplication
public class ScheduleItApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScheduleItApplication.class, args);
    }

}
