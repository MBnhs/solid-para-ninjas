package com.marcelo.cap5.antes;

import java.util.List;

public class ProcessadorDeCartaoDeCredito {

    public void processa(List<Transacao> transacoes, Fatura fatura) {

        double total = 0;

        for (Transacao transacao : transacoes) {


            Pagamento pagamento = new Pagamento(transacao.valor(), MeioDePagamento.CARTAO_DE_CREDITO);

            fatura.getPagamentos().add(pagamento);

            total += transacao.valor();

        }

        if (total >= fatura.getValor()) {
            fatura.setPago(true);

        }

    }

}



