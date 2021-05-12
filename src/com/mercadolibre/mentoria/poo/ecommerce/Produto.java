package com.mercadolibre.mentoria.poo.ecommerce;

public class Produto {

    //Propriedades
    public String nome;
    public Categoria categoria;
    private double valor;
    public String fabricante;

    //métodos
    public double getValor() { return valor; }

    public void setValor(double valor) {

        if (valor < 0.0) {
            throw new IllegalArgumentException("O valor do produto não pode ser negativo");
        }
        this.valor = valor;
    }
}

