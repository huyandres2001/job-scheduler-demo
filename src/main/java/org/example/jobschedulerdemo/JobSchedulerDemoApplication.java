package org.example.jobschedulerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class JobSchedulerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JobSchedulerDemoApplication.class, args);
    }

}
