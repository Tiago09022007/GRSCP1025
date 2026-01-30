package FichaPrática06;

import java.util.Scanner;

public class Ex09 {

    // Função para retornar o maior valor do vetor
    public static int maior(int[] vetor) {
        int maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    // Função para retornar o menor valor do vetor
    public static int menor(int[] vetor) {
        int menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor;
    }

    // Função para verificar se o vetor está crescente
    public static boolean Crescente(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i] > vetor[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // Função para ler um vetor do utilizador
    public static int[] lerLista(Scanner input) {
        System.out.print("Qual o tamanho da lista? ");
        int tamanho = input.nextInt();
        int[] lista = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento [" + i + "]: ");
            lista[i] = input.nextInt();
        }

        return lista;
    }

    // Programa principal
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] lista = lerLista(input);
        int opcao;

        do {
            System.out.println("\n--- Análise de uma Lista ---");
            System.out.println("1. Maior Elemento");
            System.out.println("2. Menor Elemento");
            System.out.println("3. Crescente ou Não Crescente");
            System.out.println("4. Trocar a Lista");
            System.out.println("5. Sair");
            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("O maior elemento é: " + maior(lista));
                    break;

                case 2:
                    System.out.println("O menor elemento é: " + menor(lista));
                    break;

                case 3:
                    if (Crescente(lista)) {
                        System.out.println("A lista está CRESCENTE.");
                    } else {
                        System.out.println("A lista NÃO está crescente.");
                    }
                    break;

                case 4:
                    lista = lerLista(input);
                    break;

                case 5:
                    System.out.println("Programa terminado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 5);
    }
}
