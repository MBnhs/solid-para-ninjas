package com.marcelo.cap5.antes;


public class IntimidadeInapropriada {


    public double calculaValor() {

        NotaFiscal nf = new NotaFiscal(1000, 800);
        double valor;

        /*
            Asking!
            Tell, Don't ask
            Devemos dizer ao objeto o que fazer e não fazer uma pergunta a ele
         */
        if (nf.getValorSemImposto() > 10000)  {
            valor = 0.06 * nf.getValor();
        } else {
            valor = 0.12 * nf.getValor();
        }

        return valor;
    }

    public double CalculaValorRefatorado() {

        NotaFiscal nf = new NotaFiscal(1000, 800);
        /*
            Telling!
            O que faz? Calcula imposto.
            Como faz? Não sabemos! Sinal de encapsulamento!

            Não pensar somente nas classes mas também nas classes clientes desta.
         */
        return nf.calculaValorImposto();
    }

}
