package com.mercadolibre.mentoria.poo.ecommerce;

public class Pagamento {

    //Propriedades
    private Pedido pedido;
    public boolean confirmacaoPagamento;
    public TipoPagamento tipoPagamento;

    //Métodos
    public Pedido getPedidoPagamento() {
        return pedido;
    }

    public void setPedidoPagamento(Pedido pedido) {
        this.pedido = pedido;
    }

    public void realizacaoPagamento(Boolean confirmacaoPagamento) {

        if(confirmacaoPagamento == false) {
            System.out.println("Pagamento ainda não realizado!");
        }

        if(confirmacaoPagamento == true) {
            System.out.println("Pagamento realizado com sucesso!");
        }

    }
}
