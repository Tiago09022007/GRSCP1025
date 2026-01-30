package FichaPrática06;

import java.util.Scanner;

public class Ex04 {

    public static double calcularAreaRetangulo(double base, double altura) {
        double area;

        area = base * altura;
        return area;
    }

    // Método principal
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base, altura, resultado;

        System.out.print("Introduza a base do retângulo: ");
        base = input.nextDouble();

        System.out.print("Introduza a altura do retângulo: ");
        altura = input.nextDouble();

        resultado = calcularAreaRetangulo(base, altura);

        System.out.println("A área do retângulo é: " + resultado);
    }
}
