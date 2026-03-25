package com.marcelo.cap7.refactor;

import com.marcelo.cap7.antes.Item;

public class CalculadorDeImpostoExemplo2 {

    /*
    Fazer com que o cliente não precise depender (se acoplar) de coisas das quais ele não precisa é justqamente
    a ideia por trás do ISP (Interface Segregation Principle).
     */


    public double calcula(Tributavel t) {
        double total = 0;
        for (Item item : t.itensASeremTributados()) {
            if (item.valor() > 1000) {
                total += item.valor() * 0.02;
            } else {
                total += item.valor() * 0.01;
            }
        }
        return total;

    }

}
