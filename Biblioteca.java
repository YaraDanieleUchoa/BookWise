package geBiblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private List<Livro> livros;

	// Construtor
	public Biblioteca() {
		this.livros = new ArrayList<>(); // Inicializa a lista de livros
	}

	// Adiciona um livro à lista
	public void adicionarLivro(Livro livro) {
		livros.add(livro);
	}

	// Atualiza um livro existente na lista (pelo título)
	public void atualizarLivro(String titulo, Livro livroAtualizado) {
		for (int i = 0; i < livros.size(); i++) {
			if (livros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
				livros.set(i, livroAtualizado);
				break;
			}
		}
	}

	// Remove um livro pelo título
	public boolean removerLivro(String titulo) {
		return livros.removeIf(livro -> livro.getTitulo().equalsIgnoreCase(titulo));
	}

	// Lista todos os livros
	public void listarLivros() {
		if (livros.isEmpty()) {
			System.out.println("Nenhum livro cadastrado.");
		} else {
			for (Livro livro : livros) {
				System.out.println(livro);
			}
		}
	}

	// Busca um livro pelo título
	public Livro buscarLivroPorTitulo(String titulo) {
		for (Livro livro : livros) {
			if (livro.getTitulo().equalsIgnoreCase(titulo)) {
				return livro;
			}
		}
		return null; // Retorna null se o livro não for encontrado
	}

	// Busca livros por autor
	public List<Livro> buscarLivroPorAutor(String autor) {
		List<Livro> livrosDoAutor = new ArrayList<>();
		for (Livro livro : livros) {
			if (livro.getAutor().equalsIgnoreCase(autor)) {
				livrosDoAutor.add(livro);
			}
		}
		return livrosDoAutor;
	}
}
