package com.marcelo.cap5.refactor;

public class ContaCorrente {

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    public void saca(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de saque deve ser positivo");
        }
        if (this.saldo < valor) {
            throw new IllegalStateException("Saldo insuficiente");
        }
        this.saldo -= valor;
    }


    public void deposita(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do depósito deve ser maior que zero.");
        }
        this.saldo += valor;
    }
}
