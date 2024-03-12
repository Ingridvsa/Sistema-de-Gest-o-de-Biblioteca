package entities;

public class Livro {
	private String titulo;
	private String autor;
	private int anoPublicacoa;
	
	public Livro(String titulo, String autor, int anoPublicacoa) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacoa = anoPublicacoa;
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

	public int getAnoPublicacao() {
		return anoPublicacoa;
	}

	public void setAnoPublicacoa(int anoPublicacoa) {
		this.anoPublicacoa = anoPublicacoa;
	}
	
	
	
}
