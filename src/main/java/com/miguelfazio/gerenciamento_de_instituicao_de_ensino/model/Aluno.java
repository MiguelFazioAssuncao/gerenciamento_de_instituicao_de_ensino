package com.miguelfazio.gerenciamento_de_instituicao_de_ensino.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class Aluno {
private static int idContador = 0;
private static List<Aluno> alunos = new ArrayList<>();

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

    public static List<Aluno> getAlunos() {
        return new ArrayList<>(alunos);
    }

    public static void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public static Aluno buscarPoriD(int id) {
        return alunos.stream()
                .filter(curso -> curso.getID() == id)
                .findFirst()
                .orElse(null);
    }
}
