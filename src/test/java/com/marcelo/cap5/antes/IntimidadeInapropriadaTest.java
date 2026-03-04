package com.marcelo.cap5.antes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IntimidadeInapropriadaTest {

    @Test
    void exemploIntimidadeInapropriada() {
        IntimidadeInapropriada intimidadeInapropriada = new IntimidadeInapropriada();

        intimidadeInapropriada.calculaValor();
        intimidadeInapropriada.CalculaValorRefatorado();


        assertThat(intimidadeInapropriada.calculaValor())
                .isEqualTo(intimidadeInapropriada.CalculaValorRefatorado());
    }

}
