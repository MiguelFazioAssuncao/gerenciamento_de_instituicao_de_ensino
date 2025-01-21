package com.miguelfazio.gerenciamento_de_instituicao_de_ensino.service;

import com.miguelfazio.gerenciamento_de_instituicao_de_ensino.model.Aluno;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ServiceAlunos {

    public Aluno cadastrarAlunos(String nome, Date dataNascimento) {
        Aluno aluno = new Aluno(nome, dataNascimento);
        Aluno.adicionarAluno(aluno);
        return aluno;
    }

    public List<Aluno> consultarAlunos() {
        return Aluno.getAlunos();
    }
}
