package com.treinamento.voffice.disciplinaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DisciplinaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DisciplinaServiceApplication.class, args);
    }
}
