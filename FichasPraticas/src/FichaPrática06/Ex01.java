package FichaPrática06;

import java.util.Scanner;

public class Ex01 {

    public static int lerInteiroPositivo() {

        Scanner input = new Scanner(System.in);
        int num;

        do {
            System.out.print("Introduza um número: ");
            num = input.nextInt();
        } while (num <= 0);

        return num;
    }

    // Função que imprime os asteriscos
    public static void imprimirAsteriscos(int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            System.out.print("*");
        }
        System.out.println(); // muda de linha no fim
    }

    // Função principal
    public static void main(String[] args) {
        int numero;

        numero = lerInteiroPositivo();
        imprimirAsteriscos(numero);
    }

}


