package org.example;

public class Main {
    public static void main(String[] args) {

        // GERANDO INSTACIAS DOS PRODUTOS
        Instacia instacia = new Instacia();
        instacia.setAlimentos(Instacia.gerarAlimentos());
        instacia.setEletronicos(Instacia.gerarEletronico());
        instacia.setLivros(Instacia.gerarlivro());
        instacia.setProdutos(Instacia.gerarProduto());

        // COMEÇANDO A INTERAGIR COM O USUÁRIO ATRAVÉS DO TERMINAL
        System.out.println("Olá Querido Professor Elenilton!\n");
        Instacia.menuCrud();
        Instacia.selecionarOperacao();

    }
}