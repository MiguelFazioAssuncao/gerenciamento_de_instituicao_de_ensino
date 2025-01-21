package com.miguelfazio.gerenciamento_de_instituicao_de_ensino.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Curso {
    private static int idContador = 0;
    private static List<Curso> cursos = new ArrayList<>();
    private List<Aluno> alunosMatriculados = new ArrayList<>();

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

    public static List<Curso> getCursos() {
        return new ArrayList<>(cursos);
    }

    public static void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public static Curso buscarPoriD(int id) {
        return cursos.stream()
                .filter(curso -> curso.getID() == id)
                .findFirst()
                .orElse(null);
    }

    public void realizarMatricula(int id, Aluno aluno) {
        Curso curso = buscarPoriD(id);
        if (curso == null) {
            throw new IllegalArgumentException("Aluno inválido. Matrícula não pode ser realizada.");
        }
        curso.getAlunosMatriculados().add(aluno);
    }
}
