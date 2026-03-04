package com.marcelo.cap5.antes;

import java.util.List;

public class ProcessadorDeBoletos {

    public void processa(List<Boleto> boletos, Fatura fatura) {

        double total = 0;

        for(Boleto boleto : boletos) {


            Pagamento pagamento = new Pagamento(boleto.valor(), MeioDePagamento.BOLETO);

            /*
            Nessa caso o get pode trazer problemas! Quebra de encapsulamento!
             */
            fatura.getPagamentos().add(pagamento);

            // Acoplamento somente com a classe List
            total += boleto.valor();

        }

        /*
            Encapsulamento: classe esconder detalhes da implementação dentro de métodos
            Ganhos:
                Facilidade de se alterar a implementação em um ponto, imperceptível ao resto do sistema
                Evita regras de negócio espalhadas em lugares diferentes.

            Falta de encapsulamento: regra específica da classe Fatura está na classe ProcessadorDeBoletos
            Em caso de mudança da regra teremos que altera-la em diversos pontos do código

            Classe fatura deve saber quando ou não ser definida como paga.
         */

        if (total >= fatura.getValor()) {
            fatura.setPago(true);

        }

    }

}
