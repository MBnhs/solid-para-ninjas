package com.marcelo.cap7.antes;

import org.checkerframework.checker.units.qual.N;

public class ISS implements Imposto {

    @Override
    public NotaFiscal geraNota() {
        return new NotaFiscal(
                "Alguma informação aqui",
                "Alguma outra informação aqui"
        );
    }

    @Override
    public double imposto(double valorCheio) {
        return 0.1 * valorCheio;
    }
}
