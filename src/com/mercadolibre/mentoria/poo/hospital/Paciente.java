package com.mercadolibre.mentoria.poo.hospital;

import java.time.LocalDate;

import static com.mercadolibre.mentoria.poo.compartilhado.ValidaorDocumento.isValid;

public class Paciente {

    //Propriedades
    private String nome;
    private String documentoCpf;
    public LocalDate dataNascimento;
    public Sexo sexo;
    public TipoSanguineo tipoSanguineo;

    //Contrutor
    public Paciente(String documentoCpf, String nome) {

        if (isValid(documentoCpf) == false){

            throw new IllegalArgumentException("CPF não é válido.");

        } else {
            this.nome = nome;
            this.documentoCpf = documentoCpf;
            System.out.println("CPF é válido.");
        }
    }
    //Metódos
    public String getDocumentoPaciente() { return documentoCpf; }

    public String getNomePaciente() { return nome; }
}
