package com.mercadolibre.mentoria.poo.ecommerce;

import static com.mercadolibre.mentoria.poo.compartilhado.ValidaorDocumento.isValid;

public class Transportadora {

    //Propriedades
    private String nome;
    private String documentoCnpj;
    public boolean ativo;

    //Construtor
    public Transportadora(String documentoCnpj, String nome) {

        if (isValid(documentoCnpj) == false){

            throw new IllegalArgumentException("CNPJ não é válido.");

        } else {
            this.nome = nome;
            this.documentoCnpj = documentoCnpj;
            System.out.println("CNPJ é válido.");
        }
    }
    //Métodos
    public String getCnpjTransportadora() { return documentoCnpj; }

    public String getNomeTransportadora() { return nome; }
}
