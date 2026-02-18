package com.marcelo.cap3.antes;

public class EnviadorDeEmail {

    public EnviadorDeEmail() {

    }

    public void enviaEmail(NotaFiscal nf) {
        System.out.println("Enviando email com dados da nota fiscal.");
        System.out.println("Valor: " + nf.getValor());
        System.out.println("Imposto: " + nf.getImposto());
    }
}
