package com.marcelo.cap3.antes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class GeradorDeNotaFiscalTest {

    private GeradorDeNotaFiscal geradorDeNotaFiscal;

    @Mock
    private EnviadorDeEmail email;

    @Mock
    private NotaFiscalDao dao;

    @BeforeEach
    void setUp() {
        this.geradorDeNotaFiscal = new GeradorDeNotaFiscal(email, dao);
    }

    @Test
    @DisplayName("Deve gerar Nota Fiscal")
    void deveGerarNotaFiscal() {

        Fatura fatura = new Fatura(100);

        NotaFiscal nf = geradorDeNotaFiscal.gera(fatura);

        verify(email).enviaEmail(nf);
        verify(dao).persiste(nf);


    }

}
