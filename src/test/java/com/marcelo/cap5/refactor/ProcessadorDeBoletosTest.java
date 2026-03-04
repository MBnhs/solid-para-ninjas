package com.marcelo.cap5.refactor;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class ProcessadorDeBoletosTest {

    @Test
    void deveProcessarBoletosETornarFaturaPaga() {

        var processadorDeBoletos = new ProcessadorDeBoletos();

        var boletos = Arrays.asList(new Boleto(100.0),
                new Boleto(150.0),
                new Boleto(50.0));

        var fatura = new Fatura(300.0);

        processadorDeBoletos.processa(boletos, fatura);

        assertThat(fatura.isPago()).isTrue();


    }


    @Test
    void deveProcessarBoletosENaoTornarFaturaPaga() {

        var processadorDeBoletos = new ProcessadorDeBoletos();

        var boletos = Arrays.asList(new Boleto(100.0),
                new Boleto(150.0),
                new Boleto(50.0));

        var fatura = new Fatura(1000.0);

        processadorDeBoletos.processa(boletos, fatura);

        assertThat(fatura.isPago()).isFalse();


    }


}
