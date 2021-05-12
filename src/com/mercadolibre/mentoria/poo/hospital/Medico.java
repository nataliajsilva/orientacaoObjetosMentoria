package com.mercadolibre.mentoria.poo.hospital;

import static com.mercadolibre.mentoria.poo.compartilhado.ValidaorDocumento.isValid;

public class Medico {

    //Propriedades
    private String nome;
    private String documentoCpf;
    public long crm;

    //Contrutor
    public Medico(String documentoCpf, String nome) {

        if (isValid(documentoCpf) == false){

            throw new IllegalArgumentException("CPF não é válido.");

        } else {
            this.nome = nome;
            this.documentoCpf = documentoCpf;
            System.out.println("CPF é válido.");
        }
    }
    //Metódos
    public String getDocumentoMedico() { return documentoCpf; }

    public String getNomeMedico() { return nome; }
}
