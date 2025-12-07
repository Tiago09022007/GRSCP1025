package FichaPratica04;

<<<<<<< Updated upstream
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

=======
public class Ex02 {
    public static void main(String[] args) {

        int soma = 0;

        System.out.println("Números ímpares entre 11 e 51:");

        for (int i = 11; i <= 51; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                soma += i;
            }
        }

        System.out.println("Somatório: " + soma);
    }
}
>>>>>>> Stashed changes
