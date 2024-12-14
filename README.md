# Padrões de projeto escolhidos:

## Comportamental:
### Observer 
O padrão Observer foi criado para resolver problemas relacionados a conflitos em certas situações, como a que sugere o Refactoring Guru (um cliente fica muito interessado em X item, ele visita a loja N todo dia esperando esse X item estar dispónivel, e para impedir isso a loja manda emails de spam a todos os seus clientes que X item não está disponível, entretanto isso pode irritar outros clientes).</br>
Para resolver isso, o padrão Observer cria um método de Assinatura, para que apenas os interessados em X produto recebe atualizações sobre tal.</br>
Observer em UML:</br>
![image](https://github.com/user-attachments/assets/f52a1be8-b9d7-4f8c-85ff-b97d6cff811b)</br>
Créditos da imagem: https://www.uml-diagrams.org/observer-pattern-uml-composite-diagram-example.html </br>

Código explicado: </br>

Imagine que você tem dois tipos de objetos: um Cliente e uma Loja. O cliente está muito interessado em uma marca particular de um produto (digamos que seja um novo modelo de iPhone) que logo deverá estar disponível na loja.

O cliente pode visitar a loja todos os dias e checar a disponibilidade do produto. Mas enquanto o produto ainda está a caminho, a maioria desses visitas serão em vão.

Visitando a loja vs. enviando spam

Por outro lado, a loja poderia mandar milhares de emails (que poderiam ser considerados como spam) para todos os clientes cada vez que um novo produto se torna disponível. Isso salvaria alguns clientes de incontáveis viagens até a loja. Porém, ao mesmo tempo, irritaria outros clientes que não estão interessados em novos produtos.

Parece que temos um conflito. Ou o cliente gasta tempo verificando a disponibilidade do produto ou a loja gasta recursos notificando os clientes errados.

## Criacional:

## Estrutural:
### Facade
O padrão facade foi criado para resolver problemas relacionado ao conjunto de amplas bibliotecas/frameworks devido a dificiculdade de compreender e manter tais códigos.</br>
"Facede" / "Fachada" é uma classe com interface simples, contendo apenas o que o que importa para o cliente.</br>
O site Refactoring Guru da como exemplo uma aplicação de videos curtos, em que pode-se usar uma biblioteca de video profissional para converter, mas que na verdade só necessita um único método para funcionar.</br>
Facade em UML:</br>
![image](https://github.com/user-attachments/assets/57b5a37c-bd35-4a71-8544-462910ed45b8)</br>
Creditos da imagem: https://www.ateomomento.com.br/facade-padrao-de-projeto/<br>

Código explicado: Como podemos ver, há muitos "métodos" e 3 "classess" que facilmente podem ser substituidas por apenas 1 classe.</br>
O facade faz justamente isso, tornando o código mais "fácil" de ser entendível e além disso, mais prático de ser mantido.</br>


Coloque os códigos de exemplo de cada padrão em uma linguagem de programação qualquer. 
Demonstre para que serve o padrão escolhido, explicando qual problema ele resolve, qual a solução, diagrama UML que descreve o propósito geral do padrão escolhido e o código explicado no Readme.md do repositório com o exemplo.


Os códigos gerados estarão em outros locais.

TODOS OS CRÉDITOS DA PESQUISA AO Refactoring Guru
