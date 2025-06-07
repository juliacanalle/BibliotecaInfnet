package model;

public class Enums {

    public enum TipoUsuario {
        CLIENTE,
        ADMINISTRADOR
    }

    public enum FormaPagamento {
        PIX,
        BOLETO,
        CARTAO
    }

    public enum StatusAluguel {
        ATIVO,
        FINALIZADO
    }

    public enum PlanoAssinatura {
        MENSAL,
        SEMESTRAL,
        ANUAL
    }

    public enum StatusAssinatura {
        ATIVA,
        CANCELADA
    }

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


}
