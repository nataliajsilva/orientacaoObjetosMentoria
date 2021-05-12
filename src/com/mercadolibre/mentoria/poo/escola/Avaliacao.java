package com.mercadolibre.mentoria.poo.escola;

import com.mercadolibre.mentoria.poo.hospital.Medico;

import java.time.LocalDate;

public class Avaliacao {

    //Propriedades
    public String nome;
    private Double nota;
    public LocalDate dataAplicacao;
    private Professor nomeProfessor;
    public Turma turma;
    private Aluno nomeAluno;
    public Disciplina disciplina;

    //Metódos
    public Professor getProfessorAvaliacao() {
        return  nomeProfessor;
    }

    public void setProfessorAvaliacao(Professor nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public Aluno getAlunoAvaliacao() {
        return  nomeAluno;
    }

    public void setAlunoAvaliacao(Aluno nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(Double nota) {

        if (nota < 0 || nota > 10.0) {
            throw new IllegalArgumentException("A nota da avaliação precisa ser entre 0 e 10");
        }

        this.nota = nota;

    }

}
