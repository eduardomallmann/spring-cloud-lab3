package com.treinamento.voffice.disciplinaservice;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("disciplina")
public class DisciplinaController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public ResponseEntity<DisciplinaDTO> getDisciplina() {

        DisciplinaDTO disciplinaDTO = new DisciplinaDTO("Workshop Microservices",
                40, new Date(2018, 06, 05));

        disciplinaDTO.getAlunosMatriculados().addAll(getAlunos());

        return ResponseEntity.ok(disciplinaDTO);

    }

    private List<String> getAlunos() {

        ResponseEntity<JsonNode> alunos = restTemplate.getForEntity("http://aluno-service/aluno", JsonNode.class);

        return alunos.getBody().findValuesAsText("nome");
    }

}
