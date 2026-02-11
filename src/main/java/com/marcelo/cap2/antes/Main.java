package com.marcelo.cap2.antes;


import static com.marcelo.cap2.antes.Cargo.DESENVOLVEDOR;
import static com.marcelo.cap2.antes.Cargo.DBA;
import static com.marcelo.cap2.antes.Cargo.TESTER;

public class Main {

    public static void main(String[] args) {
        var dev = new Funcionario(DESENVOLVEDOR, 3500);
        var dba = new Funcionario(DBA, 5000);
        var tester = new Funcionario(TESTER, 3000);

        var calculadoraDeSalario = new CalculadoraDeSalario();


        System.out.println(dev.getCargo());
        System.out.println(dev.getSalarioBase());
        System.out.println(calculadoraDeSalario.calcula(dev));

        System.out.println(dba.getCargo());
        System.out.println(dba.getSalarioBase());
        System.out.println(calculadoraDeSalario.calcula(dba));

        System.out.println(tester.getCargo());
        System.out.println(tester.getSalarioBase());
        System.out.println(calculadoraDeSalario.calcula(tester));
    }
}
