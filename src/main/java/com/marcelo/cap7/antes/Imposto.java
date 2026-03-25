package com.marcelo.cap7.antes;

public interface Imposto {

    /*
    Fat interface: possui dois métod_os e algumas classes que implementam essa interface
    não possuim implementação para esses métod_os.

    Podemos lançar exception para os casos em que algum métod_o não for implementado,
    mas isso altera o contrato da classe e quebra as classes clientes que utilizam
    as implementações dessa interface.
     */


    NotaFiscal geraNota();
    double imposto(double valorCheio);

}
