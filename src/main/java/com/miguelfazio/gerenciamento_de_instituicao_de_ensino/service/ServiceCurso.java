package com.miguelfazio.gerenciamento_de_instituicao_de_ensino.service;

import com.miguelfazio.gerenciamento_de_instituicao_de_ensino.model.Curso;

import java.util.List;

public class ServiceCurso {

    public Curso cadastrarCurso(String nome, String descricao, int cargaHoraria) {
        Curso curso = new Curso(nome, descricao, cargaHoraria);
        Curso.adicionarCurso(curso);
        return curso;
    }

    public List<Curso> consultarCursos() {
        return Curso.getCursos();
    }
}
