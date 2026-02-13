package com.marcelo.cap2.refactornew;

public class CalculadoraDeSalario {

    public double calcula(Funcionario funcionario) {
        return funcionario.cargo().calcula(funcionario);
    }


}
