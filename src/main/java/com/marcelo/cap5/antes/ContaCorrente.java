package com.marcelo.cap5.antes;

public class ContaCorrente {

    private double saldo;

    public double getSaldo() {
        return saldo;
    }


    /*
    Qualquer classe cliente pode alterar o saldo da conta -> falta de encapsulamento
     */

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
