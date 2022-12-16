package com.github.nogueiralegacy.jogoDaVelha.domain;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TabuleiroTest {

    @Test
    public void tabuleiroLimpo() {
        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.getCasas()[0][0] = "X";
        tabuleiro.getCasas()[0][1] = "O";

        tabuleiro.limpa();

        Tabuleiro tabuleiroEsperado = new Tabuleiro();

        assertArrayEquals(tabuleiroEsperado.getCasas(), tabuleiro.getCasas());
    }

    @Test
    public void casaOcupada() {
        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.getCasas()[0][0] = "X";

        assertTrue(tabuleiro.casaOcupada(0, 0));
    }

    @Test
    public void casaVazia() {
        Tabuleiro tabuleiro = new Tabuleiro();

        assertFalse(tabuleiro.casaOcupada(0, 0));
    }

    @Ignore
    @Test
    public void showTabuleiro() {
        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.getCasas()[0][0] = "X";
        tabuleiro.getCasas()[0][1] = "O";

        System.out.print(tabuleiro.toString());
    }
}
