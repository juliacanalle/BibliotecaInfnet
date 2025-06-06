package model;

public class Livro {

    private int id;
    private String titulo;
    private String autor;
    private String descricao;
    private String categoria;
    private String imagemCapa; // URL ou caminho
    private String arquivoLivro; // Caminho interno do sistema

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getImagemCapa() {
        return imagemCapa;
    }

    public void setImagemCapa(String imagemCapa) {
        this.imagemCapa = imagemCapa;
    }

    public String getArquivoLivro() {
        return arquivoLivro;
    }

    public void setArquivoLivro(String arquivoLivro) {
        this.arquivoLivro = arquivoLivro;
    }
}
