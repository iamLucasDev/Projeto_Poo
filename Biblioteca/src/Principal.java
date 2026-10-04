import br.com.biblioteca.Catalogo;
import br.com.biblioteca.Livros;
import br.com.biblioteca.usuarios.Clientes;
import br.com.biblioteca.usuarios.Funcionario;
import br.com.biblioteca.usuarios.Pessoa;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Livros livros = new Livros();
        Catalogo catalogo = new Catalogo();
        Clientes cliente = new Clientes();
        Scanner scanner = new Scanner(System.in);
        //Pessoa funcionario = new Funcionario();

        String livroEscolhido ;
       // funcionario.setNome("Pedro");
       // funcionario.nome = "Pedro";



        int opcao = 0;
        String menu = ("""
                Biblioteca- Menu de opções
                
                1- Catálogos de livros
                2- Comprar Livros
                3- Adicionar livro
                4- sair
                
                """);


        while (opcao != 4) {
            System.out.println(menu);
            System.out.println("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            if (opcao != 1 && opcao != 2 && opcao != 3 ) {
                System.out.println("Opção invalida");
            }
            else if(opcao == 1){
              catalogo.MostrarCatalogo();

                }
            else if (opcao == 2) {
                System.out.println("Qual livro você deseja comprar? ");
                scanner.nextLine();
                livroEscolhido = scanner.nextLine();
                cliente.DadosClientes();
                }
            else if (opcao == 3) {
                catalogo.adicionarLivro();
            }

        }
        System.out.println("Programa encerado");
        }

        }













