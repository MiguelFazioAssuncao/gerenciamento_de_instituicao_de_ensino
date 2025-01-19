package com.miguelfazio.gerenciamento_de_instituicao_de_ensino.model;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class Aluno {

    private final UUID ID;

    private String nome;
    private Date dataNascimento;

    public Aluno(String nome, Date dataNascimento) {
        this.ID = UUID.randomUUID();
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
}
