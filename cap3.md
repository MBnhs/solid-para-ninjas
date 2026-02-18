

## Outro exemplode acoplamento

No segundo caso apresentado temos 4 classes fazendo coisas diferentes e que dependem do fluxo tomado durante o processo de despacho de notas fiscais.
Nesse caso, não conseguimos resolver com uma abstração única.

O trecho de código que utiliza um condicional para decidir se o frete será por sedex 10 ou sedex comum apresenta uma responsabilidade muito específica, e isso pode ser ser encapsulado numa classe chamada  EntregadorDeNFs.
Isso faz com que a classe DespachadorDeNotasFiscais dependa agora de  EntregadorDeNFS, deixando de depender de LeiDeEntrega e Correios, como anteriormente.
Essa prática deixa a classe DespachadorDeNotasFiscais mais simples, aumentando a coesão da classe e também facilitando os testes utilizando mocks.


Mais a frente no capítulo, é citado o chamado acoplamento lógico, no qual o acoplamento não aparece tão claramente (como na utilização de imports, por exemplo), mas surge por conta de frameworks e/ou arquiteturas utilizadas. É o caso das aplicações com arquitetura MVC, na qual os controllers estão acoplados às JSPs e qualquer alteração em um controller acaba sendo propagada para sua respectiva JSP vinculada.
