package com.marcelo.cap2.refactornew;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;



class CalculadoraDeSalarioTest {

    private CalculadoraDeSalario calculadoraDeSalario;

    @BeforeEach
    void setUp() {
        this.calculadoraDeSalario = new CalculadoraDeSalario();
    }

    @Test
    @DisplayName("Deve calcular salário de DESENVOLVEDOR com 20% de desconto (acima do limite)")
    void deveCalcularSalarioDevAcimaDoLimite() {
        var dev = new Funcionario(Cargo.DESENVOLVEDOR, 5000.0);

        var resultado = calculadoraDeSalario.calcula(dev);

        assertThat(resultado)
                .isEqualTo(4000.0)
                .as("Desenvolvedores com salário acima de 3000 devem ter 20% de desconto");
    }

    @Test
    @DisplayName("Deve calcular salário de DESENVOLVEDOR com 10% de desconto (abaixo do limite)")
    void deveCalcularSalarioDevAbaixoDoLimite() {
        var dev = new Funcionario(Cargo.DESENVOLVEDOR, 3000.0);

        var resultado = calculadoraDeSalario.calcula(dev);

        assertThat(resultado)
                .isEqualTo(2700.0)
                .as("Desenvolvedores com salário até 3000 devem ter 10% de desconto");
    }

}
