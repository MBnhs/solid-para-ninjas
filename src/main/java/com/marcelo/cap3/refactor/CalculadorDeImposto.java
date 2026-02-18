package com.marcelo.cap3.refactor;


public class CalculadorDeImposto {
    public double para(NotaFiscal nf) {
        return nf.getValor() * 0.06;
    }
}
