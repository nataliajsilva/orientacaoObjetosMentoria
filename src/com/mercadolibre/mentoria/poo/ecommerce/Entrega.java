package com.mercadolibre.mentoria.poo.ecommerce;

import java.time.LocalDate;

public class Entrega {

    //Propriedades
    public LocalDate prazoEntrega;
    private Cliente cliente;

    //Métodos
    public Cliente getCliente() { return cliente; }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
