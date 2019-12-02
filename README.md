# Ice-Cream-Pattern
Implementação de 3 design patterns em um mesmo problema

`Criar um cenário e implementar 3 design patterns estudados em sala. O trabalho pode ser em dupla e apenas um dos membros da dupla deve enviar: Link para o projeto contendo codigo fonte commitado no github. OBS: Deve haver um arquivo readme.md com a explicacao sucinta de quais design patterns foram implementados e porque eles foram úteis no cenário escolhido.`


## CENÁRIO

Sorveteria que vende Açai, onde foi utilizado os design patterns (Builder, State e Abstract Factory)

#### Abstract Factory

O Abstract Factory foi utilizado para instanciar o açai, passa o nome do combo do acai para o Abstract Factory que fica
responsável por instanciar o açai de acordo com o nome do combo facilitando a manutenção ou inserção de um novo combo de açai no sistema.

#### Builder

O Builder foi utilizado para fazer a pré-montagem dos açai para facilitar na hora da criação dos mesmo, pois com ele não tem
se a necessidade de passar todos os parâmetros necessários no construtor para criar um açai, deixando o mesmo muito grande e
de difícil leitura. Com o Builder você consegue criar os açai de forma melhor e fácil entendimento.

#### State

O State foi utilizado para alterar o status do pedido do açai. Quando quiser alterar o status do açai para fazendo ou pronto, é só passar o status para o State e ele vai alterar o status do açai para o status atual.


#### Autor

[Uillian Henrique](https://github.com/uillianamaral)
