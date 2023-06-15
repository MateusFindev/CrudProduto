package org.example.alimento;

import org.example.ProdutoBase;

public class Alimento extends ProdutoBase {
    private String categoriaAlimento;
    private String marca;
    private EnumUnidadeDeMedida unidadeDeMedida;
    private double quantidade;

    @Override
    public String toString() {
        return categoriaAlimento +"   |   Marca: " + marca +"   |   Quantidade: " + quantidade +" "+ unidadeDeMedida;
    }

    // ---- CONSTRUCTOR ----
    public Alimento(String codigo, String nomeProduto, String descricao, double precoCompra, double precoVenda, double descontoPorcentagemMax, String categoriaAlimento, String marca, EnumUnidadeDeMedida unidadeDeMedida, double quantidade) {
        super(codigo, nomeProduto, descricao, precoCompra, precoVenda, descontoPorcentagemMax);
        this.categoriaAlimento = categoriaAlimento;
        this.marca = marca;
        this.unidadeDeMedida = unidadeDeMedida;
        this.quantidade = quantidade;
    }
}
