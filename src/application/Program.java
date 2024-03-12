package application;

import java.util.Scanner;
import entities.Biblioteca;
import entities.Livro;
import entities.Usuario;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Biblioteca biblioteca = new Biblioteca();
		
		
		while (true) {
			System.out.println("\n===== Menu =====");
	        System.out.println("1. Adicionar Livro");
	        System.out.println("2. Remover Livro");
	        System.out.println("3. Listar Livros");
	        System.out.println("4. Buscar Livro");
	        System.out.println("5. Cadastrar Usuário");
	        System.out.println("6. Remover Usuário");
	        System.out.println("7. Listar Usuários");
	        System.out.println("8. Sair");
	        System.out.print("Escolha uma opção: ");
	        int opcao = sc.nextInt();
	        sc.nextLine();
	        
	        switch (opcao) {
            case 1:
                System.out.print("Digite o título do livro: ");
                String tituloLivro = sc.nextLine();
                System.out.print("Digite o nome do autor: ");
                String autorLivro = sc.nextLine();
                System.out.print("Digite o ano de publicação: ");
                int anoPublicacao = sc.nextInt();
                sc.nextLine(); // Limpar o buffer
                Livro novoLivro = new Livro(tituloLivro, autorLivro, anoPublicacao);
                biblioteca.adicionarLivro(novoLivro);
                System.out.println("Livro adicionado com sucesso!");
                break;
            case 2:
                System.out.print("Digite o título do livro a ser removido: ");
                String tituloRemover = sc.nextLine();
                Livro livroRemover = biblioteca.buscarLivro(tituloRemover);
                if (livroRemover != null) {
                    biblioteca.removerLivro(livroRemover);
                    System.out.println("Livro removido com sucesso!");
                } else {
                    System.out.println("Livro não encontrado.");
                }
                break;
            case 3:
                biblioteca.listarLivros();
                break;
            case 4:
                System.out.print("Digite o título do livro a ser buscado: ");
                String tituloBuscar = sc.nextLine();
                Livro livroBuscar = biblioteca.buscarLivro(tituloBuscar);
                if (livroBuscar != null) {
                    System.out.println("Livro encontrado:");
                    System.out.println("Título: " + livroBuscar.getTitulo() + ", Autor: " + livroBuscar.getAutor() + ", Ano de Publicação: " + livroBuscar.getAnoPublicacao());
                } else {
                    System.out.println("Livro não encontrado.");
                }
                break;
            case 5:
                System.out.print("Digite o nome do usuário: ");
                String nomeUsuario = sc.nextLine();
                System.out.print("Digite o CPF do usuário: ");
                String cpfUsuario = sc.nextLine();
                Usuario novoUsuario = new Usuario(nomeUsuario, cpfUsuario);
                biblioteca.cadastrarUsuario(novoUsuario);
                System.out.println("Usuário cadastrado com sucesso!");
                break;
            case 6:
            	System.out.print("Digite o cpf do usuário a ser removido: ");
                String nomeUsuario1 = sc.nextLine();
                Usuario usuarioRemover = biblioteca.buscarUsuarios(nomeUsuario1);
                
                if (usuarioRemover != null) {
                    biblioteca.removerUsuario(usuarioRemover);
                    System.out.println("Usuário removido com sucesso!");
                } else {
                    System.out.println("Usuário não encontrado.");
                }
                break;
            case 7:
                biblioteca.listarUsuarios();
                break;
            case 8:
                System.out.println("Saindo do programa...");
                sc.close();
                System.exit(0);
            default:
                System.out.println("Opção inválida! Tente novamente.");
                
	        }
	       	
		}
	}
}
