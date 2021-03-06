package com.mercadolibre.mentoria.poo.escola;

import static com.mercadolibre.mentoria.poo.compartilhado.ValidaorDocumento.isValid;

public class Aluno {

    //Propriedades
    private String nome;
    private String documentoCpf;
    public Turma turma;
    public GrauEnsino grauEnsino;

    //construtor

    public Aluno(String documentoCpf, String nome) {

        if (isValid(documentoCpf) == false){

            throw new IllegalArgumentException("CPF não é válido.");

        } else {
            this.nome = nome;
            this.documentoCpf = documentoCpf;
            System.out.println("CPF é válido.");
        }
    }

    //metódos
    public String getDocumentoAluno() { return documentoCpf; }

    public String getNomeAluno() { return nome; }
}
