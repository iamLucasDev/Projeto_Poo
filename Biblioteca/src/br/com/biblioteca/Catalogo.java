package br.com.biblioteca;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Catalogo{

    List<Livros> catalogo = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    String AddNomeLivro ;
    int  AddValorLivro;
    int AddQtdLivro;
    String AddAutorLivro;


    public  void  adicionarLivro(){

        System.out.println("Digite o nome do livro:  ");
        AddNomeLivro = scanner.nextLine();


        System.out.println("Digite o Valor: ");
        AddValorLivro = scanner.nextInt();


        System.out.println("Digite a Quantidade do livro: ");
        AddQtdLivro = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o autor do livro: ");
        AddAutorLivro = scanner.nextLine();



        Livros novosLivros = new Livros();
        novosLivros.setNomeDoLivro(AddNomeLivro);
        novosLivros.setValorDoLivro(AddValorLivro);
        novosLivros.setQuantidadeDeLivro(AddQtdLivro);
        novosLivros.setAutor(AddAutorLivro);

        catalogo.add(novosLivros);

        System.out.println("Livro Adicionado!");

    }





    public void MostrarCatalogo() {

        Livros livroUm = new Livros();
        livroUm.setNomeDoLivro("Batman");
        livroUm.setValorDoLivro(50);
        livroUm.setQuantidadeDeLivro(15);
        livroUm.setAutor("Nolan");

        Livros livroDois = new Livros();
        livroDois.setNomeDoLivro("O Hobbit");
        livroDois.setValorDoLivro(40);
        livroDois.setQuantidadeDeLivro(10);
        livroDois.setAutor("J.R.R. Tolkien");

        Livros livroTres = new Livros();
        livroTres.setNomeDoLivro( "Harry Potter");
        livroTres.setValorDoLivro(45);
        livroTres.setQuantidadeDeLivro(20);
        livroTres.setAutor("J.K. Rowling");

        Livros livroQuatro = new Livros();
        livroQuatro.setNomeDoLivro("1984");
        livroQuatro.setValorDoLivro(35);
        livroQuatro.setQuantidadeDeLivro(12);
        livroQuatro.setAutor( "George Orwell");

        Livros livroCinco = new Livros();
        livroCinco.setNomeDoLivro("Dom Casmurro");
        livroCinco.setValorDoLivro(30);
        livroCinco.setQuantidadeDeLivro(8);
        livroCinco.setAutor("Machado de Assis");

        Livros livroSeis = new Livros();
        livroSeis.setNomeDoLivro( "O Senhor dos Anéis");
        livroSeis.setValorDoLivro(60);
        livroSeis.setQuantidadeDeLivro(7);
        livroSeis.setAutor("J.R.R. Tolkien");

        Livros livroSete = new Livros();
        livroSete.setNomeDoLivro("Percy Jackson");
        livroSete.setValorDoLivro(42);
        livroSete.setQuantidadeDeLivro(14);
        livroSete.setAutor("Rick Riordan");



        catalogo.add(livroUm);
        catalogo.add(livroDois);
        catalogo.add(livroTres);
        catalogo.add(livroQuatro);
        catalogo.add(livroCinco);
        catalogo.add(livroSeis);
        catalogo.add(livroSete);


        for (Livros livros: catalogo) {
            System.out.println("Livro: " + livros.getNomeDoLivro());
            System.out.println("Valor: R$ " + livros.getValorDoLivro());
            System.out.println("Quantidade: "+livros.getQuantidadeDeLivro());
            System.out.println("Autor: "+ livros.getAutor());
            System.out.println("-------------------");
        }
    }
}
