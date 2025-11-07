package FichaPratica02;
import java.util.Scanner;

public class Ex03
{
	public static void main(String[] args)
	{


    Scanner input = new Scanner(System.in);
    
    System.out.print("Introduza um salario: ");
    double salario = input.nextDouble();
    
    double taxa;
    
    if (salario <= 15000) {
    
        taxa = salario * 0.20;
        
    } else if (salario <= 20000) {
        taxa = salario * 0.30;
        
    } else if (salario <= 25000) {
        taxa = salario * 0.35;
        
    } else  {
        taxa = salario * 0.40;
    }

    double imposto = salario * taxa;

    System.out.printf("Paga taxa de %.0f%%: %.0f€%n", taxa * 100, imposto);


    }
}
