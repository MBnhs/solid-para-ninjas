package com.marcelo.cap3.refactor;


public class DespachadorDeNotasFiscais {

    private NotaFiscalDao dao;
    private CalculadorDeImposto impostos;
    private EntregadorDeNFS entregadorDeNFS;

    public DespachadorDeNotasFiscais(NotaFiscalDao dao, CalculadorDeImposto impostos, EntregadorDeNFS entregadorDeNFS) {
        this.dao = dao;
        this.impostos = impostos;
        this.entregadorDeNFS = entregadorDeNFS;
    }

    public void processa(NotaFiscal nf) {

        double imposto = impostos.para(nf);

        nf.setImposto(imposto);

            entregadorDeNFS.realizaEnvio(nf);

        dao.executa(nf);
    }
}
