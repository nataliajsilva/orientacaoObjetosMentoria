package com.mercadolibre.mentoria.poo.ecommerce;

public class NotaFiscal {

    //Propriedades
    private Pedido pedido;
    private double valorTotal;

    //Métodos
    public Pedido getPedidoNotaFiscal() {
        return pedido;
    }

    public void setPedidoNotaFiscal(Pedido pedido) {
        this.pedido = pedido;
    }

    public double getValorTotal() { return valorTotal; }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

}
