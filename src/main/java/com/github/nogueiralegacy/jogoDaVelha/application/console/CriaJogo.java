package com.github.nogueiralegacy.jogodavelha.application.console;

import java.util.Scanner;

import com.github.nogueiralegacy.jogodavelha.domain.Jogo;

public class CriaJogo {
    Scanner sc = new Scanner(System.in);

    public void jogar() {
        Jogo jogo = new Jogo();

        while (true) {
            System.out.println("---Jogo da Velha---");
            System.out.print(jogo.getTabuleiro().toString() + "\n");
            if (jogo.getCountJogadas() % 2 == 0) {
                System.out.print("Jogador X ");
            } else {
                System.out.print("Jogador O ");
            }
            System.out.println("digite uma linha e uma coluna para fazer sua jogada");
            System.out.println("Exemplo:1 1");

            validaJogada(jogo);

            if (jogo.validaVitoria("X")) {
                System.out.println("---Jogo da Velha---");
                System.out.print(jogo.getTabuleiro().toString() + "\n");
                System.out.println("Jogador X venceu!");
                return;
            } else if (jogo.validaVitoria("O")) {
                System.out.println("---Jogo da Velha---");
                System.out.print(jogo.getTabuleiro().toString() + "\n");
                System.out.println("Jogador O venceu!");
                return;
            } else if (jogo.verificaEmpate()) {
                System.out.println("---Jogo da Velha---");
                System.out.print(jogo.getTabuleiro().toString() + "\n");
                System.out.println("Deu velha!");
                return;
            }
        }
    }

    public void validaJogada(Jogo jogo) {
        int linha;
        int coluna;

        while (true) {
            try {
                linha = sc.nextInt();
                coluna = sc.nextInt();

                if (linha < 1 || linha > 3 || coluna < 1 || coluna > 3) {
                    System.out.println("Digite um número entre 1 e 3");
                    continue;
                }
                if (jogo.getTabuleiro().casaOcupada(linha - 1, coluna - 1)) {
                    System.out.println("Casa já ocupada, digite outra linha e coluna");
                    continue;
                }
                jogo.jogada(linha - 1, coluna - 1);

                break;
            } catch (Exception e) {
                System.out.println("Digite apenas números");
                sc.nextLine();
            }
        }
    }
}