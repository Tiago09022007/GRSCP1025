package FichaPratica04;

import java.util.Scanner;

public class Ex02 {

public static void main(String[] args) {


    Scanner input = new Scanner(System.in);

    int soma = 0;

    for (int numero = 11; numero <= 51; numero++) {
        if (numero % 2 != 0) {     // verifica se é ímpar
            System.out.println(numero);
            soma += numero;
        }
    }

    System.out.println("Somatório dos números ímpares: " + soma);
}

}

