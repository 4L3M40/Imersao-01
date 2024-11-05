package Sabado;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o primeiro número
        System.out.println("Insira o primeiro número:");
        double num1 = scanner.nextDouble();

        // Solicita ao usuário que insira o segundo número
        System.out.println("Insira o segundo número:");
        double num2 = scanner.nextDouble();

        // Solicita ao usuário que escolha uma operação matemática
        System.out.println("Escolha uma operação (+, -, *, /):");
        char operacao = scanner.next().charAt(0);

        double resultado;

        // Executa a operação matemática escolhida pelo usuário
        switch (operacao) {
            case '+':
                // Adição
                resultado = num1 + num2;
                break;
            case '-':
                // Subtração
                resultado = num1 - num2;
                break;
            case '*':
                // Multiplicação
                resultado = num1 * num2;
                break;
            case '/':
                // Divisão, com verificação para evitar divisão por zero
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro! Divisão por zero.");
                    scanner.close();
                    return;
                }
                break;
            default:
                // Caso a operação seja inválida
                System.out.println("Operação inválida! Use +, -, *, ou /.");
                scanner.close();
                return;
        }

        // Exibe o resultado da operação
        System.out.println("O resultado é: " + resultado);
        // Fecha o objeto Scanner
        scanner.close();
    }
}
