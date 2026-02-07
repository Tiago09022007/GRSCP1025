package Trabalhoavaliação;

import javax.security.auth.login.LoginContext;
import java.util.Scanner;

public class Main {
    private static Object loja1, loja2; static Object quantidade;

    public void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declarar as variáveis

        double produto1, produto2, produto3, produto4, produto5, produto6, produto7, produto8;

        int loja1;
        int loja2;

        System.out.print("Insira o codigo, nome, preço, categoria, stock do produto1: ");
        produto1 = input.nextDouble();

        System.out.print("\"Insira o codigo, nome, preço, categoria, stock do produto2: ");
        produto2 = input.nextDouble();

        System.out.print("\"Insira o codigo, nome, preço, categoria, stock do produto3: ");
        produto3 = input.nextDouble();

        System.out.print("Insira o codigo, nome, preço, categoria, stock do produto4:" );
        produto4 = input.nextDouble();


        int codigoproduto1 = 10, codigoproduto2 = 20, codigoproduto3 =30, codigoproduto4 = 40;

        String nomeproduto1 = "Bolachas", nomeproduto2 = "Computador" , nomeproduto3 = "Televisão", nomeproduto4 = "Sofá";

        String precoproduto1 = "1", precoproduto2 = "2", precoproduto3 = "3", precoproduto4 = "4";

        String categoriaproduto1 = "Alimento", categoriaproduto2 = "Desktop", categoriaproduto3 = "Full HD", categoriaproduto4 = "Sofá-cama";

        String stockproduto1 = "0",  stockproduto2 = "0", stockproduto3 = "0", stockproduto4 = "0";


        System.out.print("Insira o codigo, nome, preço, categoria, stock do produto5: ");
        produto5 = input.nextInt();

        System.out.print("\"Insira o codigo, nome, preço, categoria, stock do produto6: ");
        produto6 = input.nextInt();

        System.out.print("\"Insira o codigo, nome, preço, categoria, stock do produto7: ");
        produto7 = input.nextInt();

        System.out.print("Insira o codigo, nome, preço, categoria, stock do produto8:" );
        produto8 = input.nextInt();


        int codigoproduto5 = 50, codigoproduto6 = 60, codigoproduto7 = 70, codigoproduto8 = 80;

        String nomeproduto5 = "Bolachas", nomeproduto6 = "Computador" , nomeproduto7 = "Televisão", nomeproduto8 = "Sofá";

        String precoproduto5 = "5", precoproduto6 = "6", precoproduto7 = "7", precoproduto8 = "8";

        String categoriaproduto5 = "Alimento", categoriaproduto6 = "Desktop", categoriaproduto7 = "Full HD", categoriaproduto8 = "Sofá-cama";

        String stockproduto5 = "0",  stockproduto6 = "0", stockproduto7 = "0", stockproduto8 = "0";

       do {

           System.out.print("Login loja1 = 1234: ");
           loja1 = input.nextInt();


           System.out.print("Login loja2 = 5678: ");
           loja2 = input.nextInt();

       }while (loja1 == 0 || loja2 == 0);

        int opcao;

        do {
            System.out.println("\n\n******** MENU loja1 ********");
            System.out.println("1. Consultar informações");
            System.out.println("2. Adquirir");
            System.out.println("3. Vender");
            System.out.println("4. Transferir Stock entre Lojas");
            System.out.println("5. Simular Venda Total – Loja Atual");
            System.out.println("6. Simular Venda Total – Todas as Lojas");
            System.out.println("7. Loja com Maior Valor");
            System.out.println("8. Logout");

            System.out.print("Opção: ");
            opcao= input.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("\n**** Consultar informações ****");
                    break;

                case 2:
                    System.out.println("\n****  Adquirir ****");
                    break;

                case 3:
                    System.out.println("\n**** Vender ****");
                    break;

                case 4:
                    System.out.println("\n**** Transferir Stock entre Lojas ****");
                    break;

                case 5:
                    System.out.println("\n**** Simular Venda Total – Loja Atual ****" );
                    break;

                case 6:
                    System.out.println("\n**** Simular Venda Total – Todas as Lojas ****");
                    break;


                case 7:
                    System.out.println("\n**** Loja com Maior Valor **** ");
                    break;

                case 8:
                    System.out.println("\n**** Logout ****");
                    break;

                case 0:
                    System.out.println("\nObrigado e até à próxima!");
                    break;

                default:
                    System.out.println("\nOpção inválida!!!");
                    break;
            }

        } while (opcao != 0);


        do {
            System.out.println("\n\n******** MENU loja2 ********");
            System.out.println("1. Consultar informações");
            System.out.println("2. Adquirir");
            System.out.println("3. Vender");
            System.out.println("4. Transferir Stock entre Lojas");
            System.out.println("5. Simular Venda Total – Loja Atual");
            System.out.println("6. Simular Venda Total – Todas as Lojas");
            System.out.println("7. Loja com Maior Valor");
            System.out.println("8. Logout");

            System.out.print("Opção: ");
            opcao= input.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("\n**** Consultar informações ****");
                    break;

                case 2:
                    System.out.println("\n****  Adquirir ****");
                    break;

                case 3:
                    System.out.println("\n**** Vender ****");
                    break;

                case 4:
                    System.out.println("\n**** Transferir Stock entre Lojas ****");
                    break;

                case 5:
                    System.out.println("\n**** Simular Venda Total – Loja Atual ****" );
                    break;

                case 6:
                    System.out.println("\n**** Simular Venda Total – Todas as Lojas ****");
                    break;


                case 7:
                    System.out.println("\n**** Loja com Maior Valor **** ");
                    break;

                case 8:
                    System.out.println("\n**** Logout ****");
                    break;

                case 0:
                    System.out.println("\nObrigado e até à próxima!");
                    break;

                default:
                    System.out.println("\nOpção inválida!!!");
                    break;
            }

        } while (opcao != 0);


        //Produto1
        if (codigoproduto1 == 10)
            System.out.println("Bolachas: ");
            System.out.println("1: ");
            System.out.println("Alimento: ");
            System.out.println("0: ");

        //Produto2
        if (codigoproduto2 == 20)
            System.out.println("Computador: ");
            System.out.println("2: ");
            System.out.println("Desktop: ");
            System.out.println("0: ");

        //Produto3
        if (codigoproduto3 == 30)
            System.out.println("Televisão: ");
        System.out.println("3: ");
        System.out.println("Full HD: ");
        System.out.println("0: ");

        //Produto4
        if (codigoproduto4 == 40)
            System.out.println("Sofá: ");
        System.out.println("4: ");
        System.out.println("Sofá-cama: ");
        System.out.println("0: ");


        //Produto5
        if (codigoproduto5 == 50)
            System.out.println("Bolachas: ");
        System.out.println("5: ");
        System.out.println("Alimento: ");
        System.out.println("0: ");

        //Produto6
        if (codigoproduto6 == 60)
            System.out.println("Computador: ");
        System.out.println("6: ");
        System.out.println("Desktop: ");
        System.out.println("0: ");

        //Produto7
        if (codigoproduto7 == 70)
            System.out.println("Televisão: ");
        System.out.println("7: ");
        System.out.println("Full HD: ");
        System.out.println("0: ");

        //Produto8
        if (codigoproduto8 == 80)
            System.out.println("Sofá: ");
        System.out.println("8: ");
        System.out.println("Sofá-cama: ");
        System.out.println("0: ");








          }


    }



