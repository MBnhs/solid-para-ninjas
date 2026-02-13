package com.marcelo.cap2.antes;


import static com.marcelo.cap2.antes.Cargo.DESENVOLVEDOR;
import static com.marcelo.cap2.antes.Cargo.DBA;
import static com.marcelo.cap2.antes.Cargo.TESTER;



/*
    Essa classe tem tudo para ser uma daquelas classes gigantescas,
    cheias de if e else, com que estamos acostumados.
    Ela não tem nada de coesa.

    Imagine só essa classe com 15, 20, 30 cargos diferentes.
    A sequência de ifs seria um pesadelo.
    Além disso, cada cargo teria sua implementação de cálculo diferente, ou seja,
    mais algumas dezenas de métodos privados.
    Agora tente complicar um pouco essas regras de cálculo. Um caos.

*/
public class CalculadoraDeSalario {

    public double calcula(Funcionario funcionario) {
        if(DESENVOLVEDOR.equals(funcionario.getCargo())) {
            return dezOuVintePorCento(funcionario);
        }

        if (DBA.equals(funcionario.getCargo()) ||
                TESTER.equals(funcionario.getCargo())) {
            return quinzeOuVinteCincoPorcento(funcionario);
        }


        throw new RuntimeException("funcionario  invalido");
    }

    private double quinzeOuVinteCincoPorcento(Funcionario funcionario) {
        if (funcionario.getSalarioBase() > 3000.0) {
            return funcionario.getSalarioBase() * 0.75;
        } else {
            return funcionario.getSalarioBase() * 0.85;
        }
    }

    private double dezOuVintePorCento(Funcionario funcionario) {
        if (funcionario.getSalarioBase() > 2000.0) {
            return funcionario.getSalarioBase() * 0.8;
        } else {
            return funcionario.getSalarioBase() * 0.9;
        }
    }

}
