package com.marcelo.cap3.antes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class DespachadorDeNotasFiscaisTest {

    private DespachadorDeNotasFiscais despachador;

    @Mock
    private NotaFiscalDao dao;

    @Mock
    private CalculadorDeImposto impostos;

    @Mock
    private LeiDeEntrega lei;

    @Mock
    private Correios correios;


    @BeforeEach
    void setUp() {
        despachador = new DespachadorDeNotasFiscais(dao, impostos, lei,  correios);
    }

    @Test
    @DisplayName("Deve despachar Nota Fiscal")
    void deveDespacharNotaFiscal() {

        NotaFiscal nf = new NotaFiscal(200, 0.06);


        when(lei.deveEntregarUrgente(any(NotaFiscal.class))).thenReturn(true);
        despachador.processa(nf);

        verify(impostos).para(nf);
        verify(dao).persiste(nf);
        verify(correios).enviaPorSedex10(nf);
        verify(lei).deveEntregarUrgente(nf);

    }

}
