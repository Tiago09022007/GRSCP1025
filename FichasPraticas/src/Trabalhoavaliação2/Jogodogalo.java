package Trabalhoavaliação2;

import java.util.Scanner;

public class Jogodogalo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao;

        // Ciclo Do-While para o Menu Final: permite jogar novamente sem reiniciar o programa
        do {
            jogar(); // Chama o procedimento principal do jogo

            System.out.println("\n--- JOGO TERMINADO ---");
            System.out.println("1. Jogar novamente");
            System.out.println("2. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

        } while (opcao == 1); //

        System.out.println("Programa encerrado.");
    }


     // Procedimento que controla o fluxo principal de uma partida

    public static void jogar() {
        // Declaração da matriz 3x3 para o tabuleiro
        char[][] tabuleiro = new char[3][3];
        char jogadorAtual = 'X'; // Jogador 1 começa com 'X'
        boolean jogoAtivo = true;

        inicializarTabuleiro(tabuleiro);

        while (jogoAtivo) {
            exibirTabuleiro(tabuleiro);
            fazerJogada(tabuleiro, jogadorAtual);

            // Verifica se houve vencedor após a jogada
            if (verificarVencedor(tabuleiro, jogadorAtual)) {
                exibirTabuleiro(tabuleiro);
                System.out.println("Parabéns! O Jogador " + jogadorAtual + " venceu!");
                jogoAtivo = false;
            }
            // Se não houver vencedor, verifica se o tabuleiro está cheio (empate)
            else if (tabuleiroCheio(tabuleiro)) {
                exibirTabuleiro(tabuleiro);
                System.out.println("O jogo terminou em EMPATE!");
                jogoAtivo = false;
            }
            // Alterna o jogador para a próxima ronda
            else {
                jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
            }
        }
    }

    // Inicializa o tabuleiro com hífens para indicar posições vazias
    public static void inicializarTabuleiro(char[][] matriz) {
        for (int i = 0; i < 3; i++) { // Ciclo For aninhado para percorrer linhas e colunas
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = '-';
            }
        }
    }

    // Exibe o estado atual da grelha na consola
    public static void exibirTabuleiro(char[][] matriz) {
        System.out.println("\n  0 1 2"); // Índices das colunas
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " "); // Índice da linha
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Lê e valida a jogada do utilizador
    public static void fazerJogada(char[][] matriz, char jogador) {
        int linha, coluna;
        boolean jogadaValida = false;
        Scanner input = new Scanner(System.in);

        while (!jogadaValida) { // Ciclo While para repetir até a jogada ser correta
            System.out.println("\nTurno do Jogador " + jogador);
            System.out.print("Introduza a Linha (0-2): ");
            linha = input.nextInt();
            System.out.print("Introduza a Coluna (0-2): ");
            coluna = input.nextInt();

            // Validação de limites e posição ocupada
            if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3) {
                if (matriz[linha][coluna] == '-') {
                    matriz[linha][coluna] = jogador;
                    jogadaValida = true;
                } else {
                    System.out.println("Erro: Esta posição já está ocupada!");
                }
            } else {
                System.out.println("Erro: Coordenadas fora dos limites (0 a 2)!");
            }
        }
    }

    // Função que verifica todas as condições de vitória
    public static boolean verificarVencedor(char[][] m, char j) {
        // Verificar linhas e colunas
        for (int i = 0; i < 3; i++) {
            if ((m[i][0] == j && m[i][1] == j && m[i][2] == j) ||
                    (m[0][i] == j && m[1][i] == j && m[2][i] == j)) {
                return true;
            }
        }
        // Verificar diagonais
        if ((m[0][0] == j && m[1][1] == j && m[2][2] == j) ||
                (m[0][2] == j && m[1][1] == j && m[2][0] == j)) {
            return true;
        }
        return false;
    }

    // Verifica se não existem mais espaços vazios no tabuleiro
    public static boolean tabuleiroCheio(char[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == '-') return false;
            }
        }
        return true;
    }
}































