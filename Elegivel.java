package Sabado;

import java.util.Scanner;

public class Elegivel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual sua idade?");
        int idade = scanner.nextInt();

        if (idade >= 16) {
            System.out.println("Você é elegível para votar");
        } else {
            System.out.println("Você não é elegível para votar");
        }

        scanner.close();
    }
}
