package com.miguelfazio.gerenciamento_de_instituicao_de_ensino.controller;

import com.miguelfazio.gerenciamento_de_instituicao_de_ensino.model.Aluno;
import com.miguelfazio.gerenciamento_de_instituicao_de_ensino.service.ServiceAluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class ControllerAluno {

    @Autowired
    private ServiceAluno serviceAluno;

    @PostMapping("/cadastrar")
    public Aluno cadastrarAluno(@RequestBody Aluno aluno) {
        return serviceAluno.cadastrarAluno(aluno.getNome(), aluno.getDataNascimento());
    }

    @GetMapping("/listar")
    public List<Aluno> consultarAlunos() {
        return serviceAluno.consultarAlunos();
    }
}
