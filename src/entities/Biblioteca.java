package entities;

import java.util.ArrayList;

public class Biblioteca {
	
	private ArrayList<Livro> livros = new ArrayList<>();
	private ArrayList<Usuario> usuarios = new ArrayList<>();
	
	public void adicionarLivro(Livro livro) {
		livros.add(livro);
	}
	
	public void removerLivro(Livro livro) {
		livros.remove(livro);
	}
	
	public void listarLivros() {
		if (livros.isEmpty()) {
			System.out.println("A biblioteca não possui livros cadastrados.");
		} else {
			System.out.println("Lista de livros: ");
			
			for (Livro livro : livros) {
				System.out.println("Título: " + livro.getTitulo());
				System.out.println("Autor: " + livro.getAutor());
				System.out.println("Ano de Publicação: " + livro.getAnoPublicacao());
				System.out.println();
			}
		}
	}
	
	public Livro buscarLivro(String titulo) {
		for (Livro livro : livros) {
			if (livro.getTitulo().equalsIgnoreCase(titulo)) {
				return livro;
			}
		}
		return null;
	}
	
	public void cadastrarUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}
	
	public void removerUsuario(Usuario usuario) {
		usuarios.remove(usuario);
	}
	
	public void listarUsuarios() {
        System.out.println("Lista de Usuários:");
        for (Usuario usuario : usuarios) {
            System.out.println("Nome: " + usuario.getNome() + ", CPF: " + usuario.getCpf());
        }
    }
	
	public Usuario buscarUsuarios(String usuario) {
		for (Usuario cpf : usuarios) {
			if (cpf.getCpf().equalsIgnoreCase(usuario)) {
				return cpf;
			}
		}
		return null;
	}
}
	
