package com.treinamento.voffice.alunoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AlunoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlunoServiceApplication.class, args);
    }
}
