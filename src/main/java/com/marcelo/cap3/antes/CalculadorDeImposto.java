package com.marcelo.cap3.antes;

public class CalculadorDeImposto {
    public double para(NotaFiscal nf) {
        return nf.getValor() * 0.06;
    }
}
