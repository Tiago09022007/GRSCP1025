package FichaPratica03;

import java.util.Scanner;


public class Ex10
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero = 2, limite;

<<<<<<< Updated upstream
        // Ler limite
        System.out.print("Insira o limite do intervalo: ");
        limite = input.nextInt();

        while (numero <= limite) {
            System.out.println(numero);
            numero = numero + 2;

=======
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero = 2, limite;

        // Ler limite
        System.out.print("Insira o limite do intervalo: ");
        limite = input.nextInt();

        while (numero <= limite) {
            System.out.println(numero);
            numero = numero + 2;
>>>>>>> Stashed changes
        }
    }
}


