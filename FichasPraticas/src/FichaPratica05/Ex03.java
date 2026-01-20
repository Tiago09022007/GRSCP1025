package FichaPratica05;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];

        // Leitura do vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        System.out.println("______________________________");

        int maior = vetor[0];

        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        System.out.println("Maior: " + maior);
    }
}



