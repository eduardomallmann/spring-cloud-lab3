package com.treinamento.voffice.disciplinaservice;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DisciplinaDTO {

    String nome;
    Integer cargaHoraria;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    Date dataInicio;
    List<String> alunosMatriculados;

    public DisciplinaDTO() {
    }

    public DisciplinaDTO(String nome, Integer cargaHoraria, Date dataInicio) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.dataInicio = dataInicio;
        alunosMatriculados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public List<String> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public void setAlunosMatriculados(List<String> alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }
}
