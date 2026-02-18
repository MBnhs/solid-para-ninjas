package com.marcelo.cap3.refactor;

public class NotaFiscalDao implements AcaoAposGerarNota {
    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("Salvando nota fiscal no banco de dados.");
        System.out.println("Valor: " + nf.getValor());
        System.out.println("Imposto: " + nf.getImposto());
    }
}
