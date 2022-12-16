package com.github.nogueiralegacy.jogoDaVelha.application.console;

import com.github.nogueiralegacy.jogoDaVelha.domain.Jogo;

import java.util.Scanner;

public class CriaJogo {
    public void criarJogo() {
        Scanner sc = new Scanner(System.in);

        Jogo jogo = new Jogo();

        while (true) {
            System.out.println("--Jogo da Velha--");
            System.out.print(jogo.getTabuleiro().toString() + "\n");
            System.out.println("Digite uma linha e uma coluna para fazer sua jogada");
            System.out.println("Exemplo:1 1");

            if (jogo.verificaEmpate()) {
                System.out.println("Deu velha!");
                return;
            }

            int linha;
            int coluna;
            try {
                linha = sc.nextInt();
                coluna = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Digite um número válido");
                sc.nextLine();
                continue;
            }

            if (linha < 1 || linha > 3 || coluna < 1 || coluna > 3) {
                System.out.println("Digite um número entre 1 e 3");
                continue;
            }

            while (true) {
                if (jogo.getTabuleiro().casaOcupada(linha - 1, coluna - 1)) {
                    System.out.println("Casa já ocupada, digite outra linha e coluna");
                    System.out.println("Exemplo:1 1");
                    linha = sc.nextInt();
                    coluna = sc.nextInt();
                } else {
                    break;
                }
            }

            jogo.jogada(linha - 1, coluna - 1);

            if (jogo.getCountJogadas() - 1 % 2 == 0) {
                if (jogo.varificaVitoria("X")) {
                    System.out.println("Jogador X venceu!");
                    return;
                }
            } else {
                if (jogo.varificaVitoria("O")) {
                    System.out.println("Jogador O venceu!");
                    return;
                }
            }
        }
    }
}
