package enums;

public enum PrazoLocacao {

    SETE_DIAS(7),
    QUATORZE_DIAS(14),
    VINTE_UM_DIAS(21);

    private final int dias;

    PrazoLocacao(int dias) {
        this.dias = dias;
    }

    public int getDias() {
        return dias;
    }
}
