package br.digitalhouse.desafio;

import java.util.Scanner;

public class Livros {
    private String codlivro;
    private String titulo;
    private String autor;
    private String lancamento;
    private String codIsbn;
    private Double preco;

    public Livros(String codlivro,Double preco, String titulo, String autor, String lancamento, String codIsbn) {
        this.codlivro = codlivro;
        this.titulo = titulo;
        this.autor = autor;
        this.lancamento = lancamento;
        this.codIsbn = codIsbn;
        this.preco =preco;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getCodlivro() {
        return codlivro;
    }

    public void setCodlivro(String codlivro) {
        this.codlivro = codlivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getLancamento() {
        return lancamento;
    }

    public void setLancamento(String lancamento) {
        this.lancamento = lancamento;
    }

    public String getCodIsbn() {
        return codIsbn;
    }

    public void setCodIsbn(String codIsbn) {
        this.codIsbn = codIsbn;
    }

    public void imprimirDados(){
        System.out.println("Dados do Livro pesqueisado: Códico do livro: " + getCodlivro() + "\n"
        + "Título do livro: " + getTitulo() + "\n"
        + "Autor: " + getAutor() + "\n"
        + "Data de lançamento: " + getLancamento() + "\n"
        + "Preço: R$" + getPreco());

    }


    }

