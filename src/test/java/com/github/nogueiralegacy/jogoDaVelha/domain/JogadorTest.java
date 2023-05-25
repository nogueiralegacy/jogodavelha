package com.github.nogueiralegacy.jogodavelha.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class JogadorTest {

    @Test
    void jogadaNoLocalCerto() {
        Jogador jogador = new Jogador("X");
        Tabuleiro tabuleiro = new Tabuleiro();

        jogador.fazerJogada(tabuleiro, 0, 0);

        assertNotEquals(" ", tabuleiro.getCasas()[0][0]);
    }

    @Test
    void umaJogadaPorVez() {
        Jogador jogador = new Jogador("X");

        Tabuleiro tabuleiro = new Tabuleiro();

        jogador.fazerJogada(tabuleiro, 0, 0);

        Tabuleiro tabuleiroEsperado = new Tabuleiro();
        tabuleiroEsperado.getCasas()[0][0] = "X";

        assertArrayEquals(tabuleiroEsperado.getCasas(), tabuleiro.getCasas());
    }

    @Test
    void jogadaFeitaPeloIdentificadorCerto() {
        Jogador jogadorX = new Jogador("X");
        Jogador jogadorO = new Jogador("O");

        Tabuleiro tabuleiro = new Tabuleiro();

        jogadorX.fazerJogada(tabuleiro, 0, 0);
        jogadorO.fazerJogada(tabuleiro, 0, 1);

        Tabuleiro tabuleiroEsperado = new Tabuleiro();
        tabuleiroEsperado.getCasas()[0][0] = "X";
        tabuleiroEsperado.getCasas()[0][1] = "O";

        assertArrayEquals(tabuleiroEsperado.getCasas(), tabuleiro.getCasas());
    }
}
