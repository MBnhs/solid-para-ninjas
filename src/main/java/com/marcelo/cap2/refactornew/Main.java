package com.marcelo.cap2.refactornew;

import static com.marcelo.cap2.refactornew.Cargo.*;

public class Main {

    public static void main(String[] args) {
        var dev = new Funcionario(DESENVOLVEDOR, 3500);
        var dba = new Funcionario(DBA, 5000);
        var tester = new Funcionario(TESTER, 3000);

        var calculadoraDeSalario = new CalculadoraDeSalario();


        System.out.println(dev.cargo());
        System.out.println(dev.salarioBase());
        System.out.println(calculadoraDeSalario.calcula(dev));

        System.out.println(dba.cargo());
        System.out.println(dba.salarioBase());
        System.out.println(calculadoraDeSalario.calcula(dba));

        System.out.println(tester.cargo());
        System.out.println(tester.salarioBase());
        System.out.println(calculadoraDeSalario.calcula(tester));
    }
}
