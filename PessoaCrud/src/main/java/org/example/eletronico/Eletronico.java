package org.example.eletronico;

import org.example.ProdutoBase;

public class Eletronico extends ProdutoBase {
    private String categoriaElemento;
    private String marca;
    private String modelo;
    private String cor;
    private String especificacoes;

    @Override
    public String toString() {
        return imprimirDadosInicias() + "Categoria Eletrônico: " + categoriaElemento + "  |  Marca: " + marca + "  |  Modelo: " + modelo +"  |  Cor: " + cor + "  |  Especificacoes: " + especificacoes;
    }



    // ---- CONSTRUCTOR ----
    public Eletronico(String codigo, String nomeProduto, String descricao, double precoCompra, double precoVenda, double descontoPorcentagemMax,double estoque, boolean vendavel, String categoriaElemento, String marca, String modelo, String cor, String especificacoes) {
        super(codigo, nomeProduto, descricao, precoCompra, precoVenda, descontoPorcentagemMax,estoque,vendavel);
        this.categoriaElemento = categoriaElemento;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.especificacoes = especificacoes;
    }

    // ---- GETTERS E SETTERS ----

    public String getCategoriaElemento() {
        return categoriaElemento;
    }

    public void setCategoriaElemento(String categoriaElemento) {
        this.categoriaElemento = categoriaElemento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getEspecificacoes() {
        return especificacoes;
    }

    public void setEspecificacoes(String especificacoes) {
        this.especificacoes = especificacoes;
    }


}
