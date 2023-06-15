package org.example;

public abstract class ProdutoBase {
    private String codigo;
    private String nomeProduto;
    private String descricao;
    private double precoCompra;
    private double precoVenda;
    private double descontoPorcentagemMax;


    // ---- CONSTRUCTOR ----
    public ProdutoBase(String codigo, String nomeProduto, String descricao, double precoCompra, double precoVenda, double descontoPorcentagemMax) {
        this.codigo = codigo;
        this.nomeProduto = nomeProduto;
        this.descricao = descricao;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.descontoPorcentagemMax = descontoPorcentagemMax;
    }
}
