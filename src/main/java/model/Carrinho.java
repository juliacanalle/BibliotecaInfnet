package model;

public class Carrinho {

    private int id;
    private Usuario usuario;
    private List<Livro> livros;
    private Integer prazoLocacaoDias;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public Integer getPrazoLocacaoDias() {
        return prazoLocacaoDias;
    }

    public void setPrazoLocacaoDias(Integer prazoLocacaoDias) {
        this.prazoLocacaoDias = prazoLocacaoDias;
    }
}
