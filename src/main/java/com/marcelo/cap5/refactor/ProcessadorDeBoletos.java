package com.marcelo.cap5.refactor;

import java.util.List;

public class ProcessadorDeBoletos {

    public void processa(List<Boleto> boletos, Fatura fatura) {

        for(Boleto boleto : boletos) {
            Pagamento pagamento = new Pagamento(boleto.valor(), MeioDePagamento.BOLETO);
            fatura.adicionaPagamento(pagamento);

        }

    }

}
