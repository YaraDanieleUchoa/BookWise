public class Livro {
    private final String titulo;
    private final String autor;
    private final int ano;
    private final String editora;
    private final String genero;  
    private boolean disponivel;

    public Livro(String titulo, String autor, int ano, String editora, String genero, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.editora = editora;
        this.genero = genero;
        this.disponivel = disponivel;  // Agora aceita o valor passado
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public String getEditora() {
        return editora;
    }
    
    public String getGenero() {
        return genero;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ano=" + ano +
                ", editora='" + editora + '\'' +
                ", genero='" + genero + '\'' +
                ", disponivel=" + disponivel +
                '}';
    }
}
