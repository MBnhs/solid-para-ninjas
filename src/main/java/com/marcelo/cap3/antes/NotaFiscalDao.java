package com.marcelo.cap3.antes;

public class NotaFiscalDao {
    public void persiste(NotaFiscal nf) {
        System.out.println("Salvando nota fiscal no banco de dados.");
        System.out.println("Valor: " + nf.getValor());
        System.out.println("Imposto: " + nf.getImposto());
    }
}
