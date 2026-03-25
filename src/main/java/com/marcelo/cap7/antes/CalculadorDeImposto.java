package com.marcelo.cap7.antes;


public class CalculadorDeImposto {

    /*
    Não há necessidade de receber a classe NotaFiscal inteira aqui.
    Receber somente uma lista de intems ou um double seria genérico demais, quaisquer outras variáveis com a mesma
    tipagem poderiam ser passadas também.

    Além disso a classe NotaFical aparenta ser muito instável também.

    A solução: utilização de abstração para criar a interface Tributavel.
     */

    public double calcula(NotaFiscal nf) {
        double total = 0;
        for (Item item : nf.itens()) {
            if (item.valor() > 1000) {
                total += item.valor() * 0.02;
            } else {
                total += item.valor() * 0.01;
            }
        }
        return total;
    }

}
