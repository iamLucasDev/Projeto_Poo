package br.com.biblioteca;
import java.util.Objects;
import java.util.Scanner;

public class Livros {

    private  String nomeDoLivro;
    private  String  autor;
    private  int   valorDoLivro;
    private  int quantidadeDeLivro;

    public String getNomeDoLivro() {
        return nomeDoLivro;
    }

    public void setNomeDoLivro(String nomeDoLivro) {
        this.nomeDoLivro = nomeDoLivro;
    }

    public int getValorDoLivro() {
        return valorDoLivro;
    }

    public void setValorDoLivro(int valorDoLivro) {
        this.valorDoLivro = valorDoLivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQuantidadeDeLivro() {
        return quantidadeDeLivro;
    }

    public void setQuantidadeDeLivro(int quantidadeDeLivro) {
        this.quantidadeDeLivro = quantidadeDeLivro;
    }




}

