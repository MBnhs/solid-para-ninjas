package com.marcelo.cap6.refactor;

public class ContaComum {

    private ManipuladorDeSaldo manipulador;

    public ContaComum() {
        this.manipulador = new ManipuladorDeSaldo();
    }

    public void saca(double valor) {
        manipulador.retira(valor);
    }

    public void deposita(double valor) {
        manipulador.adiciona(valor);
    }

    public void rende() {
        manipulador.juros(0.1);
    }

}
