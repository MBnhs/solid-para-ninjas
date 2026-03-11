package com.marcelo.cap6.antes;

public class Gerente extends Funcionario {

    @Override
    public double bonus() {
        /*
        Qualquer mudança na classe pai impacta no comportamento da classe filho
         */

        return super.bonus() + this.salario * 0.1;
    }

}
