package org.example;

public abstract class ProdutoBase implements Vendavel{
    private String codigo;
    private String nomeProduto;
    private String descricao;
    private double precoCompra;
    private double precoVenda;
    private double descontoPorcentagemMax;
    private double estoque;
    private boolean vendavel;


    public String imprimirDadosInicias() {
        return "Codigo Produto: " + codigo + "  |  Nome Produto: " + nomeProduto + "  |  Descricao: " + descricao + "  |  Estoque: "+estoque+
                "  ---  PrecoCompra: " + precoCompra + "  |  Preco Venda: " + precoVenda + "  |  Desconto Porcentagem Máxima: " + descontoPorcentagemMax+"  |  Vendavel: "+vendavel+"\n" ;
    }


    // ---- CONSTRUCTOR ----
    public ProdutoBase(String codigo, String nomeProduto, String descricao, double precoCompra, double precoVenda, double descontoPorcentagemMax, double estoque, boolean vendavel) {
        this.codigo = codigo;
        this.nomeProduto = nomeProduto;
        this.descricao = descricao;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.descontoPorcentagemMax = descontoPorcentagemMax;
        this.estoque = estoque;
        this.vendavel = vendavel;
    }

    // ---- GETTERS E SETTERS ----

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public double getDescontoPorcentagemMax() {
        return descontoPorcentagemMax;
    }

    public void setDescontoPorcentagemMax(double descontoPorcentagemMax) {
        this.descontoPorcentagemMax = descontoPorcentagemMax;
    }

    public double getEstoque() {
        return estoque;
    }

    public void setEstoque(double estoque) {
        this.estoque = estoque;
    }

    public boolean isVendavel() {
        return vendavel;
    }

    public void setVendavel(boolean vendavel) {
        this.vendavel = vendavel;
    }
}
