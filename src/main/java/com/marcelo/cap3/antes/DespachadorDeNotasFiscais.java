package com.marcelo.cap3.antes;

public class DespachadorDeNotasFiscais {

    private NotaFiscalDao dao;
    private CalculadorDeImposto impostos;
    private LeiDeEntrega lei;
    private Correios correios;

    public DespachadorDeNotasFiscais(NotaFiscalDao dao, CalculadorDeImposto impostos, LeiDeEntrega lei, Correios correios) {
        this.dao = dao;
        this.impostos = impostos;
        this.lei = lei;
        this.correios = correios;
    }

    public void processa(NotaFiscal nf) {

        double imposto = impostos.para(nf);

        nf.setImposto(imposto);

        if (lei.deveEntregarUrgente(nf)) {
            correios.enviaPorSedex10(nf);
        } else {
            correios.enviaPorSedexComum(nf);
        }

        dao.persiste(nf);
    }


}

