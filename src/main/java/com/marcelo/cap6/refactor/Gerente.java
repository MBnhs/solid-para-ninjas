package com.marcelo.cap6.refactor;

import com.marcelo.cap6.antes.Funcionario;

public class Gerente extends Funcionario {

    @Override
    public double bonus() {
        /*
        O ideal seria a classe ter sua própria implementação, não dependendo do código fonte da classe pai.

         */

        return this.salario * 0.3;
    }


    public double bonusUsandoOComportamentoDaClassePai() {
        /*
        Podemos utilizar o method da classe pai caso nao alteremos seu comportamento.
        Conforme citado anteriormente, nesse exemplo não "apertamos" o tipo da entrada e também
        não alteramos comportamento.
        A regra de negócio aqui é clara: O bônus do gerente será igual o bonus do funcionário mais
        500 reais. Ou seja, comportamento da classe pai mantido com sucesso.
         */


        return super.bonus() + 500;
    }
}
