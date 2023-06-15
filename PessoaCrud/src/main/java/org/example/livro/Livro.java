package org.example.livro;

import org.example.ProdutoBase;

public class Livro extends ProdutoBase {
    private String categoriaLivro;
    private String autor;
    private String sinopse;
    private String editora;


    // ---- CONSTRUCTOR ----

    public Livro(String codigo, String nomeProduto, String descricao, double precoCompra, double precoVenda, double descontoPorcentagemMax, String categoriaLivro, String autor, String sinopse, String editora) {
        super(codigo, nomeProduto, descricao, precoCompra, precoVenda, descontoPorcentagemMax);
        this.categoriaLivro = categoriaLivro;
        this.autor = autor;
        this.sinopse = sinopse;
        this.editora = editora;
    }
}
