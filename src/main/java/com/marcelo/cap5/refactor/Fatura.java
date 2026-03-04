package com.marcelo.cap5.refactor;

import com.marcelo.cap5.antes.Cliente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fatura {

    private List<Pagamento> pagamentos;
    private final double valor;
    private boolean pago;


    public Fatura(double valor) {
        this.valor = valor;
        pagamentos = new ArrayList<>();
    }

    public List<Pagamento> getPagamentos() {
        return Collections.unmodifiableList(pagamentos);
    }

    public void adicionaPagamento(Pagamento pagamento) {
        this.pagamentos.add(pagamento);

        if (valorTotalDosPagamentos() >= this.valor) {
            this.pago = true;
        }

    }

    private double valorTotalDosPagamentos() {
        double total = 0;
        total = pagamentos.stream().mapToDouble(Pagamento::valor).sum();
        return  total;
    }


    public double getValor() {
        return valor;
    }


    public boolean isPago() {
        return pago;
    }


}
