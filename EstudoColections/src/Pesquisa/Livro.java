package Pesquisa;

public class Livro {
	//atributos
	
	private String livro;
	
	private String titulo;
	
	private String autor;
	
	private int anoPublicacao;

	public Livro(String livro, String titulo, String autor, int anoPublicacao) {
		super();
		this.livro = livro;
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
	}

	public String getLivro() {
		return livro;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	@Override
	public String toString() {
		return "Livro [livro=" + livro + ", titulo=" + titulo + ", autor=" + autor + ", anoPublicacao=" + anoPublicacao
				+ "]";
	}
	
	
}
