package org.example;

import com.sun.source.tree.IfTree;
import org.example.alimento.Alimento;
import org.example.alimento.EnumUnidadeDeMedida;
import org.example.eletronico.Eletronico;
import org.example.livro.Livro;
import org.example.produto.Produto;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Scanner;

public class Instancia {
    private ArrayList<Alimento> alimentos;
    private ArrayList<Livro> livros;
    private ArrayList<Eletronico> eletronicos;
    private ArrayList<Produto> produtos;

    public static ArrayList<Alimento> gerarAlimentos(){
        ArrayList<Alimento> alimentoArrayList = new ArrayList<>();

        alimentoArrayList.add(new Alimento(Global.gerarAleatorioCodigo(),"Arroz", "Plantado e colhido no Japão.",
                15,20,10,Global.gerarAleatorio0a4(),true,"Cereais",
                "Minda", EnumUnidadeDeMedida.QUILO, 5));

        alimentoArrayList.add(new Alimento(Global.gerarAleatorioCodigo(),"Feijão", "Plantado e colhido na China."
                ,30,45,10,Global.gerarAleatorio0a4(),true,"Cereais"
                ,"Não sei", EnumUnidadeDeMedida.QUILO, 5));

        return alimentoArrayList;
    };
    public static ArrayList<Produto> gerarProduto(){
        ArrayList<Produto> produtoArrayList = new ArrayList<>();

        produtoArrayList.add(new Produto(Global.gerarAleatorioCodigo(),"Papel Higiênico", "Folha Dupla",
                30.00,45.60,6,Global.gerarAleatorio0a4(),true,"Higiene Pessoal"));

        produtoArrayList.add(new Produto(Global.gerarAleatorioCodigo(),"Boneca de Pano", "Feito totalmente de pano"
                ,80,100,7,Global.gerarAleatorio0a4(),true,"Brinquedos"));

        return produtoArrayList;
    };
    public static ArrayList<Livro> gerarlivro(){
        ArrayList<Livro> livroArrayList = new ArrayList<>();

        livroArrayList.add(new Livro(Global.gerarAleatorioCodigo(),"Alice no País das Maravílhias", "Livro de capa dura"
                ,17.63,35.00,15,Global.gerarAleatorio0a4(),true,"Fantasias"
                ,"Lewis Carroll","Uma menina, um coelho e uma história capazes de fazer qualquer um ... ","Darkside"));

        livroArrayList.add(new Livro(Global.gerarAleatorioCodigo(),"Cristianismo Puro e Simples", "Livro de capa dura"
                ,20,39.99,13,Global.gerarAleatorio0a4(),true,"Religioso",
                "C.S. Lewis","Em um dos períodos mais sombrios da humanidlestras pelo rádio coa simp...","Thomas Nelson"));

        return livroArrayList;
    };
    public static ArrayList<Eletronico> gerarEletronico(){
        ArrayList<Eletronico> eletronicoArrayList = new ArrayList<>();

        eletronicoArrayList.add(new Eletronico(Global.gerarAleatorioCodigo(),"Liquidificador", "Usado para diversas " +
                "funções, onde precisa processar algum tipo de alimento.",53.81,89.90,12,
                Global.gerarAleatorio0a4(),true,"Eletrodomésticos para Cozinha","Philco","Reverse PLQ1300",
                "Vermelho","Altura: 41,90cm, Largura: 20,80cm, Profundidade: 22,70cm, Peso: 2,14Kg"));

        eletronicoArrayList.add(new Eletronico(Global.gerarAleatorioCodigo(),"Carregador de celular tipo c",
                "Usado para aparelhos que possuem a entrada tipo C",15,23.90,8,
                Global.gerarAleatorio0a4(),true,"Carregadores","GShield","Tipo C","Preto",
                "Carregamento rápido. 3 portas USB"));

        return eletronicoArrayList;
    };
    public static void exibirProdutos (ArrayList<? extends ProdutoBase> arrayClazz) {
        int i = 1;
        for (ProdutoBase produto : arrayClazz) {
            System.out.println("\n[ "+i+" ] ------------------------------------------------------------------------");
            System.out.println(produto.toString());
            System.out.println("**********************************************************************************");
            i++;
        }
    }
    public static Alimento criarAlimento(String nome,String descricao,double precoDeCompra,double precoDeVenda,double maxDesconto, double estoque) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Categoria do Alimento: ");
        String categoria = scan.nextLine();
        System.out.print("Marca: ");
        String marca = scan.nextLine();
        System.out.print("Unidade de Medida {[1] Quilos, [2] Litros}: ");
        int opcaoUnit = scan.nextInt();
        EnumUnidadeDeMedida enumUnidadeDeMedida;

