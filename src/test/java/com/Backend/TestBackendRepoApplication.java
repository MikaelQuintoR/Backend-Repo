package com.Backend;

import org.springframework.boot.SpringApplication;

public class TestBackendRepoApplication {

    public static void main(String[] args) {
        SpringApplication.from(BackendRepoApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
