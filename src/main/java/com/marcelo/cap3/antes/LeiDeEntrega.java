package com.marcelo.cap3.antes;

public class LeiDeEntrega {

    public boolean deveEntregarUrgente(NotaFiscal nf) {
        return nf.getValor() >= 100;
    }

}
