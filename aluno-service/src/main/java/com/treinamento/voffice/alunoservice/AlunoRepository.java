package com.treinamento.voffice.alunoservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "/aluno")
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
