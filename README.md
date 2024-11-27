# Projeto de Exemplos Java

Este repositório contém diversos exemplos de programas em Java que ilustram conceitos básicos e comuns de programação. Abaixo, cada programa é explicado detalhadamente.

## 1. **Calculadora**
Uma simples calculadora que permite ao usuário realizar operações matemáticas básicas: soma, subtração, multiplicação e divisão. O programa pede dois números e uma operação, e então exibe o resultado.

Funcionamento:
O programa lê dois números e a operação desejada.
Utiliza um switch para executar a operação matemática escolhida.
Verifica se a operação de divisão não tenta dividir por zero.
Exibe o resultado ou uma mensagem de erro, caso a operação seja inválida.

## 2. **Elegível**
Verifica se uma pessoa é elegível para votar com base na idade. Se a idade for 16 ou maior, o programa informa que a pessoa é elegível para votar.

Funcionamento:
O programa solicita que o usuário insira a idade.
Se a idade for 16 ou maior, o programa informa que o usuário é elegível para votar.
Caso contrário, o programa informa que o usuário não é elegível.
Esse tipo de programa é útil para aprender sobre condicionais em Java.

## 3. **Frutas**
Um menu interativo que permite adicionar, alterar, consultar e remover frutas de uma lista. O programa manipula uma lista de frutas com operações de CRUD.

Funcionamento:
Inserir novas frutas.
Alterar o nome de frutas existentes.
Consultar todas as frutas cadastradas.
Remover frutas do cadastro.
Sair do programa.
A aplicação utiliza uma lista (ArrayList) para armazenar as frutas e oferece uma interface simples de linha de comando com validações para evitar duplicações e garantir a integridade dos dados.


## 4. **Número Primo**
Verifica se um número fornecido pelo usuário é um número primo. A função `ehPrimo` realiza a verificação dividindo o número até sua raiz quadrada.

Funcionamento:
O número é verificado para ver se é menor ou igual a 1 (não primo).
Em seguida, ele verifica a divisibilidade do número, testando até a raiz quadrada do número, o que otimiza o processo.
O resultado é impresso no console, informando se o número é primo ou não.

## 5. **Números Pares**
Imprime todos os números pares de 2 a 10, utilizando um laço `for` com incremento de 2.

Funcionamento:
Ele utiliza um laço for para iterar de 2 até 10, com um incremento de 2 a cada iteração. Dessa forma, ele imprime apenas os números pares no intervalo especificado.

## Como Executar
1. Clone o repositório:
   ```bash
   git clone https://github.com/4L3M40/SabadoImersao.git
