package com.marcelo.cap2.refactornew;

public enum Cargo {

    DESENVOLVEDOR, DBA, TESTER;


    public double calcula(Funcionario funcionario) {
        return switch (this) {
            case DESENVOLVEDOR -> funcionario.salarioBase() > 3000.0 ? funcionario.salarioBase() * 0.8 : funcionario.salarioBase() * 0.9;
            case DBA, TESTER -> funcionario.salarioBase() > 2000.0 ? funcionario.salarioBase() * 0.75 : funcionario.salarioBase() * 0.85;
        };
    }


}
