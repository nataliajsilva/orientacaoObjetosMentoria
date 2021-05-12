package com.mercadolibre.mentoria.poo.ecommerce;

import java.time.LocalDate;

public class Pedido {

    //Propriedades
    private Cliente cliente;
    public LocalDate data;
    private NotaFiscal notaFiscal;
    private static int quantidadePedidos = 0;

    //Construtor
    public Pedido (){
        System.out.println("Criando pedido e somando quantidade de pedidos");
        Pedido.quantidadePedidos++;
    }

    //Métodos
    public Cliente getClientePedido() {
        return cliente;
    }

    public void setClientePedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValorTotalPedido() {
        return notaFiscal.getValorTotal();
    }

    public NotaFiscal getNotaFiscalPedido() {
        return notaFiscal;
    }

    public void setNotaFiscalPedido(NotaFiscal notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public static int getQuantidadePedidos() { return quantidadePedidos; }

}
