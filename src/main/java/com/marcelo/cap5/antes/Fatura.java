package com.marcelo.cap5.antes;

import java.util.ArrayList;
import java.util.List;

public class Fatura {

    private List<Pagamento> pagamentos;
    private final double valor;
    private boolean pago;
    private Cliente cliente;


    public Fatura(double valor) {
        this.valor = valor;
        pagamentos = new ArrayList<>();
    }

    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public double getValor() {
        return valor;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public boolean isPago() {
        return pago;
    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void marcaComoInadimplente() {
        cliente.marcaComoInadimplente();
    }
}
