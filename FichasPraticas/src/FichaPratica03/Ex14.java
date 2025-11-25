package FichaPratica03;

import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números deseja inserir: ");
        int n = input.nextInt();

        // Ler o primeiro número
        System.out.print("Introduza um número: ");
        int anterior = input.nextInt();

        boolean crescente = true;

        // Ler os restantes números
        for (int i = 1; i < n; i++) {
            System.out.print("Introduza um número: ");
            int atual = input.nextInt();

            if (atual < anterior) {
                crescente = false;
            }

            anterior = atual; // atualizar o valor anterior
        }

        if (crescente) {
            System.out.println("Crescente");
        } else {
            System.out.println("Não crescente");
        }


    }
}
