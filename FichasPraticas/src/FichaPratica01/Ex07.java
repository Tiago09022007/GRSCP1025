package FichaPratica01;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double produto1, produto2, produto3, total, totalComDesconto;

        // Ler preço dos 3 produtos
        System.out.print("Insira o preço do 1º produto: ");
        produto1 = input.nextDouble();

        System.out.print("Insira o preço do 2º produto: ");
        produto2 = input.nextDouble();

        System.out.print("Insira o preço do 3º produto: ");
        produto3 = input.nextDouble();

        // Calcular o total do conta
        total = produto1 + produto2 + produto3;

        // Aplicar 10% de desconto
        totalComDesconto = total * 0.9;

        // Apresentar o total (com desconto)
        System.out.println("Total c/ 10% de desconto: " + totalComDesconto + " €");

    }
}
