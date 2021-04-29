package com.mercadolibre.mentoria.poo;

import com.mercadolibre.mentoria.poo.escola.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Aluno alunaNatalia = new Aluno();
        alunaNatalia.nome = "Natalia";
        alunaNatalia.setDocumentoAluno(1111111111);
        alunaNatalia.turma = Turma.B1;
        alunaNatalia.grauEnsino = GrauEnsino.Fundamental;

        Professor professorGustavo = new Professor();
        professorGustavo.nome = "Gustavo";
        professorGustavo.setDocumentoProfessor(999999999);

        Avaliacoes avaliacaoMatematica = new Avaliacoes();
        avaliacaoMatematica.nomeAluno = "Natalia";
        LocalDate dataAplicacaoAvaliacao1Matematica = avaliacaoMatematica.dataAplicacao = LocalDate.of(2021, 04, 22);
        avaliacaoMatematica.formatarData(dataAplicacaoAvaliacao1Matematica);
        avaliacaoMatematica.disciplina = Disciplina.Matematica;
        avaliacaoMatematica.nome = "Operações fracionárias";
        avaliacaoMatematica.setNota(-1.0);
        avaliacaoMatematica.nomeProfessor = "Gustavo";
        avaliacaoMatematica.turma = Turma.B1;

        System.out.println(" " + alunaNatalia.nome);
        System.out.println(" " + alunaNatalia.getDocumentoAluno());
        System.out.println(" " + professorGustavo.getDocumentoProfessor());
        System.out.println(" " + avaliacaoMatematica.getNota());

    }
}
