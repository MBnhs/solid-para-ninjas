package com.marcelo.cap5.antes;

public class NotaFiscal {

    private final double valor;
    private final double valorSemImposto;

    public NotaFiscal(double valor, double valorSemImposto) {
        this.valor = valor;
        this.valorSemImposto = valorSemImposto;
    }

    public double getValor() {
        return valor;
    }

    public double getValorSemImposto() {
        return valorSemImposto;
    }

    public double calculaValorImposto() {

        double valorImposto;


        if (valorSemImposto > 10000) {
            valorImposto = 0.06 * valor;
        } else {
            valorImposto = 0.12 * valor;
        }

        return valorImposto;
    }
}
