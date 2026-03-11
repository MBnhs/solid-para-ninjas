package com.marcelo.cap6.antes;

import java.util.Arrays;
import java.util.List;

public class ProcessadorDeInvestimentos {


    public static void main(String[] args) {

        for (ContaComum conta : contasDoBanco()) {

            /*
            Irá ocorrer exception pois a conta estudante lança uma exception em rende()
            simplesmente por conta da classe não possuir essa regra (regra de negócio).

            A utilização de herança nos força a apresentar algum tipo de implementação para rende(),
            mesmo que essa implementação não exista na regra de negócio.
            O lançamento de exception foi o artifício utilizado para contornar isso.

            Isso impacta a utilização do sistema pois temos um erro em tempo de execução ao executar
            o ProcessadorDeInvestimentos, dado que não sabemos com extensão da classe ContaComum iremos executar.


            Classes filhas precisam respeitar os contratos definidos pela classe pai.


            Para utilizar herança devemos pensar nas pré e pós condições que a classe pai definiu.

            Pré: dados que chegam na classe.
                deposita() deve receber números maiores que zero.
                Caso uma classe filha mude essa condição para somente números maiores que 10
                ela trocou a pré-condição da classe pai, ou seja, trocou os dados de entrada da classe.
                Nesse caso a herança não deve ser utilizada.

            Pós: dados que saem da classe como um resultado ou comportamento.
                No caso de rende() o esperado era que um cálculo de rendimento fosse realizado.
                Realizar o lançamento de exceção mudou esse comportamento esperado.
                Outro indicativo de não utilização de herança.


            As regras somente podem mudar em cenários específicos.

            Nas pré condições podemos "afrouxar" a regra utilizada, de maneira com que a funcionalidade
            da classe pai ainda seja funcional e alguma funcionalidade adicional da classe filha seja
            executada. Por exemplo, a classe pai recebendo inteiros de 1 a 100 e a classe filha recebendo
            inteiros de 1 a 200.

            Já na pós condição a funcionalidade pode somente ser "apertada". Como por exemplo a classe pai
            retornando números de 1 a 100 e a classe filha retornando números de 1 a 50.

            Essa regras garantem o funcionamento do código ao utilizar herança, isso porque elas nos garantem
            que independemente do tipo de classe usada (classe pai ou filha) as condições estabelecidas pela
            classe pai serão respeitadas. Isso evita comportamentos inesperados executados pelas classes filhas.
            E ainda, garante que o código irá funcionar independente do tipo de classe que está sendo instanciado.

            Devemos sempre lembrar do contato estabelecido pela classe pai ->  Princípio de Substituição de Liskov.

             */
            conta.rende();

            System.out.println("Novo Saldo: ");
            System.out.println(conta.getSaldo());
        }



    }

    private static List<ContaComum> contasDoBanco() {
        var contaEstudante = new ContaDeEstudante();
        contaEstudante.deposita(400);

        var contaInvestidor = new ContaDeInvestidor();
        contaInvestidor.deposita(10000);

        return Arrays.asList(contaEstudante, contaInvestidor);

    }

}
