package geBiblioteca;

public class Livro {
	private String titulo;
	private String autor;
	private int anoPublicacao;
	private int numeroPaginas;

	// Construtor
	public Livro(String titulo, String autor, int anoPublicacao, int numeroPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.numeroPaginas = numeroPaginas;
	}

	// Getters e Setters
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
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	// Método toString para exibir as informações do livro de forma legível
	@Override
	public String toString() {
		return "Título: " + titulo + ", Autor: " + autor + ", Ano de Publicação: " + anoPublicacao
				+ ", Número de Páginas: " + numeroPaginas;
	}
}
