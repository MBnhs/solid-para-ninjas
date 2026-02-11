package com.marcelo.cap2.refactor;

public class CalculadoraDeSalario {

    public double calcula(Funcionario funcionario) {
        return funcionario.getCargo().getRegraDeCalculo().calcula(funcionario);
    }


}
