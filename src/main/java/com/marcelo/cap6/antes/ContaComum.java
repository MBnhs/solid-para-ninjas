package com.marcelo.cap6.antes;

public class ContaComum {

    protected double saldo;

    public ContaComum() {
        this.saldo = 0;
    }

    public void deposita(double valor) {
        if (valor <= 0) {
            throw new ValorInvalidoException();
        }

        this.saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void rende() {
        this.saldo *= 1.1;
    }
}
