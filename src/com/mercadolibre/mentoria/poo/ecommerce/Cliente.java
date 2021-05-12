package com.mercadolibre.mentoria.poo.ecommerce;

import java.time.LocalDate;

import static com.mercadolibre.mentoria.poo.compartilhado.ValidaorDocumento.isValid;
import static com.mercadolibre.mentoria.poo.compartilhado.ValidarEmail.isValidEmailAddressRegex;

public class Cliente {

    //Propriedades
    private String nome;
    private String documentoCpf;
    public String apelido;
    public LocalDate dataNascimento;
    private String email;
    private Estado estado;
    private String cidade;
    private String endereco;
    public boolean ativo;

    //Construtor
    public Cliente(String documentoCpf, String nome) {

        if (isValid(documentoCpf) == false){

            throw new IllegalArgumentException("CPF não é válido.");

        } else {
            this.nome = nome;
            this.documentoCpf = documentoCpf;
            System.out.println("CPF é válido.");
        }
    }
    //Métodos
    public String getDocumentoCliente() { return documentoCpf; }

    public Estado getEstadoCliente() { return estado; }

    public String getCidadeCliente() { return cidade; }

    public String getEnderecoCliente() { return endereco; }

    public String getNomeCliente() { return nome; }

    public String getEmail() { return email; }

    public void setEstadoCliente(Estado estado) {
        this.estado = estado;
    }

    public void setCidadeCliente(String cidade) {
        this.cidade = cidade;
    }

    public void setEnderecoCliente(String endereco) {
        this.endereco = endereco;
    }

    public void setEmail(String email){

        if (isValidEmailAddressRegex(email) == false){
            throw new IllegalArgumentException("Email não é válido.");
        } else {
            this.email = email;
            System.out.println("Email é válido.");
        }
    }
}
