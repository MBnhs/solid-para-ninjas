
# Acoplamento e o tal do DIP

## Classe GeradorDeNotaFiscal

A classe GeradorDeNotaFiscal manda e-mail e salva no banco de dados usando um DAO. 
Com o passar do tempo essa mesma classe também pode mandar informações para o SAP, disparará um SMS, consumirá dados de uma API etc.

A classe GeradorDeNotaFiscal vai crescer e passar a depender de muitas classes.
O problema disso é que a uma mudança em qualquer uma dessas classes pode causar mudanças na classe principal.
Além dos problemas das classes impactarem a classe principal, as mudanças também ocasionarão problemas, uma vez que qualquer mudança nas classes que estão sendo utilizadas refletirá na classe principal.

A partir do momento em que uma classe possui muitas dependências, todas elas podem propagar problemas para a classe principal.

O reúso também será dificultado, uma vez que se quisermos reutilizar a classe em outro lugar é necessário levar junto todas as suas dependências.

A classe quando possui muitas dependências torna-se muito frágil.

É impossível de se acabar com todos os acoplamentos em sistemas de médio/grande porte. O que podemos fazer é saber diferenciá-los para se ter a certeza de que são problemáticos ou não.

Acoplamentos não problemáticos são aqueles realizados à classes estáveis, como no exemplo do livro, a interface List. Como ela quase nunca muda, ela não propaga mudanças à classe que a implementa. Mudar a interface List seria uma tarefa difícil pois várias implementações dependem dela, tornando-a uma interface importante. Essa importância faz com que List tenha pouca probabilidade de mudar.

Portanto, devemos realizar acoplamento à classes, interfaces e módulos que sejam estáveis.

Uma possibilidade é utilizar interfaces para buscar classes mais estáveis. Elas não tem código que pode forçar uma mudança. Além disso, mantêm contrato com suas implementações, o que pode desencorajar mudanças de serem feitas nas assinaturas das interfaces.

Caso um novo método seja adicionado numa interface ou até mesmo algum mude, isso terá de ser replicado para todas as suas implementações, o que pode ser um sinal de alerta para futuras implementações. Isso também fará com que a interface seja coesa, com objetivo bem definido, tendo a mudar menos.

"Programe voltado para interfaces" -> maior flexibilidade, várias implementações da interface, tornando ela estável. Ela estando estável, o acoplamento é um problema menor.

Uma maneira de resolver o acoplamento: acoplar-se com módulos estáveis que tendem a mudar menos.



## Outro exemplo de acoplamento

No segundo caso apresentado temos 4 classes fazendo coisas diferentes e que dependem do fluxo tomado durante o processo de despacho de notas fiscais.
Nesse caso, não conseguimos resolver com uma abstração única.

O trecho de código que utiliza um condicional para decidir se o frete será por sedex 10 ou sedex comum apresenta uma responsabilidade muito específica, e isso pode ser ser encapsulado numa classe chamada  EntregadorDeNFs.
Isso faz com que a classe DespachadorDeNotasFiscais dependa agora de  EntregadorDeNFS, deixando de depender de LeiDeEntrega e Correios, como anteriormente.
Essa prática deixa a classe DespachadorDeNotasFiscais mais simples, aumentando a coesão da classe e também facilitando os testes utilizando mocks.


Mais a frente no capítulo, é citado o chamado acoplamento lógico, no qual o acoplamento não aparece tão claramente (como na utilização de imports, por exemplo), mas surge por conta de frameworks e/ou arquiteturas utilizadas. É o caso das aplicações com arquitetura MVC, na qual os controllers estão acoplados às JSPs e qualquer alteração em um controller acaba sendo propagada para sua respectiva JSP vinculada.
