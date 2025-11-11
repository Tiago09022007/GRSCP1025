package FichaPratica02;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double saldo, movimento, saldoAposMovimento;

        // Ler saldo
        System.out.print("Saldo: ");
        saldo = input.nextDouble();

        // Ler movimento
        System.out.print("Valor a Movimentar (Crédito/Debito): ");
        movimento = input.nextDouble();

        // Tentar aplicar o movimento
        saldoAposMovimento = saldo + movimento;

        System.out.println("_____________________________________________");

        if (saldoAposMovimento >= 0) {
            // Movimento válido

            if (movimento > 0) {
                System.out.println("Operação realizada com sucesso: Depósito");
            } else {
                System.out.println("Operação realizada com sucesso: Levantamento");
            }

            saldo = saldoAposMovimento;
        } else {
            // Movimento inválido
            System.out.println("Operação inválida: Levantamento. Saldo insuficiente.");
        }

        System.out.println("Saldo Atual: " + saldo + " €");
    }
}
