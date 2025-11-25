package FichaPratica03;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int inicio, fim;

        // Ler valores
        System.out.print("Início do intervalo: ");
        inicio = input.nextInt();

        System.out.print("Fim do intevalo: ");
        fim = input.nextInt();

        while (inicio <= fim) {
            if (inicio % 5 == 0) {
                System.out.println(inicio);
            }

            inicio++;
        }

    }
}
