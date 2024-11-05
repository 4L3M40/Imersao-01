package Sabado;

import java.util.ArrayList;
import java.util.Scanner;

public class Frutas {

    private static final ArrayList<String> listaFrutas = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            limparTela();
            System.out.println("----- MENU -----");
            System.out.println("1. Inserir fruta");
            System.out.println("2. Alterar fruta");
            System.out.println("3. Consultar frutas");
            System.out.println("4. Remover fruta");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    inserirFruta();
                    break;
                case 2:
                    alterarFruta();
                    break;
                case 3:
                    consultarFrutas();
                    break;
                case 4:
                    removerFruta();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 5);
    }
    private static void inserirFruta() {
        limparTela();
        System.out.print("Digite o nome da fruta: ");
        String fruta = scanner.nextLine();

        if (listaFrutas.contains(fruta.toLowerCase())) {
            System.out.println("Fruta já cadastrada.");
        } else {
            listaFrutas.add(fruta.toLowerCase());
            System.out.println("Fruta inserida com sucesso!");
        }
        pausar();
    }
    private static void alterarFruta() {
        limparTela();
        System.out.print("Digite o nome da fruta que deseja alterar: ");
        String frutaAntiga = scanner.nextLine();

        if (listaFrutas.contains(frutaAntiga.toLowerCase())) {
            System.out.print("Digite o novo nome da fruta: ");
            String frutaNova = scanner.nextLine();

            if (listaFrutas.contains(frutaNova.toLowerCase())) {
                System.out.println("O novo nome já está cadastrado.");
            } else {
                listaFrutas.set(listaFrutas.indexOf(frutaAntiga.toLowerCase()), frutaNova.toLowerCase());
                System.out.println("Fruta alterada com sucesso!");
            }
        } else {
            System.out.println("Fruta não encontrada.");
        }
        pausar();
    }
    private static void consultarFrutas() {
        limparTela();
        if (listaFrutas.isEmpty()) {
            System.out.println("Nenhuma fruta cadastrada.");
        } else {
            System.out.println("Frutas cadastradas:");
            for (String fruta : listaFrutas) {
                System.out.println(" " + fruta);
            }
        }
        pausar();
    }
    private static void removerFruta() {
        limparTela();
        System.out.print("Digite o nome da fruta que deseja remover: ");
        String fruta = scanner.nextLine();

        if (listaFrutas.contains(fruta.toLowerCase())) {
            listaFrutas.remove(fruta.toLowerCase());
            System.out.println("Fruta removida com sucesso!");
        } else {
            System.out.println("Fruta não encontrada.");
        }
        pausar();
    }
    // Função para limpar a tela
    private static void limparTela() {
        // Simplesmente imprime várias linhas em branco
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
    // Função para pausar até que o usuário pressione Enter
    private static void pausar() {
        System.out.println("\nPressione a tecla ENTER para continuar");
        scanner.nextLine();
    }
}
