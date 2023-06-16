package org.example;

public class Main {
    public static void main(String[] args) {

        // GERANDO INSTACIAS DOS PRODUTOS
        Instancia instancia = new Instancia();
        instancia.setAlimentos(Instancia.gerarAlimentos());
        instancia.setEletronicos(Instancia.gerarEletronico());
        instancia.setLivros(Instancia.gerarlivro());
        instancia.setProdutos(Instancia.gerarProduto());

        // COMEÇANDO A INTERAGIR COM O USUÁRIO ATRAVÉS DO TERMINAL
        System.out.println("Olá Querido Professor Elenilton!");
        Global.menuCrud();
        Global.selecionarOperacaoCrud(instancia);

    }
}