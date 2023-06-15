package org.example.produto;

import org.example.ProdutoBase;

public class Produto extends ProdutoBase {
    private String tipoProduto;

    // ---- CONSTRUCTOR ----

    public Produto(String codigo, String nomeProduto, String descricao, double precoCompra, double precoVenda, double descontoPorcentagemMax, String tipoProduto) {
        super(codigo, nomeProduto, descricao, precoCompra, precoVenda, descontoPorcentagemMax);
        this.tipoProduto = tipoProduto;
    }
}
