import java.util.ArrayList;

public class Biblioteca {
    private final ArrayList<Livro> livros;
    private final ArrayList<Usuario> usuarios;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        if (livros.contains(livro)) {
            System.out.println("O livro já existe na biblioteca.");
        } else {
            livros.add(livro);
            System.out.println("Livro adicionado: " + livro.getTitulo());
        }
    }

    public void adicionarUsuario(Usuario usuario) {
        if (usuarios.contains(usuario)) {
            System.out.println("O usuário já está cadastrado.");
        } else {
            usuarios.add(usuario);
            System.out.println("Usuário adicionado: " + usuario.getNome());
        }
    }

    public Livro buscarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        System.out.println("Livro não encontrado.");
        return null;
    }

    public Usuario buscarUsuario(String nome) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equalsIgnoreCase(nome)) {
                return usuario;
            }
        }
        System.out.println("Usuário não encontrado.");
        return null;
    }

    public void listaLivros() {
        System.out.println("Lista de livros:");
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo() + " - Disponível: " + (livro.isDisponivel() ? "Sim" : "Não"));
        }
    }

    public void listaUsuarios() {
        System.out.println("Lista de usuários:");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario.getNome());
        }
    }


}
