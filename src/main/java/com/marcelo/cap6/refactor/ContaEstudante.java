package com.marcelo.cap6.refactor;

public class ContaEstudante {

    private ManipuladorDeSaldo manipulador;

    public ContaEstudante() {
        this.manipulador = new ManipuladorDeSaldo();
    }

    public void saca(double valor) {
        manipulador.retira(valor);
    }

    public void deposita(double valor) {
        manipulador.adiciona(valor);
    }

    /*
    Utilizamos composição trazendo a classe ManipuladorDeSaldo como atributo
    das classes ContaComum e ContaEstudante.

    Dessa maneira não teremos o method rende aqui.
     */

}
