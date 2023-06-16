package org.example;

import org.example.alimento.Alimento;
import org.example.eletronico.Eletronico;
import org.example.livro.Livro;
import org.example.produto.Produto;

import java.util.Random;
import java.util.Scanner;

public class Global {
    public static String gerarAleatorioCodigo(){
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            int digito = random.nextInt(10);
            sb.append(digito);
        }

        String numeroAleatorio = sb.toString();
        return numeroAleatorio;
    }

    public static int gerarAleatorio0a4 () {
        Random random = new Random();
        int numero = random.nextInt(0,5);
        return numero;
    }

    public static void menuCrud() {
        System.out.println("\n[ 1 ] - Registrar novo produto");
        System.out.println("[ 2 ] - Visualizar produtos registrados");
        System.out.println("[ 3 ] - Atualizar produtos registrados");
        System.out.println("[ 4 ] - Excluir produtos registrados");
        System.out.println("[ 5 ] - Verificar se o produto é vendável");
        System.out.print("Escolha uma opção: ");
    }

    public static void selecionarOperacaoCrud(Instancia instancia) {
        Scanner scan = new Scanner(System.in);
        int resposta = scan.nextInt();

        switch (resposta) {
            case 1:
                menuTipoProduto();
                selecionarAdicionar(instancia);
                menuCrud();
                selecionarOperacaoCrud(instancia);
                break;
            case 2:
                menuTipoProduto();
                selecionarVisualizacao(instancia);
                menuCrud();
                selecionarOperacaoCrud(instancia);
                break;
            case 3:
                menuTipoProduto();
                selecionarEditar(instancia);
                menuCrud();
                selecionarOperacaoCrud(instancia);
                break;
            case 4:
                menuTipoProduto();
                selecionarExcluir(instancia);
                menuCrud();
                selecionarOperacaoCrud(instancia);
                break;
            case 5:
                menuVendavel();
                selecionarMenuVendavel(instancia);
                break;
            default:
                System.out.println("A opção escolhida é inválida! Escolha outra opção: ");
                selecionarOperacaoCrud(instancia);
                break;
        }
    }

    public static void menuTipoProduto(){
        System.out.println("\nQual dos tipos de produtos?");
        System.out.println("[ 1 ] - Livros");
        System.out.println("[ 2 ] - Eletrônicos");
        System.out.println("[ 3 ] - Alimentos");
        System.out.println("[ 4 ] - Outros Produtos");
        System.out.print("Escolha uma opção: ");
    }

    public static void menuVendavel(){
        System.out.println("\nGostaria de escolher o produto de qual forma");
        System.out.println("[ 1 ] - Procurar através do código do produto");
        System.out.println("[ 2 ] - Procurar através das listas de produtos");
        System.out.print("Escolha uma opção: ");
    }
    public static void selecionarVisualizacao(Instancia instancia){
        Scanner scan = new Scanner(System.in);
        int resposta = scan.nextInt();

        switch (resposta) {
            case 1: //LIVROS
                Instancia.exibirProdutos(instancia.getLivros());
                break;
            case 2: //ELETRÔNICOS
                Instancia.exibirProdutos(instancia.getEletronicos());
                break;
            case 3: //ALIMENTOS
                Instancia.exibirProdutos(instancia.getAlimentos());
                break;
            case 4: //OUTROS PRODUTOS
                Instancia.exibirProdutos(instancia.getProdutos());
                break;
            default:
                System.out.println("A opção escolhida é inválida! Escolha outra opção: ");
                selecionarVisualizacao(instancia);
                break;
        }
    }

    public static void selecionarAdicionar(Instancia instancia) {
        Scanner scan = new Scanner(System.in);
        int resposta = scan.nextInt();

        System.out.println("\n--- Adicionando Produto ---\n");
        System.out.print("Nome: ");
        String nome = scan.next();
        System.out.print("Descrição: ");
        String descricao = scan.next();
        System.out.print("Preço de compra: ");
        double precoDeCompra = scan.nextDouble();
        System.out.print("Preço de Venda: ");
        double precoDeVenda = scan.nextDouble();
        System.out.print("Máximo desconto permitido (%): ");
        double maxDesconto = scan.nextDouble();
        System.out.print("Estoque disponível: ");
        double estoque = scan.nextDouble();


        switch (resposta) {
            case 1: //LIVROS
                Livro livro = Instancia.criarLivro(nome,descricao,precoDeCompra,precoDeCompra,maxDesconto,estoque);
                instancia.setAddLivro(livro);
                break;
            case 2: //ELETRÔNICOS
                Eletronico eletronico = Instancia.criarEletronico(nome,descricao,precoDeCompra,precoDeCompra,maxDesconto,estoque);
                instancia.setAddEletronico(eletronico);
                break;
            case 3: //ALIMENTOS
                Alimento alimento = Instancia.criarAlimento(nome,descricao,precoDeCompra,precoDeVenda,maxDesconto,estoque);
                instancia.setAddAlimentos(alimento);

                break;
            case 4://OUTROS PRODUTOS
                Produto produto = Instancia.criarProduto(nome,descricao,precoDeCompra,precoDeVenda,maxDesconto,estoque);
                instancia.setAddProduto(produto);
                break;
            default:
                System.out.print("A opção escolhida é inválida! Escolha outra opção: ");
                selecionarAdicionar(instancia);
                break;
        }
    }

    public static void selecionarEditar(Instancia instancia) {
        Scanner scan = new Scanner(System.in);
        int resposta = scan.nextInt();

        switch (resposta) {
            case 1: //LIVROS
                Instancia.exibirProdutos(instancia.getLivros());
                Instancia.editarLivro(instancia.getLivros().get(Instancia.selecionarProdutoParaEditar(instancia.getLivros())));
                break;
            case 2: //ELETRÔNICOS
                Instancia.exibirProdutos(instancia.getEletronicos());
                Instancia.editarEletronico(instancia.getEletronicos().get(Instancia.selecionarProdutoParaEditar(instancia.getEletronicos())));
                break;
            case 3: //ALIMENTOS
                Instancia.exibirProdutos(instancia.getAlimentos());
                Instancia.editarAlimento(instancia.getAlimentos().get(Instancia.selecionarProdutoParaEditar(instancia.getAlimentos())));
                break;
            case 4: //OUTROS PRODUTOS
                Instancia.exibirProdutos(instancia.getProdutos());
                Instancia.editarProduto(instancia.getProdutos().get(Instancia.selecionarProdutoParaEditar(instancia.getProdutos())));
                break;
            default:
                System.out.println("A opção escolhida é inválida! Escolha outra opção: ");
                selecionarVisualizacao(instancia);
                break;
        }
    }

    public static void selecionarExcluir(Instancia instancia) {
        Scanner scan = new Scanner(System.in);
        int resposta = scan.nextInt();

        switch (resposta) {
            case 1: //LIVROS
                Instancia.exibirProdutos(instancia.getLivros());
                Instancia.excluirProdutos(Instancia.selecionarProdutoParaEditar(instancia.getLivros()), instancia.getLivros());
                break;
            case 2: //ELETRÔNICOS
                Instancia.exibirProdutos(instancia.getEletronicos());
                Instancia.excluirProdutos(Instancia.selecionarProdutoParaEditar(instancia.getEletronicos()), instancia.getEletronicos());
                break;
            case 3: //ALIMENTOS
                Instancia.exibirProdutos(instancia.getAlimentos());
                Instancia.excluirProdutos(Instancia.selecionarProdutoParaEditar(instancia.getAlimentos()), instancia.getAlimentos());
                break;
            case 4: //OUTROS PRODUTOS
                Instancia.exibirProdutos(instancia.getProdutos());
                Instancia.excluirProdutos(Instancia.selecionarProdutoParaEditar(instancia.getProdutos()), instancia.getProdutos());
                break;
            default:
                System.out.println("A opção escolhida é inválida! Escolha outra opção: ");
                selecionarExcluir(instancia);
                break;
        }
    }

    public static void selecionarMenuVendavel (Instancia instancia) {
        Scanner scan = new Scanner(System.in);
        int resposta = scan.nextInt();

        switch (resposta) {
            case 1:
                break;
            case 2:
                menuTipoProduto();
                selecionarVendavel(instancia);
                break;
            default:
                System.out.println("A opção escolhida é inválida! Escolha outra opção: ");
                selecionarMenuVendavel(instancia);
                break;
        }
    }

    public static void selecionarVendavel (Instancia instancia) {
        Scanner scan = new Scanner(System.in);
        int resposta = scan.nextInt();

        switch (resposta) {
            case 1: //LIVROS
                Instancia.exibirProdutos(instancia.getLivros());
                Instancia.definirVendavel(Instancia.selecionarProdutoParaEditar(instancia.getLivros()), instancia.getLivros());
                break;
            case 2: //ELETRÔNICOS
                Instancia.exibirProdutos(instancia.getEletronicos());
                Instancia.definirVendavel(Instancia.selecionarProdutoParaEditar(instancia.getEletronicos()), instancia.getEletronicos());
                break;
            case 3: //ALIMENTOS
                Instancia.exibirProdutos(instancia.getAlimentos());
                Instancia.definirVendavel(Instancia.selecionarProdutoParaEditar(instancia.getAlimentos()), instancia.getAlimentos());
                break;
            case 4: //OUTROS PRODUTOS
                Instancia.exibirProdutos(instancia.getProdutos());
                Instancia.definirVendavel(Instancia.selecionarProdutoParaEditar(instancia.getProdutos()), instancia.getProdutos());
                break;
            default:
                System.out.println("A opção escolhida é inválida! Escolha outra opção: ");
                selecionarExcluir(instancia);
                break;
        }
    }

}
