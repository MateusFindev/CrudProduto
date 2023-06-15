package org.example;

import org.example.alimento.Alimento;
import org.example.alimento.EnumUnidadeDeMedida;
import org.example.eletronico.Eletronico;
import org.example.livro.Livro;
import org.example.produto.Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class Instacia {
    private ArrayList<Alimento> alimentos;
    private ArrayList<Livro> livros;
    private ArrayList<Eletronico> eletronicos;
    private ArrayList<Produto> produtos;

    public static ArrayList<Alimento> gerarAlimentos(){
        ArrayList<Alimento> alimentoArrayList = new ArrayList<>();

        alimentoArrayList.add(new Alimento(Global.gerarAleatorioCodigo(),"Arroz", "Plantado e colhido no Japão.",15,20,10,"Cereais","Minda", EnumUnidadeDeMedida.QUILO, 5));

        return alimentoArrayList;
    };

    public static ArrayList<Produto> gerarProduto(){
        ArrayList<Produto> produtoArrayList = new ArrayList<>();

        produtoArrayList.add(new Produto(Global.gerarAleatorioCodigo(),"Papel Higiênico", "Folha Dupla",30.00,45.60,6,"Higiene Pessoal"));

        return produtoArrayList;
    };

    public static ArrayList<Livro> gerarlivro(){
        ArrayList<Livro> livroArrayList = new ArrayList<>();

        livroArrayList.add(new Livro(Global.gerarAleatorioCodigo(),"Alice no País das Maravílhias", "Livro de capa dura",17.63,35.00,15,"Fantasias","Lewis Carroll","Uma menina, um coelho e uma história capazes de fazer qualquer um de nós voltar a sonhar. Alice é despertada de um leve sono ao pé de uma árvore por um coelho peculiar. Uma criatura alva e falante com roupas engraçadas, que consulta seu relógio e reclama do próprio atraso...","Darkside"));

        return livroArrayList;
    };

    public static ArrayList<Eletronico> gerarEletronico(){
        ArrayList<Eletronico> eletronicoArrayList = new ArrayList<>();

        eletronicoArrayList.add(new Eletronico(Global.gerarAleatorioCodigo(),"Liquidificador", "Usado para diversas funções, onde precisa processar algum tipo de alimento.",53.81,89.90,12,"Eletrodomésticos para Cozinha","Philco","Reverse PLQ1300","Vermelho","Altura: 41,90cm, Largura: 20,80cm, Profundidade: 22,70cm, Peso: 2,14Kg"));

        return eletronicoArrayList;
    };

    public static void menuCrud() {
        System.out.println("[ 1 ] - Registrar novo produto");
        System.out.println("[ 2 ] - Visualizar produtos registrados");
        System.out.println("[ 3 ] - Atualizar produtos registrados");
        System.out.println("[ 4 ] - Excluir produtos registrados");
        System.out.print("Escolha uma opção: ");
    }

    public static void selecionarOperacao() {
        Scanner scan = new Scanner(System.in);
        int resposta = scan.nextInt();

        switch (resposta) {
            case 1:
                System.out.println("Em desenvolvimento");
                break;
            case 2:
                System.out.println("Em desenvolvimento");

                break;
            case 3:
                System.out.println("Em desenvolvimento");
                break;
            case 4:
                System.out.println("Em desenvolvimento");
                break;
            default:
                System.out.println("A opção escolhida é inválida! Escolha outra opção: ");
                selecionarOperacao();
                break;
        }
    }



    // ---- CONSTRUCTOR ----


    // ---- GETTERS E SETTERS ----

    public ArrayList<Alimento> getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(ArrayList<Alimento> alimentos) {
        this.alimentos = alimentos;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public ArrayList<Eletronico> getEletronicos() {
        return eletronicos;
    }

    public void setEletronicos(ArrayList<Eletronico> eletronicos) {
        this.eletronicos = eletronicos;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
}
