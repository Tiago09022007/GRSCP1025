package FichaPratica03;

import java.util.Scanner;

public class Ex12 {

<<<<<<< Updated upstream
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numeroLido = 1;
        int intervalo_00_25 = 0, intervalo_26_50 = 0, intervalo51_75 = 0, intervalo76_100 = 0;

        while (numeroLido >= 0) {

            System.out.print("Insira um número (negativo para terminar): ");
            numeroLido = input.nextInt();

            if (numeroLido >= 0 && numeroLido <= 25) {
                intervalo_00_25++;
            }

            if (numeroLido >= 26 && numeroLido <= 50) {
                intervalo_26_50++;
            }

            if (numeroLido >= 51 && numeroLido <= 75) {
                intervalo51_75++;
            }

            if (numeroLido >= 76 && numeroLido <= 100) {
                intervalo76_100++;
            }

        }

        System.out.println(" [00,25]: " + intervalo_00_25);
        System.out.println(" [26,50]: " + intervalo_26_50);
        System.out.println(" [51,75]: " + intervalo51_75);
        System.out.println("[76,100]: " + intervalo76_100);

    }
=======

>>>>>>> Stashed changes
}

