package com.marcelo.cap6.antes;

public class Funcionario {

    protected double salario;

    /*
    Uma maneira de evitar a quebra de encapsulamento é evitar o uso de atributos protected na classe pai.
    Ao utilizar private evitamos que as classes filhas alterem diretamente os atributos da classe pai sem
    nenhum tipo de controle.

    Para evitar a quebra de encapsulamento podemos definir os atributos como private e os métodos que o alteram
    (que terão as validações necessárias) como protected.
     */
    private double valeRefeicao;


    public double bonus() {
        return salario * 0.2;
    }

    protected double valeNatal() {
        if (valeRefeicao <= 1000.0) {
            return valeRefeicao * 2;
        }
         return valeRefeicao;
    }

}
