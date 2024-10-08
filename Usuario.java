import java.util.ArrayList;

public class Usuario {
    private String nome;
    private int id;
    private ArrayList<Livro> livrosEmprestados;

    public Usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void emprestarLivro(Livro livro) {
        if (livrosEmprestados.contains(livro)) {
            System.out.println(nome + " já possui o livro " + livro.getTitulo());
            return;
        }
        if (livro.isDisponivel()) {
            livrosEmprestados.add(livro);
            livro.setDisponivel(false);
            System.out.println(nome + " emprestou o livro " + livro.getTitulo());
        } else {
            System.out.println("Livro indisponível para empréstimo.");
        }
    }

    public void devolverLivro(Livro livro) {
        if (livrosEmprestados.remove(livro)) {
            livro.setDisponivel(true);
            System.out.println(nome + " devolveu o livro " + livro.getTitulo());
        } else {
            System.out.println("O livro " + livro.getTitulo() + " não está com " + nome);
        }
    }

    public void listarLivrosEmprestados() {
        if (livrosEmprestados.isEmpty()) {
            System.out.println(nome + " não possui livros emprestados.");
        } else {
            System.out.println("Livros emprestados por " + nome + ":");
            for (Livro livro : livrosEmprestados) {
                System.out.println(livro.getTitulo());
            }
        }
    }

    public ArrayList<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }
}
