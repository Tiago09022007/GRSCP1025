package FichaPratica03;

import java.util.Scanner;

public class Ex08 {

public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    // Declarar variáveis
    int numLido;

    // Ler numero
    System.out.print("Insira um número: ");
    numLido = input.nextInt();

    int antecessor = numLido - 5;
    int sucessor = numLido + 5;

    while (antecessor < numLido) {
        System.out.println(antecessor);
        antecessor = antecessor + 1;
    }

    numLido = numLido + 1;

    while (numLido <= sucessor) {
        System.out.println(numLido);
        numLido = numLido + 1;
    }

}
}










