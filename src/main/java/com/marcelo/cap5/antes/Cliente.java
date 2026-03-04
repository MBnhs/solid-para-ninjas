package com.marcelo.cap5.antes;

public class Cliente {

    private boolean inadimplente;

    /*
    Caso esse método mude teremos problemas!
     */
    public void marcaComoInadimplente() {
        inadimplente = true;
    }

    public boolean isInadimplente() {
        return inadimplente;
    }
}
