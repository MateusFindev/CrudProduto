package org.example.alimento;

import org.example.ProdutoBase;
import org.example.Vendavel;

public class Alimento extends ProdutoBase{
    private String categoriaAlimento;
    private String marca;
    private EnumUnidadeDeMedida unidadeDeMedida;
    private double quantidade;

    @Override
    public String toString() {
        return imprimirDadosInicias() + "Categoria Alimento: "+categoriaAlimento +"   |   Marca: " + marca +"   |   Quantidade: " + quantidade +" "+ unidadeDeMedida;
    }


    // ---- CONSTRUCTOR ----
    public Alimento(String codigo, String nomeProduto, String descricao, double precoCompra, double precoVenda, double descontoPorcentagemMax,double estoque,boolean vendavel, String categoriaAlimento, String marca, EnumUnidadeDeMedida unidadeDeMedida, double quantidade) {
        super(codigo, nomeProduto, descricao, precoCompra, precoVenda, descontoPorcentagemMax, estoque, vendavel);
        this.categoriaAlimento = categoriaAlimento;
        this.marca = marca;
        this.unidadeDeMedida = unidadeDeMedida;
        this.quantidade = quantidade;
    }


    // ---- GETTERS E SETTERS ----

    public String getCategoriaAlimento() {
        return categoriaAlimento;
    }

    public void setCategoriaAlimento(String categoriaAlimento) {
        this.categoriaAlimento = categoriaAlimento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public EnumUnidadeDeMedida getUnidadeDeMedida() {
        return unidadeDeMedida;
    }

    public void setUnidadeDeMedida(EnumUnidadeDeMedida unidadeDeMedida) {
        this.unidadeDeMedida = unidadeDeMedida;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

}
