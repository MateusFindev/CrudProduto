package org.example.eletronico;

import org.example.ProdutoBase;

public class Eletronico extends ProdutoBase {
    private String categoriaElemento;
    private String marca;
    private String modelo;
    private String cor;
    private String especificacoes;



    // ---- CONSTRUCTOR ----

    public Eletronico(String codigo, String nomeProduto, String descricao, double precoCompra, double precoVenda, double descontoPorcentagemMax, String categoriaElemento, String marca, String modelo, String cor, String especificacoes) {
        super(codigo, nomeProduto, descricao, precoCompra, precoVenda, descontoPorcentagemMax);
        this.categoriaElemento = categoriaElemento;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.especificacoes = especificacoes;
    }
}
