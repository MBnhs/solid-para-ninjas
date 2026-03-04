package com.marcelo.cap5.antes;

public class LeiDeDemeter {


    public void algumMetodo() {
        Fatura fatura = pegaFaturaDeAlgumLugar();

        /*
            Cadeia de invocações de métodos
            A.getB().getC().getD().metodoQualquer() -> quebra de encapsulamento
            Em caso de mudanças erros são propagados
         */

        fatura.getCliente().marcaComoInadimplente();
    }


    public void algumMetodoRefatorado() {
        Fatura fatura = pegaFaturaDeAlgumLugar();
        fatura.marcaComoInadimplente();
    }


    private Fatura pegaFaturaDeAlgumLugar() {
        Fatura fatura = new Fatura(100.0);
        fatura.setCliente(new Cliente());
        return fatura;
    }

}
