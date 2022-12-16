package com.github.nogueiralegacy.jogoDaVelha.domain;

public class Jogador {
    private String identificador;

    Jogador(String identificador) {
        this.identificador = identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void fazerJogada(Tabuleiro tabuleiro, int linha, int coluna) {
        tabuleiro.getCasas()[linha][coluna] = identificador;
    }

}

