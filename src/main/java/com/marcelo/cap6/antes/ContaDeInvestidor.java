package com.marcelo.cap6.antes;

public class ContaDeInvestidor extends ContaComum{

    @Override
    public void rende() {
        this.saldo *= 1.3;
    }
}
