package com.marcelo.cap7.refactor;

    /*
    Diminuição do risco de acoplamento, interface Tributavel é muito mais estável que a classe NotaFiscal;

    Métod_o calcula() recebe apenas o que realmente precisa.

    Aumento de semântica pois não recebemos uma lista ou double qualquer, e sim algo passível de tributação
     */


import com.marcelo.cap7.antes.Item;

import java.util.List;

public interface Tributavel {

    List<Item> itensASeremTributados();

}
