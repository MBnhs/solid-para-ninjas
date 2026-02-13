package com.marcelo.cap2.refactornew;

public enum Cargo {

    DESENVOLVEDOR, DBA, TESTER;


    /**
     * Este metodo utiliza a 'Switch Expression', introduzida oficialmente no Java 14.
     * * Principais funcionalidades da 'Switch Expression':
     * 1. Switch como Expressão: O bloco switch agora retorna um valor diretamente (pode ser usado com 'return').
     * 2. Sintaxe de Flecha (->): Substitui o ':' e elimina a necessidade do 'break', evitando erros de fall-through.
     * 3. Múltiplos Rótulos: Permite agrupar casos na mesma linha separados por vírgula (ex: case DBA, TESTER).
     * 4. Exaustividade: O compilador garante que todos os valores do Enum foram tratados,
     * dispensando o uso de 'default' quando todos os itens são cobertos.
     */


    public double calcula(Funcionario funcionario) {
        return switch (this) {
            case DESENVOLVEDOR -> funcionario.salarioBase() > 3000.0 ? funcionario.salarioBase() * 0.8 : funcionario.salarioBase() * 0.9;
            case DBA, TESTER -> funcionario.salarioBase() > 2000.0 ? funcionario.salarioBase() * 0.75 : funcionario.salarioBase() * 0.85;
        };
    }


}
