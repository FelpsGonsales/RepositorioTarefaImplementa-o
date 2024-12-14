# Padrões de projeto escolhidos:

## Comportamental:
### Observer 
O padrão Observer foi criado para resolver problemas relacionados a conflitos em certas situações, como a que sugere o Refactoring Guru (um cliente fica muito interessado em X item, ele visita a loja N todo dia esperando esse X item estar dispónivel, e para impedir isso a loja manda emails de spam a todos os seus clientes que X item não está disponível, entretanto isso pode irritar outros clientes).</br>
Para resolver isso, o padrão Observer cria um método de Assinatura, para que apenas os interessados em X produto recebe atualizações sobre tal.</br>
Observer em UML:</br>
![image](https://github.com/user-attachments/assets/f52a1be8-b9d7-4f8c-85ff-b97d6cff811b)</br>
Créditos da imagem: https://www.uml-diagrams.org/observer-pattern-uml-composite-diagram-example.html </br>

Código explicado: Como podemos ver, o código de exemplo mostra a implementação de um observer com um teste.</br>
No caso, os usuários 1 e 2 receberão atualizações, mensagens que algo novo chegou. Também há o exemplo de adicionar e excluir usuarios das "observações"</br> 

## Criacional:
### Flyweight (Peso mosca, Cache)
Esse padrão de projeto é mais relacionado a problemas em RAM, geralmente em jogos. </br>
Foi criado para resolver problemas com quantias issuficientes em RAM. </br> 
No exemplo apresentado pelo site Refactoring Guru, uma pessoa fez um jogo mas o jogo "quebrou" por falta de RAM devido ao excesso de partículas no jogo. </br>
Para resolver isso, o padrão Flyweight passa o objeto que está dando problemas para métodos específicos que dependem dele. </br>
Flyweight em UML do exemplo apresentado: </br>
![image](https://github.com/user-attachments/assets/83286482-7735-4846-a35d-fcd9ee265860) </br>
Creditos ao Refactoring Guru: https://refactoring.guru/pt-br/design-patterns/flyweight </br>

Código explicado: </br>
A interface Forma define o método desenhar, usado para renderizar a forma.</br>
A classe Circulo implementa Forma. Ela armazena o estado intrínseco (fixo) e utiliza parâmetros externos para o estado extrínseco (variável), como posição e cor. </br>
A FormaFactory gerencia a criação de objetos Forma. Ela reutiliza objetos já criados para o mesmo tipo, garantindo economia de memória.</br>
No teste, múltiplas formas Círculo são criadas com diferentes estados extrínsecos, mas internamente reutilizam a mesma instância para o tipo "Círculo". </br>

## Estrutural:
### Facade
O padrão facade foi criado para resolver problemas relacionado ao conjunto de amplas bibliotecas/frameworks devido a dificiculdade de compreender e manter tais códigos.</br>
"Facede" / "Fachada" é uma classe com interface simples, contendo apenas o que o que importa para o cliente.</br>
O site Refactoring Guru da como exemplo uma aplicação de videos curtos, em que pode-se usar uma biblioteca de video profissional para converter, mas que na verdade só necessita um único método para funcionar.</br>
Facade em UML:</br>
![image](https://github.com/user-attachments/assets/57b5a37c-bd35-4a71-8544-462910ed45b8)</br>
Creditos da imagem: https://www.ateomomento.com.br/facade-padrao-de-projeto/<br>

Código explicado: Como podemos ver, há muitos "métodos" e 3 "classes" que facilmente podem ser substituidas por apenas 1 classe.</br>
O facade faz justamente isso, tornando o código mais "fácil" de ser entendível e além disso, mais prático de ser mantido.</br>


Coloque os códigos de exemplo de cada padrão em uma linguagem de programação qualquer. 
Demonstre para que serve o padrão escolhido, explicando qual problema ele resolve, qual a solução, diagrama UML que descreve o propósito geral do padrão escolhido e o código explicado no Readme.md do repositório com o exemplo.

Os códigos gerados estarão em outros locais.

TODOS OS CRÉDITOS DA PESQUISA AO Refactoring Guru </br>
https://refactoring.guru/pt-br
