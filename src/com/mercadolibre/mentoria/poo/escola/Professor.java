package com.mercadolibre.mentoria.poo.escola;

import static com.mercadolibre.mentoria.poo.compartilhado.ValidaorDocumento.isValid;

public class Professor {

    //Propriedades
    private String nome;
    private String documentoCpf;

    //Contrutor
    public Professor(String documentoCpf, String nome) {

        if (isValid(documentoCpf) == false){

            throw new IllegalArgumentException("CPF não é válido.");

        } else {
            this.nome = nome;
            this.documentoCpf = documentoCpf;
            System.out.println("CPF é válido.");
        }
    }
    //Metódos
    public String getDocumentoProfessor() { return documentoCpf; }

    public String getNomeProfessor() { return nome; }
}
