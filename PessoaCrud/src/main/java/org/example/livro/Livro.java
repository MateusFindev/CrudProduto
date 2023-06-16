package org.example.livro;

import org.example.ProdutoBase;

public class Livro extends ProdutoBase {
    private String categoriaLivro;
    private String autor;
    private String sinopse;
    private String editora;

    @Override
    public String toString() {
        return imprimirDadosInicias() + "Categoria Livro: " + categoriaLivro + "  |  Autor: " + autor + "  |  Editora: " + editora + "\nSinopse: " + sinopse;
    }

    // ---- CONSTRUCTOR ----
    public Livro(String codigo, String nomeProduto, String descricao, double precoCompra, double precoVenda, double descontoPorcentagemMax,double estoque, boolean vendavel,String categoriaLivro, String autor, String sinopse, String editora) {
        super(codigo, nomeProduto, descricao, precoCompra, precoVenda, descontoPorcentagemMax,estoque,vendavel);
        this.categoriaLivro = categoriaLivro;
        this.autor = autor;
        this.sinopse = sinopse;
        this.editora = editora;
    }

    // ---- GETTER E SETTERS ----

    public String getCategoriaLivro() {
        return categoriaLivro;
    }

    public void setCategoriaLivro(String categoriaLivro) {
        this.categoriaLivro = categoriaLivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }


}
