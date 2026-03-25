package com.marcelo.cap6.antes;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class RetanguloTest {

    @Test
    public void deveRetornarEixoX() {
        Retangulo retangulo = new Retangulo(5, 2);
        assertThat(retangulo.getX()).isEqualTo(5);
    }

    @Test
    public void deveRetornarEixoY() {
        Retangulo retangulo = new Retangulo(5, 2);
        assertThat(retangulo.getX()).isEqualTo(2);
    }

    @Test
    public void deveCalcularAreaDoRetangulo() {
        Retangulo retangulo = new Retangulo(5, 2);
        assertThat(retangulo.calculaArea()).isEqualTo(10);
    }

    @Test
    public void deveInstanciarUmNovoRetangulo() {

    }

}
