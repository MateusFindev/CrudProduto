package org.example.produto;

import org.example.ProdutoBase;

public class Produto extends ProdutoBase {
    private String tipoProduto;

    @Override
    public String toString() {
        return imprimirDadosInicias() + "Tipo Produto: " + tipoProduto;
    }

    // ---- CONSTRUCTOR ----
    public Produto(String codigo, String nomeProduto, String descricao, double precoCompra, double precoVenda, double descontoPorcentagemMax,double estoque,boolean vendavel, String tipoProduto) {
        super(codigo, nomeProduto, descricao, precoCompra, precoVenda, descontoPorcentagemMax,estoque,vendavel);
        this.tipoProduto = tipoProduto;
    }

    // ---- GETTERS E SETTERS ----

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }


}
