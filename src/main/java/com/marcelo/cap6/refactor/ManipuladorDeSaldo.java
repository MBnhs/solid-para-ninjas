package com.marcelo.cap6.refactor;

public class ManipuladorDeSaldo {

    private double saldo;

    public void adiciona(double valor) {
        saldo += valor;
    }

    public void retira(double valor) {
        saldo -= valor;
    }

    public void juros(double valor) {
        saldo += saldo * valor;
    }

    public double getSaldo() {
        return saldo;
    }

}
