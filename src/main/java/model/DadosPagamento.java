package model;

import enums.FormaPagamento;

public class DadosPagamento {

    private int id;
    private FormaPagamento formaPagamento;

    public DadosPagamento(int id, FormaPagamento formaPagamento) {
        this.id = id;
        this.formaPagamento = formaPagamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
}
