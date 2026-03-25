package com.marcelo.cap7.antes;

public class IXMX implements Imposto {
    @Override
    public NotaFiscal geraNota() {
        throw new NaoGeraNotaException();
    }

    @Override
    public double imposto(double valorCheio) {
        return 0.2 * valorCheio;
    }
}
