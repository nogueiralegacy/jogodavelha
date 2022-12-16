package com.github.nogueiralegacy.jogoDaVelha.application.console;

import com.github.nogueiralegacy.jogoDaVelha.domain.Jogo;

import java.util.Scanner;

public class CriaJogo {
    public void jogar() {
        Scanner sc = new Scanner(System.in);

        Jogo jogo = new Jogo();

        while (true) {
            System.out.println("--Jogo da Velha--");
            System.out.print(jogo.getTabuleiro().toString() + "\n");
            if (jogo.getCountJogadas() % 2 == 0) {
                System.out.print("Jogador X ");
            } else {
                System.out.print("Jogador O ");
            }
            System.out.println("digite uma linha e uma coluna para fazer sua jogada");
            System.out.println("Exemplo:1 1");

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

            if (jogo.verificaEmpate()) {
                System.out.println("Deu velha!");
                return;
            }

            if (jogo.validaVitoria("X")) {
                System.out.println("Jogador X venceu!");
                return;
            }

            if (jogo.validaVitoria("O")) {
                System.out.println("Jogador O venceu!");
                return;
            }
        }
    }
}
