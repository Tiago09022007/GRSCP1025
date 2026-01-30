package FichaPrática06;

import java.util.Scanner;

public class Ex05 {

    public static void imprimirTabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    // Método principal
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Introduza um número: ");
        num = input.nextInt();

        imprimirTabuada(num);
    }
}
