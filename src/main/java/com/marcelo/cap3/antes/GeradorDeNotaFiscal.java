package com.marcelo.cap3.antes;

public class GeradorDeNotaFiscal {

    // Classe GeradorDeNotaFical está acoplada ao EnviadorDeEmail e NotaFiscalDao.
    private final EnviadorDeEmail email;
    private final NotaFiscalDao dao;

    /* Hoje essa classe manda e-mail e salva no banco de dados usando um DAO. Amanhã essa mesma classe também
     mandará informações para o SAP, disparará um SMS, consumirá dados de uma API etc.
     A classe GeradorDeNotaFiscal vai crescer e passar a depender de muitas classes.

     O problema disso é que a uma mudança em qualquer uma dessas classes pode causar mudanças na classe principal.
     Além dos problemas das classes impactarem a classe principal, as mudanças também ocasionarão problemas, uma vez
     que qualquer mudança nas classes que estão sendo utilizadas refletirá na classe principal.

     A partir do momento em que uma classe possui muitas dependências, todas elas podem propagar problemas para a
     classe principal.

     O reúso também será dificultado, uma vez que se quisermos reutilizar a classe em outro lugar é necessário levar
     junto todas as suas dependências.

     A classe quando possui muitas dependências torna-se muito frágil.

     É impossível de se acabar com todos os acoplamentos em sistemas de médio/grande porte. O que podemos fazer é
     saber diferenciá-los para se ter a certeza de que são problemáticos ou não.

     Acoplamentos não problemáticos são aqueles realizados à classes estáveis, como no exemplo do livro, a interface
     List. Como ela quase nunca muda, ela não propaga mudanças à classe que a implementa. Mudar a interface List seria
     uma tarefa difícil pois várias implementações dependem dela, tornando-a uma interface importante. Essa importância
     faz com que List tenha pouca probabilidade de mudar.

     Portanto, devemos realizar acoplamento à classes, interfaces e módulos que sejam estáveis.

     Uma possibilidade é utilizar interfaces para buscar classes mais estáveis. Elas não tem código que pode forçar uma
     mudança. Além disso, mantêm contrato com suas implementações, o que pode desencorajar mudanças de serem feitas nas
     assinaturas das interfaces.

     Caso um novo method seja adicionado numa interface ou até mesmo algum mude, isso terá de ser replicado para todas
     as suas implementações, o que pode ser um sinal de alerta para futuras implementações. Isso também fará com que
     a interface seja coesa, com objetivo bem definido, tendo a mudar menos.

    "Programe voltado para interfaces" -> maior flexibilidade, várias implementações da interface, tornando ela estável.
    Ela estando estável, o acoplamento é um problema menor.

    Uma maneira de resolver o acoplamento: acoplar-se com módulos estáveis que tendem a mudar menos.

     */


    public GeradorDeNotaFiscal(EnviadorDeEmail email, NotaFiscalDao dao) {
        this.email = email;
        this.dao = dao;
    }

    public NotaFiscal gera(Fatura fatura) {

        double valor = fatura.getValorMensal();

        NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));


        email.enviaEmail(nf);
        dao.persiste(nf);

        return nf;

    }

    private double impostoSimplesSobreO(double valor) {
        return valor * 0.06;
    }


}
