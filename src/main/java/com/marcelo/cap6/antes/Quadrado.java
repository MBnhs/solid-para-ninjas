package com.marcelo.cap6.antes;

public class Quadrado extends Retangulo{
    public Quadrado(int x) {
        /*
        Está apertando os dados de entrada do construtor da superclasse, restringindo os tipos de entrada.
        Herança não pode ser feita nesse caso.
         */
        super(x, x);
    }
}
