package FichaPratica01;

import java.util.Scanner;

public class EX03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura do retângulo: ");
        double largura = scanner.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();


        double area = largura * altura;
        double perimetro = 2 * (largura + altura);

        System.out.println("A área do retângulo é  : " + area);
        System.out.println("O perímetro do retângulo é " + perimetro);


    }
}
