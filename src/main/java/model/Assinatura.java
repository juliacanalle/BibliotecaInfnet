package model;

import enums.PlanoAssinatura;

import java.time.LocalDate;

public class Assinatura {

    private int id;
    private Usuario usuario;
    private PlanoAssinatura plano;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Enums.StatusAssinatura status;

    public Assinatura(int id, Usuario usuario, PlanoAssinatura plano, LocalDate dataInicio, LocalDate dataFim, Enums.StatusAssinatura status) {
        this.id = id;
        this.usuario = usuario;
        this.plano = plano;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.status = status;
    }

    public Assinatura() {
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

    public PlanoAssinatura getPlano() {
        return plano;
    }

    public void setPlano(PlanoAssinatura plano) {
        this.plano = plano;
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

    public Enums.StatusAssinatura getStatus() {
        return status;
    }

    public void setStatus(Enums.StatusAssinatura status) {
        this.status = status;
    }
}
