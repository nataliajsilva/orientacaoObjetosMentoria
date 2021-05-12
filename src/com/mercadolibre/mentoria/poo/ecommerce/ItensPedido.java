package com.mercadolibre.mentoria.poo.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class ItensPedido {

    //Propriedades
    private Pedido pedido;
    private List<Produto> produtos = new ArrayList();

    //Métodos
    public Pedido getPedidoItens () { return pedido; }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;

    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }
}
