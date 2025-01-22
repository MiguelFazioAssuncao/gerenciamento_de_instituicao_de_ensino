package com.miguelfazio.gerenciamento_de_instituicao_de_ensino.service;

import com.miguelfazio.gerenciamento_de_instituicao_de_ensino.model.Aluno;
import com.miguelfazio.gerenciamento_de_instituicao_de_ensino.model.Curso;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCurso {

    public Curso cadastrarCurso(String nome, String descricao, int cargaHoraria) {
        Curso curso = new Curso(nome, descricao, cargaHoraria);
        Curso.adicionarCurso(curso);
        return curso;
    }

    public List<Curso> consultarCursos() {
        return Curso.getCursos();
    }

    public static Curso buscarPoriD(int id) {
        Curso curso = Curso.buscarPoriD(id);
        if (curso == null) {
            throw new IllegalArgumentException("Curso com ID " + id + " não encontrado.");
        }
        return curso;
    }

    public void realizarMatricula(int idCurso, Aluno aluno) {
        Curso curso = buscarPoriD(idCurso);
        if (aluno == null) {
            throw new IllegalArgumentException("Aluno inválido. Matrícula não pode ser realizada.");
        }
        curso.getAlunosMatriculados().add(aluno);
    }

    public void realizarMatricula(int idCurso, int idAluno) {
        Curso curso = buscarPoriD(idCurso);
        if (curso == null) {
            throw new IllegalArgumentException("Curso inválido. Matrícula não pode ser realizada.");
        }

        Aluno aluno = ServiceAluno.buscarPoriD(idAluno);
        if (aluno == null) {
            throw new IllegalArgumentException("Aluno inválido. Matrícula não pode ser realizada.");
        }

        curso.getAlunosMatriculados().add(aluno);
    }
}
