package com.marcelo.cap3.refactor;


public class Correios {
    public void enviaPorSedex10(NotaFiscal nf) {
        System.out.println("Enviando nota fiscal valor "+ nf.getValor() +" por sedex normal");
    }

    public void enviaPorSedexComum(NotaFiscal nf) {
        System.out.println("Enviando nota fiscal valor "+ nf.getValor() +" por sedex normal");
    }
}