        if (opcaoUnit == 1) {
            enumUnidadeDeMedida = EnumUnidadeDeMedida.QUILO;
        } else if (opcaoUnit == 2) {
            enumUnidadeDeMedida = EnumUnidadeDeMedida.LITRO;
        } else {
            System.out.print("Opção inválida! Selecionado Quilos como padrão!");
            enumUnidadeDeMedida = EnumUnidadeDeMedida.QUILO;
        }

        System.out.print("Peso em "+enumUnidadeDeMedida.toString()+": ");
        double peso = scan.nextDouble();

        Alimento alimento = new Alimento(Global.gerarAleatorioCodigo(),nome,descricao,precoDeCompra,
                precoDeVenda,maxDesconto,estoque,true,categoria,marca,enumUnidadeDeMedida,peso);

        alimento.setVendavel(Vendavel.verificarVendavel(alimento));
        return alimento;
    }
    public static Livro criarLivro(String nome,String descricao,double precoDeCompra,double precoDeVenda,double maxDesconto,double estoque) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Categoria do Livro: ");
        String categoria = scan.next();
        System.out.print("Autor: ");
        String autor = scan.next();
        System.out.print("Sinopse: ");
        String sinopse = scan.next();
        System.out.print("Editora: ");
        String editora = scan.next();

        Livro livro = new Livro(Global.gerarAleatorioCodigo(),nome,descricao,precoDeCompra,precoDeVenda
                ,maxDesconto,estoque,true,categoria,autor,sinopse, editora);

        livro.setVendavel(Vendavel.verificarVendavel(livro));
        return livro;
    }
    public static Eletronico criarEletronico(String nome,String descricao,double precoDeCompra,double precoDeVenda,double maxDesconto,double estoque) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Categoria do Eletrônico: ");
        String categoria = scan.nextLine();
        System.out.print("Marca: ");
        String marca = scan.nextLine();
        System.out.print("Modelo: ");
        String modelo = scan.nextLine();
        System.out.print("Cor: ");
        String cor = scan.nextLine();
        System.out.print("Especificações: ");
        String especificacoes = scan.nextLine();

        Eletronico eletronico = new Eletronico(Global.gerarAleatorioCodigo(),nome,descricao,precoDeCompra,precoDeVenda,
                maxDesconto,estoque,true,categoria,marca,modelo,cor,especificacoes);

        eletronico.setVendavel(Vendavel.verificarVendavel(eletronico));
        return eletronico;
    }
    public static Produto criarProduto(String nome,String descricao,double precoDeCompra,double precoDeVenda,double maxDesconto,double estoque) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Categoria do Produto: ");
        String categoria = scan.nextLine();

        Produto produto = new Produto(Global.gerarAleatorioCodigo(),nome,descricao,precoDeCompra,precoDeVenda,maxDesconto,estoque,true,categoria);
        produto.setVendavel(Vendavel.verificarVendavel(produto));
        return produto;
    }
    public static int selecionarProdutoParaEditar (ArrayList<? extends ProdutoBase> arrayList) {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nInforme o número do produto que gostarria: ");
        int resposta = scan.nextInt();

        if (resposta == 0) {
            System.out.println("Número inválido Não é possível escolher 0! Tente novamente!");
            return selecionarProdutoParaEditar(arrayList);
        } else if (resposta > arrayList.size()) {
            System.out.println("Número inválido. Esse produto não existe! Tente novamente!");
            return selecionarProdutoParaEditar(arrayList);
        }

        return resposta-1;
    }
    public static Livro editarLivro(Livro livro) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n------------------------------------------------------------------------------------");
        System.out.println(livro.toString());
        System.out.println("**********************************************************************************");
        System.out.println("\nSelecione qual gostaria de editar\n");
        System.out.println("[ 1 ] - Código do produto");
        System.out.println("[ 2 ] - Nome Produto");
        System.out.println("[ 3 ] - Descrição");
        System.out.println("[ 4 ] - Preço compra");
        System.out.println("[ 5 ] - Preço venda");
        System.out.println("[ 6 ] - Desconto Porcentagem Máxima");
        System.out.println("[ 7 ] - Estoque");
        System.out.println("[ 8 ] - Categoria Livro");
        System.out.println("[ 9 ] - Autor");
        System.out.println("[ 10 ] - Editora");
        System.out.println("[ 11 ] - Sinopse\n");
        System.out.print("Selecione o atributo: ");
        int resposta = scan.nextInt();

        System.out.print("\nDigite o novo valor (Informe no mesmo tipo de dado):");
        String novoValor = scan.next();

        switch (resposta) {
            case 1:
                livro.setCodigo(novoValor);
                break;
            case 2:
                livro.setNomeProduto(novoValor);
                break;
            case 3:
                livro.setDescricao(novoValor);
                break;
            case 4:
                livro.setPrecoCompra(Double.parseDouble(novoValor));
                break;
            case 5:
                livro.setPrecoVenda(Double.parseDouble(novoValor));
                break;
            case 6:
                livro.setDescontoPorcentagemMax(Double.parseDouble(novoValor));
                break;
            case 7:
                livro.setEstoque(Integer.parseInt(novoValor));
            case 8:
                livro.setCategoriaLivro(novoValor);
                break;
            case 9:
                livro.setAutor(novoValor);
                break;
            case 10:
                livro.setEditora(novoValor);
                break;
            case 11:
                livro.setSinopse(novoValor);
                break;
            default:
                System.out.println("Opção inválida");
                editarLivro(livro);
                break;
        }


        System.out.println("Seu produto editado ficou assim: ");
        System.out.println("\n------------------------------------------------------------------------------------");
        System.out.println(livro.toString());
        System.out.println("**********************************************************************************");

        return livro;
    }
    public static Eletronico editarEletronico(Eletronico produto) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n------------------------------------------------------------------------------------");
        System.out.println(produto.toString());
        System.out.println("**********************************************************************************");
        System.out.println("\nSelecione qual gostaria de editar\n");
        System.out.println("[ 1 ] - Código do produto");
        System.out.println("[ 2 ] - Nome Produto");
        System.out.println("[ 3 ] - Descrição");
        System.out.println("[ 4 ] - Preço compra");
        System.out.println("[ 5 ] - Preço venda");
        System.out.println("[ 6 ] - Desconto Porcentagem Máxima");
        System.out.println("[ 7 ] - Estoque");
        System.out.println("[ 8 ] - Categoria Eletrônico");
        System.out.println("[ 9 ] - Marca");
        System.out.println("[ 10 ] - Modelo");
        System.out.println("[ 11 ] - Cor\n");
        System.out.println("[ 12 ] - Especificações\n");

        System.out.print("Selecione o atributo: ");
        int resposta = scan.nextInt();

        System.out.print("\nDigite o novo valor (Informe no mesmo tipo de dado):");
        String novoValor = scan.next();

        switch (resposta) {
            case 1:
                produto.setCodigo(novoValor);
                break;
            case 2:
                produto.setNomeProduto(novoValor);
                break;
            case 3:
                produto.setDescricao(novoValor);
                break;
            case 4:
                produto.setPrecoCompra(Double.parseDouble(novoValor));
                break;
            case 5:
                produto.setPrecoVenda(Double.parseDouble(novoValor));
                break;
            case 6:
                produto.setDescontoPorcentagemMax(Double.parseDouble(novoValor));
                break;
            case 7:
                produto.setEstoque(Integer.parseInt(novoValor));
                break;
            case 8:
                produto.setCategoriaElemento(novoValor);
            case 9:
                produto.setMarca(novoValor);
                break;
            case 10:
                produto.setModelo(novoValor);
                break;
            case 11:
                produto.setCor(novoValor);
                break;
            case 12:
                produto.setEspecificacoes(novoValor);
                break;
            default:
                System.out.println("Opção inválida");
                editarEletronico(produto);
                break;
        }


        System.out.println("Seu produto editado ficou assim: ");
        System.out.println("\n------------------------------------------------------------------------------------");
        System.out.println(produto.toString());
        System.out.println("**********************************************************************************");

        return produto;
    }
    public static Alimento editarAlimento (Alimento produto) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n------------------------------------------------------------------------------------");
        System.out.println(produto.toString());
        System.out.println("**********************************************************************************");
        System.out.println("\nSelecione qual gostaria de editar\n");
        System.out.println("[ 1 ] - Código do produto");
        System.out.println("[ 2 ] - Nome Produto");
        System.out.println("[ 3 ] - Descrição");
        System.out.println("[ 4 ] - Preço compra");
        System.out.println("[ 5 ] - Preço venda");
        System.out.println("[ 6 ] - Desconto Porcentagem Máxima");
        System.out.println("[ 7 ] - Estoque");
        System.out.println("[ 8 ] - Categoria Alimento");
        System.out.println("[ 9 ] - Marca");
        System.out.println("[ 10 ] - UnidadeDeMedida");
        System.out.println("[ 11 ] - Quantidade\n");

        System.out.print("Selecione o atributo: ");
        int resposta = scan.nextInt();
        int resposta2=0;

        if (resposta != 9) {
            System.out.print("\nDigite o novo valor (Informe no mesmo tipo de dado):");
            String novoValor = scan.next();
        } else {
            System.out.println("[ 1 ] - QUILOS\n[ 2 ] - LITROS");
            resposta2 = scan.nextInt();
        }

        System.out.print("\nDigite o novo valor (Informe no mesmo tipo de dado):");
        String novoValor = scan.next();

        switch (resposta) {
            case 1:
                produto.setCodigo(novoValor);
                break;
            case 2:
                produto.setNomeProduto(novoValor);
                break;
            case 3:
                produto.setDescricao(novoValor);
                break;
            case 4:
                produto.setPrecoCompra(Double.parseDouble(novoValor));
                break;
            case 5:
                produto.setPrecoVenda(Double.parseDouble(novoValor));
                break;
            case 6:
                produto.setDescontoPorcentagemMax(Double.parseDouble(novoValor));
                break;
            case 7:
                produto.setEstoque(Integer.parseInt(novoValor));
                break;
            case 8:
                produto.setCategoriaAlimento(novoValor);
                break;
            case 9:
                produto.setMarca(novoValor);
                break;
            case 10:
                if (resposta2==1) {
                    produto.setUnidadeDeMedida(EnumUnidadeDeMedida.QUILO);
                } else if (resposta==2) {
                    produto.setUnidadeDeMedida(EnumUnidadeDeMedida.LITRO);
                } else {
                    System.out.println("Opção inválida! Tente Novamente!");
                    return editarAlimento(produto);
                }
                break;
            case 11:
                produto.setQuantidade(Double.parseDouble(novoValor));
                break;
            default:
                System.out.println("Opção inválida");
                editarAlimento(produto);
                break;
        }


        System.out.println("Seu produto editado ficou assim: ");
        System.out.println("\n------------------------------------------------------------------------------------");
        System.out.println(produto.toString());
        System.out.println("**********************************************************************************");

        return produto;
    }
    public static Produto editarProduto (Produto produto) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n------------------------------------------------------------------------------------");
        System.out.println(produto.toString());
        System.out.println("**********************************************************************************");
        System.out.println("\nSelecione qual gostaria de editar\n");
        System.out.println("[ 1 ] - Código do produto");
        System.out.println("[ 2 ] - Nome Produto");
        System.out.println("[ 3 ] - Descrição");
        System.out.println("[ 4 ] - Preço compra");
        System.out.println("[ 5 ] - Preço venda");
        System.out.println("[ 6 ] - Desconto Porcentagem Máxima");
        System.out.println("[ 7 ] - Estoque");
        System.out.println("[ 8 ] - Tipo Produto");


        System.out.print("Selecione o atributo: ");
        int resposta = scan.nextInt();

        System.out.print("\nDigite o novo valor (Informe no mesmo tipo de dado):");
        String novoValor = scan.next();

        switch (resposta) {
            case 1:
                produto.setCodigo(novoValor);
                break;
            case 2:
                produto.setNomeProduto(novoValor);
                break;
            case 3:
                produto.setDescricao(novoValor);
                break;
            case 4:
                produto.setPrecoCompra(Double.parseDouble(novoValor));
                break;
            case 5:
                produto.setPrecoVenda(Double.parseDouble(novoValor));
                break;
            case 6:
                produto.setDescontoPorcentagemMax(Double.parseDouble(novoValor));
                break;
            case 7:
                produto.setEstoque(Integer.parseInt(novoValor));
                break;
            case 8:
                produto.setTipoProduto(novoValor);
            default:
                System.out.println("Opção inválida");
                editarProduto(produto);
                break;
        }


        System.out.println("Seu produto editado ficou assim: ");
        System.out.println("\n------------------------------------------------------------------------------------");
        System.out.println(produto.toString());
        System.out.println("**********************************************************************************");

        return produto;
    }
    public static void excluirProdutos (int numeroProduto, ArrayList<? extends ProdutoBase> arrayList) {
        arrayList.remove(numeroProduto);
        System.out.println("\nExcluído produto com sucesso!");
    }
    public static void definirVendavel (int numeroProduto, ArrayList<? extends ProdutoBase> arrayList) {
        arrayList.get(numeroProduto).setVendavel(Vendavel.verificarVendavel(arrayList.get(numeroProduto)));
        System.out.println("\nDefinido com sucesso com base na quantidade em estoque!\n Definido para "+arrayList.get(numeroProduto).isVendavel());
    }


    // ---- GETTERS E SETTERS ----

    public ArrayList<Alimento> getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(ArrayList<Alimento> alimentos) {
        this.alimentos = alimentos;
    }

    public void setAddAlimentos(Alimento alimento) {
        alimentos.add(alimento);
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public void setAddLivro(Livro livro) {
        this.livros.add(livro);
    }

    public ArrayList<Eletronico> getEletronicos() {
        return eletronicos;
    }

    public void setEletronicos(ArrayList<Eletronico> eletronicos) {
        this.eletronicos = eletronicos;
    }

    public void setAddEletronico(Eletronico eletronico) {
        this.eletronicos.add(eletronico);
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public void setAddProduto(Produto produto) {
        this.produtos.add(produto);
    }
}
