package model;

import java.util.List;

public class Carrinho {

    private int id;
    private Usuario usuario;
    private List<Livro> livrosEscolhidos;
    private Integer prazoLocacaoDias;

    public Carrinho(int id, Usuario usuario, List<Livro> livrosEscolhidos, Integer prazoLocacaoDias) {
        this.id = id;
        this.usuario = usuario;
        this.livrosEscolhidos = livrosEscolhidos;
        this.prazoLocacaoDias = prazoLocacaoDias;
    }

    public Carrinho() {
    }

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

    public List<Livro> getLivrosEscolhidos() {
        return livrosEscolhidos;
    }

    public void setLivrosEscolhidos(List<Livro> livrosEscolhidos) {
        this.livrosEscolhidos = livrosEscolhidos;
    }

    public Integer getPrazoLocacaoDias() {
        return prazoLocacaoDias;
    }

    public void setPrazoLocacaoDias(Integer prazoLocacaoDias) {
        this.prazoLocacaoDias = prazoLocacaoDias;
    }
}
