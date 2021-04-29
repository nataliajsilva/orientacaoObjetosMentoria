package com.mercadolibre.mentoria.poo.escola;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Avaliacoes {

    //Propriedades
    public String nome;
    private Double nota;
    public LocalDate dataAplicacao;
    public String nomeProfessor;
    public Turma turma;
    public String nomeAluno;
    public Disciplina disciplina;

    //Metódos
    public double getNota() {
        return nota;
    }

    public void setNota(Double nota) {

        if (nota > 10.0) {
            System.out.printf("A nota da avaliação precisa ser entre 0 e 10");
        }

        this.nota = nota;

    }

    public void formatarData(LocalDate dataAplicacao) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = dataAplicacao.format(formatter);

        System.out.println("data aplicacao formatada: " + dataFormatada);
    }
}
