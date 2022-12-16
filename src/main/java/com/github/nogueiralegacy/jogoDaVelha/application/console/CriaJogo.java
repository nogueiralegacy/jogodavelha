package com.github.nogueiralegacy.jogoDaVelha.application.console;

import com.github.nogueiralegacy.jogoDaVelha.domain.Jogo;

public class CriaJogo {
    public boolean criarJogo() {
        Jogo jogo = new Jogo();

        System.out.println("--Jogo da Velha--");
        System.out.print(jogo.getTabuleiro().toString() + "\n");
        System.out.println("Digite uma linha e uma coluna para fazer sua jogada");
        System.out.println("Exemplo: 1 1");




        return true;
    }
}
