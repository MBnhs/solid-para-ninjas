package com.marcelo.cap7.refactor;


import com.marcelo.cap7.antes.*;

import java.util.List;

public record NotaFiscal(String titulo, String descricao, Cliente cliente, List<Item> itens,
                         List<Desconto> descontos, Endereco entrega, Endereco cobranca, FormaDePagamento pagto,
                         double valorTotal) implements Tributavel {
    @Override
    public List<Item> itensASeremTributados() {
        return List.of();
    }
}