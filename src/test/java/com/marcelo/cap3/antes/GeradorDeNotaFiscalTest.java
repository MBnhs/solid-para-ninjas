package com.marcelo.cap3.antes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GeradorDeNotaFiscalTest {

    private GeradorDeNotaFiscal geradorDeNotaFiscal;

    private EnviadorDeEmail email;
    private NotaFiscalDao dao;

    @BeforeEach
    void setUp() {
        this.dao = new NotaFiscalDao();
        this.email = new EnviadorDeEmail();

        this.geradorDeNotaFiscal = new GeradorDeNotaFiscal(email, dao);
    }

    @Test
    @DisplayName("Deve calcular salário de DESENVOLVEDOR com 20% de desconto (acima do limite)")
    void deveGerarNotaFiscal() {

        Fatura fatura = new Fatura(100);

        geradorDeNotaFiscal.gera(fatura);


    }

}
