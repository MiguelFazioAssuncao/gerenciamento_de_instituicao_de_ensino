package com.miguelfazio.gerenciamento_de_instituicao_de_ensino.model;

import lombok.Data;

import java.util.Date;

@Data
public class Aluno {
private static int idContador = 0;

    private final int ID;
    private String nome;
    private Date dataNascimento;

    public Aluno(String nome, Date dataNascimento) {
        this.ID = getProximoID();
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public static int getProximoID() {
        return ++idContador;
    }
}
