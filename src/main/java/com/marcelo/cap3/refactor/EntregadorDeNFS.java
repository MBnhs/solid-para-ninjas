package com.marcelo.cap3.refactor;

public class EntregadorDeNFS {

    private final LeiDeEntrega lei;
    private final Correios correios;

    public EntregadorDeNFS(LeiDeEntrega lei, Correios correios) {
        this.lei = lei;
        this.correios = correios;
    }

    public void realizaEnvio(NotaFiscal nf) {
        if (lei.deveEntregarUrgente(nf)) {
            correios.enviaPorSedex10(nf);
        } else {
            correios.enviaPorSedexComum(nf);
        }
    }

}
