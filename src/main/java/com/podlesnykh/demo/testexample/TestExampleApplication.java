package com.podlesnykh.demo.testexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.jdbc.init.DataSourceScriptDatabaseInitializer;

@SpringBootApplication
public class TestExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestExampleApplication.class, args);
    }

}
