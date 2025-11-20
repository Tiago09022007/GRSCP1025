package FichaPratica03;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int inicio, limite;

        // Ler inicio e limite
        System.out.print("Insira o início do intervalo: ");
        inicio = input.nextInt();

        System.out.print("Insira o limite: ");
        limite = input.nextInt();

        while (inicio <= limite) {
            System.out.println(inicio);
            inicio = inicio + 1;

            }
    }
}
