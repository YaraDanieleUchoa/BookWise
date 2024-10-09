package geBiblioteca;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca(); // Instancia a classe de gerenciamento de livros
		Scanner scanner = new Scanner(System.in); // Scanner para capturar a entrada do usuário
		int opcao; // Variável para controlar o menu de opções

		// Loop principal para o menu
		do {
			System.out.println("\n--- Gerenciador de Biblioteca ---");
			System.out.println("1. Adicionar livro");
			System.out.println("2. Atualizar livro");
			System.out.println("3. Remover livro");
			System.out.println("4. Listar livros");
			System.out.println("5. Buscar livro por título");
			System.out.println("6. Buscar livros por autor");
			System.out.println("0. Sair");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine(); // Consumir a nova linha após o número

			switch (opcao) {
			case 1:
				// Adiciona um novo livro
				adicionarLivro(biblioteca, scanner);
				break;

			case 2:
				// Atualiza um livro existente
				atualizarLivro(biblioteca, scanner);
				break;

			case 3:
				// Remove um livro
				removerLivro(biblioteca, scanner);
				break;

			case 4:
				// Lista todos os livros
				biblioteca.listarLivros();
				break;

			case 5:
				// Busca um livro pelo título
				buscarLivroPorTitulo(biblioteca, scanner);
				break;

			case 6:
				// Busca livros por autor
				buscarLivrosPorAutor(biblioteca, scanner);
				break;

			case 0:
				System.out.println("Saindo...");
				break;

			default:
				System.out.println("Opção inválida! Tente novamente.");
			}
		} while (opcao != 0);

		scanner.close(); // Fecha o scanner para liberar recursos
	}

	// Método para adicionar um livro
	private static void adicionarLivro(Biblioteca biblioteca, Scanner scanner) {
		System.out.print("Digite o título do livro: ");
		String titulo = scanner.nextLine();
		System.out.print("Digite o autor: ");
		String autor = scanner.nextLine();
		System.out.print("Digite o ano de publicação: ");
		int ano = scanner.nextInt();
		System.out.print("Digite o número de páginas: ");
		int paginas = scanner.nextInt();
		scanner.nextLine(); // Consumir nova linha

		Livro novoLivro = new Livro(titulo, autor, ano, paginas);
		biblioteca.adicionarLivro(novoLivro); // Adiciona o livro à biblioteca
		System.out.println("Livro adicionado com sucesso!");
	}

	// Método para atualizar um livro existente
	private static void atualizarLivro(Biblioteca biblioteca, Scanner scanner) {
		System.out.print("Digite o título do livro a ser atualizado: ");
		String titulo = scanner.nextLine();
		Livro livroExistente = biblioteca.buscarLivroPorTitulo(titulo);

		if (livroExistente != null) {
			System.out.print("Digite o novo título (ou deixe em branco para manter): ");
			String novoTitulo = scanner.nextLine();
			if (!novoTitulo.isEmpty())
				livroExistente.setTitulo(novoTitulo);

			System.out.print("Digite o novo autor (ou deixe em branco para manter): ");
			String novoAutor = scanner.nextLine();
			if (!novoAutor.isEmpty())
				livroExistente.setAutor(novoAutor);

			System.out.print("Digite o novo ano de publicação (ou deixe 0 para manter): ");
			int novoAno = scanner.nextInt();
			if (novoAno != 0)
				livroExistente.setAnoPublicacao(novoAno);

			System.out.print("Digite o novo número de páginas (ou deixe 0 para manter): ");
			int novasPaginas = scanner.nextInt();
			scanner.nextLine(); // Consumir nova linha
			if (novasPaginas != 0)
				livroExistente.setNumeroPaginas(novasPaginas);

			biblioteca.atualizarLivro(titulo, livroExistente);
			System.out.println("Livro atualizado com sucesso!");
		} else {
			System.out.println("Livro não encontrado.");
		}
	}

	// Método para remover um livro
	private static void removerLivro(Biblioteca biblioteca, Scanner scanner) {
		System.out.print("Digite o título do livro a ser removido: ");
		String titulo = scanner.nextLine();
		boolean removido = biblioteca.removerLivro(titulo);
		if (removido) {
			System.out.println("Livro removido com sucesso.");
		} else {
			System.out.println("Livro não encontrado.");
		}
	}

	// Método para buscar um livro pelo título
	private static void buscarLivroPorTitulo(Biblioteca biblioteca, Scanner scanner) {
		System.out.print("Digite o título do livro: ");
		String titulo = scanner.nextLine();
		Livro livro = biblioteca.buscarLivroPorTitulo(titulo);
		if (livro != null) {
			System.out.println(livro); // Exibe os detalhes do livro
		} else {
			System.out.println("Livro não encontrado.");
		}
	}

	// Método para buscar livros por autor
	private static void buscarLivrosPorAutor(Biblioteca biblioteca, Scanner scanner) {
		System.out.print("Digite o autor: ");
		String autor = scanner.nextLine();
		biblioteca.buscarLivroPorAutor(autor).forEach(System.out::println); // Exibe todos os livros do autor
	}
}
