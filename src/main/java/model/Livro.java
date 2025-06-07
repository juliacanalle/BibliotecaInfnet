package model;

public class Livro {

    private int id;
    private String titulo;
    private String autor;
    private String descricao;
    private String categoria;

    public Livro(int id, String titulo, String autor, String descricao, String categoria) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.descricao = descricao;
        this.categoria = categoria;
    }

    public Livro() {
    }

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
