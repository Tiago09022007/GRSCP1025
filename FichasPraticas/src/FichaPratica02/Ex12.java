package FichaPratica02;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Criar");
            System.out.println("2. Atualizar");
            System.out.println("3. Eliminar");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            // Verifica se a entrada é um número
            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Opção selecionada: Criar");
                        break;
                    case 2:
                        System.out.println("Opção selecionada: Atualizar");
                        break;
                    case 3:
                        System.out.println("Opção selecionada: Eliminar");
                        break;
                    case 4:
                        // Não faz nada — apenas sai
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, tente novamente.");
                }
            } else {
                System.out.println("Entrada inválida. Insira um número de 1 a 4.");
                scanner.next(); // limpa a entrada inválida
                opcao = -1;
            }

        } while (opcao != 4);



    }
}
