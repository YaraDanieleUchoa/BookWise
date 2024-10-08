import java.util.ArrayList;

class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private boolean disponivel;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.disponivel = true;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro emprestado com sucesso.");
        } else {
            System.out.println("Livro não está disponível.");
        }
    }

    public void devolver() {
        disponivel = true;
        System.out.println("Livro devolvido com sucesso.");
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Ano: " + ano + ", Disponível: " + disponivel);
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public String getTitulo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTitulo'");
    }
}

class Usuario {
    private String nome;
    private int id;
    private final ArrayList<Livro> livrosEmprestados;

    public Usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = new ArrayList<>();
    }

    public void emprestarLivro(Livro livro) {
        if (livro.isDisponivel()) {
            livro.emprestar();
            livrosEmprestados.add(livro);
        } else {
            System.out.println("O livro já está emprestado.");
        }
    }

    public void devolverLivro(Livro livro) {
        if (livrosEmprestados.contains(livro)) {
            livro.devolver();
            livrosEmprestados.remove(livro);
        } else {
            System.out.println("Este livro não foi emprestado a você.");
        }
    }

    public char[] getNome() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNome'");
    }
}

class Biblioteca {
    private ArrayList<Livro> listaLivros;
    private ArrayList<Usuario> listaUsuarios;

    public Biblioteca() {
        this.listaLivros = new ArrayList<>();
        this.listaUsuarios = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        listaLivros.add(livro);
    }

    public void adicionarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public void registrarEmprestimo(Usuario usuario, Livro livro) {
        usuario.emprestarLivro(livro);
    }

    public void registrarDevolucao(Usuario usuario, Livro livro) {
        usuario.devolverLivro(livro);
    }

    public void listaUsuarios() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listaUsuarios'");
    }
}
