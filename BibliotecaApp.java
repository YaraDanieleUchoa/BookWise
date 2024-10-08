public class BibliotecaApp {
    public static void main(String[] args) {
        // Criando biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Adicionando livros (agora com todos os parâmetros necessários)
        Livro livro1 = new Livro("Dom Quixote", "Miguel de Cervantes", 1605, "Francisco de Robles", "Ficção", true);
        Livro livro2 = new Livro("1984", "George Orwell", 1949, "Secker & Warburg", "Distopia", true);
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        // Adicionando usuários (agora com IDs)
        Usuario usuario1 = new Usuario("Yara", 1);
        Usuario usuario2 = new Usuario("Daniele", 2);
        biblioteca.adicionarUsuario(usuario1);
        biblioteca.adicionarUsuario(usuario2);

        // Emprestando e devolvendo livros
        usuario1.emprestarLivro(livro1);  // Yara pega Dom Quixote
        usuario2.emprestarLivro(livro1);  // Daniele tenta pegar, mas já está emprestado

        usuario1.devolverLivro(livro1);   // Yara devolve Dom Quixote
        usuario2.emprestarLivro(livro1);  // Agora Daniele pode pegar

        // Listando livros e usuários
        biblioteca.listaLivros();         // Lista de livros na biblioteca
        biblioteca.listaUsuarios();       // Lista de usuários cadastrados
    }
}
