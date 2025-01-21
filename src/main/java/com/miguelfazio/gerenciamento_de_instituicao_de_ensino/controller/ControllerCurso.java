package com.miguelfazio.gerenciamento_de_instituicao_de_ensino.controller;

import com.miguelfazio.gerenciamento_de_instituicao_de_ensino.model.Curso;
import com.miguelfazio.gerenciamento_de_instituicao_de_ensino.service.ServiceCurso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso")
public class ControllerCurso {

    @Autowired
    ServiceCurso serviceCurso;

    @PostMapping("/cadastrar")
    public Curso cadastrarCurso(@RequestBody Curso curso) {
        return serviceCurso.cadastrarCurso(curso.getNome(), curso.getDescricao(), curso.getCargaHoraria());
    }

    @GetMapping("/listar")
    public List<Curso> consultarCurso() {
        return serviceCurso.consultarCursos();
    }
}
