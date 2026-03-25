package com.marcelo.cap7.refactor;

import com.marcelo.cap5.antes.NotaFiscal;

public class ISS implements CalculadorDeImposto, GeradorDeNota {

    @Override
    public double imposto(double valorCheio) {
        return 0;
    }

    @Override
    public NotaFiscal geraNota() {
        return null;
    }
}
