package com.example.vue_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class VueDemoApplication {

    public static void main(String[] args) {

        // server.port not working in application.prop file hence i'm setting it up here
        SpringApplication application = new SpringApplication(VueDemoApplication.class);
        application.setDefaultProperties(Collections
            .singletonMap("server.port","8181"));
        application.run(args);
    }

}
