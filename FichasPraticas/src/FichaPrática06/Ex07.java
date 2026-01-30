package FichaPrática06;

import java.util.Scanner;

public class Ex07 {

    // a) Par ou ímpar
    public static boolean Par(int num) {
        return num % 2 == 0;
    }

    // b) Positivo ou negativo
    public static boolean Positivo(int num) {
        return num >= 0;
    }

    // c) Primo
    public static boolean Primo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // d) Perfeito
    public static boolean Perfeito(int num) {
        if (num <= 0) {
            return false;
        }

        int soma = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                soma += i;
            }
        }
        return soma == num;
    }

    // e) Triangular
    public static boolean Triangular(int num) {
        int soma = 0;
        int i = 1;

        while (soma < num) {
            soma += i;
            i++;
        }
        return soma == num;
    }

    // Programa principal
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int opcao;

        System.out.print("Introduza um número: ");
        num = input.nextInt();

        do {
            System.out.println("--- Análise de um Número ---");
            System.out.println("1. Par ou Ímpar");
            System.out.println("2. Positivo ou Negativo");
            System.out.println("3. Primo ou Não Primo");
            System.out.println("4. Perfeito ou Não Perfeito");
            System.out.println("5. Triangular ou Não Triangular");
            System.out.println("6. Trocar de Número");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    if (Par(num)) {
                        System.out.println("O número é PAR.");
                    } else {
                        System.out.println("O número é ÍMPAR.");
                    }
                    break;

                case 2:
                    if (Positivo(num)) {
                        System.out.println("O número é POSITIVO ou ZERO.");
                    } else {
                        System.out.println("O número é NEGATIVO.");
                    }
                    break;

                case 3:
                    if (Primo(num)) {
                        System.out.println("O número é PRIMO.");
                    } else {
                        System.out.println("O número NÃO é PRIMO.");
                    }
                    break;

                case 4:
                    if (Perfeito(num)) {
                        System.out.println("O número é PERFEITO.");
                    } else {
                        System.out.println("O número NÃO é PERFEITO.");
                    }
                    break;

                case 5:
                    if (Triangular(num)) {
                        System.out.println("O número é TRIANGULAR.");
                    } else {
                        System.out.println("O número NÃO é TRIANGULAR.");
                    }
                    break;

                case 6:
                    System.out.print("Introduza um novo número: ");
                    num = input.nextInt();
                    break;

                case 0:
                    System.out.println("Programa terminado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }
}



