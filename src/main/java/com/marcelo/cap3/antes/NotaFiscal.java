package com.marcelo.cap3.antes;

public class NotaFiscal {
    private final double valor;
    private final double imposto;

    public NotaFiscal(double valor, double imposto) {
        this.valor = valor;
        this.imposto = imposto;
    }

    public double getValor() {
        return valor;
    }

    public double getImposto() {
        return imposto;
    }
}
