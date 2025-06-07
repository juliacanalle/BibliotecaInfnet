package model;

import enums.PrazoLocacao;
import enums.StatusAluguel;

import java.time.LocalDate;
import java.util.List;

public class Aluguel {

    private int id;
    private Usuario usuario;
    private Livro livro;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private PrazoLocacao prazoLocacao;
    private StatusAluguel status;

    public Aluguel(int id, Usuario usuario, Livro livro, LocalDate dataInicio, LocalDate dataFim, PrazoLocacao prazoLocacao, StatusAluguel status) {
        this.id = id;
        this.usuario = usuario;
        this.livro = livro;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.prazoLocacao = prazoLocacao;
        this.status = status;
    }

    public Aluguel() {
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

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public PrazoLocacao getPrazoLocacao() {
        return prazoLocacao;
    }

    public void setPrazoLocacao(PrazoLocacao prazoLocacao) {
        this.prazoLocacao = prazoLocacao;
    }

    public StatusAluguel getStatus() {
        return status;
    }

    public void setStatus(StatusAluguel status) {
        this.status = status;
    }
}

