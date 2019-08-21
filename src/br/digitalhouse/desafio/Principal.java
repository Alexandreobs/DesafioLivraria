package br.digitalhouse.desafio;

import java.util.HashMap;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {


        Livros jogosvorazes = new Livros("123", 15.5, "Jogos Vorazes", "Jessica", "29/03/2010", "1");
        Livros mundodesofia = new Livros("321", 25.35, "Mundo de Sofia", "Camila", "10/03/1950", "2");
        Livros guiadafilofia = new Livros("456", 35.5, "O guia Politicamente Incorreto da Filosofia", "Luiz Felipe Pondé", "21/07/2015", "3");


        HashMap<Integer, Livros> Biblioteca = new HashMap();
        Biblioteca.put(1, jogosvorazes);
        Biblioteca.put(2, mundodesofia);
        Biblioteca.put(3, guiadafilofia);

        try {


            Scanner consuta = new Scanner(System.in);
            System.out.println("Digite o codigo do livro, que gostaria de pesquisar: ");
            Integer escolha = consuta.nextInt();

            Livros valor = Biblioteca.get(escolha);
            System.out.println("Dados do Livro pesqueisado: Códico do livro: " + valor.getCodlivro() + "\n"
                    + "Título do livro: " + valor.getTitulo() + "\n"
                    + "Autor: " + valor.getAutor() + "\n"
                    + "Data de lançamento: " + valor.getLancamento() + "\n"
                    + "Preço: R$" + valor.getPreco());

        }catch (Exception erro){
            System.out.println("O livro pesquisado está esgotado, pedimos desculpa :(.");
        }

        {
            System.out.println("\n");
        }


        Scanner compra = new Scanner(System.in);
        System.out.println("Qual livro Gostaria de Comprar:" + "\n"
        + "Digite o Código do Livro Aqui:" );
        Integer escolha1 = compra.nextInt();
        if (escolha1 < 0 || escolha1 >3) {
            System.out.println("Desculpe esse livro não se encontra em estoque");
        } else {
            Biblioteca.remove(escolha1);
            System.out.println("Seu livro foi comprado ;)");
        }




////        for (Integer key : Biblioteca.keySet()) {
//            Livros valor = Biblioteca.get(1);
//            System.out.println("Dados do Livro pesqueisado: Códico do livro: " + valor.getCodlivro() + "\n"
//                    + "Título do livro: " + valor.getTitulo() + "\n"
//                    + "Autor: " + valor.getAutor() + "\n"
//                    + "Data de lançamento: " + valor.getLancamento() + "\n"
//                    + "Preço: R$" + valor.getPreco());
//
//
//        }

        }
    }
