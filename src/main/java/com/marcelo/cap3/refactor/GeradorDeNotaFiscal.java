package com.marcelo.cap3.refactor;

    /*
        Uma alternativa seria criar uma interface AcaoAposGerarNota que reprenseta a sequência
        de ações que devem ser executadas após sua geração. Assim a classe GeradorDeNotaFiscal
        passa a depender de uma lista de ações e não de cada ação específica.
        Dessa forma o gerador passa a depender apenas da interface que é bastante estável.

     */


import java.util.List;

public class GeradorDeNotaFiscal {

    private final List<AcaoAposGerarNota> acoes;

    public GeradorDeNotaFiscal(List<AcaoAposGerarNota> acoes) {
        this.acoes = acoes;
    }

    public NotaFiscal gera(Fatura fatura) {

        double valor = fatura.getValorMensal();

        NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));

        for (AcaoAposGerarNota acao : acoes) {
            acao.executa(nf);
        }

        return nf;

    }

    private double impostoSimplesSobreO(double valor) {
        return valor * 0.06;
    }

}
