
public class BibliotecaApp {
    public static void main(String[] args) {
        
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Harry Potter", "J.K Rowling", 1998, "Não sei", "Fantasia", true);
        Livro livro2 = new Livro("Crepusculo", "Stephenie Meyer", 2008, "Sei lá", "Ficção", true);
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        Usuario usuario1 = new Usuario("Danny", 1);
        Usuario usuario2 = new Usuario("Olivia", 2);
        biblioteca.adicionarUsuario(usuario1);
        biblioteca.adicionarUsuario(usuario2);

        usuario1.emprestarLivro(livro1);  
        usuario2.emprestarLivro(livro1);  

        usuario1.devolverLivro(livro1);  
        usuario2.emprestarLivro(livro1); 

        biblioteca.listaLivros();       
        biblioteca.listaUsuarios();     
    }
}
