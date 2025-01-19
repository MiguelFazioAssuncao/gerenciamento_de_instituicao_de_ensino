package com.miguelfazio.gerenciamento_de_instituicao_de_ensino.model;

import lombok.Data;

import java.util.UUID;

@Data
public class Curso {
    private static int idContador = 0;

    private final int ID;
    private String nome;
    private String descricao;
    private int cargaHoraria;

    public Curso(String nome, String descricao, int cargaHoraria) {
        this.ID = getProximoID();
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    public static int getProximoID() {
        return idContador++;
    }

}
