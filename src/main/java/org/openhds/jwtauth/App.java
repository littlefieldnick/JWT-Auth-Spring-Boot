package org.openhds.jwtauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.openhds.jwtauth.*")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
