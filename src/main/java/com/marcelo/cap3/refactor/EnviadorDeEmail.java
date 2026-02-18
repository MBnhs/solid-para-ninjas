package com.marcelo.cap3.refactor;

public class EnviadorDeEmail implements AcaoAposGerarNota {
    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("Enviando email com dados da nota fiscal.");
        System.out.println("Valor: " + nf.getValor());
        System.out.println("Imposto: " + nf.getImposto());
    }
}
