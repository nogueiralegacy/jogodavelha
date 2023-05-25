package com.github.nogueiralegacy.jogodavelha.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

public class TabuleiroTest {

    @Test
    void tabuleiroLimpo() {
        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.getCasas()[0][0] = "X";
        tabuleiro.getCasas()[0][1] = "O";

        tabuleiro.limpa();

        Tabuleiro tabuleiroEsperado = new Tabuleiro();

        assertArrayEquals(tabuleiroEsperado.getCasas(), tabuleiro.getCasas());
    }

    @Test
    void casaOcupada() {
        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.getCasas()[0][0] = "X";

        assertTrue(tabuleiro.casaOcupada(0, 0));
    }

    @Test
    void casaVazia() {
        Tabuleiro tabuleiro = new Tabuleiro();

        assertFalse(tabuleiro.casaOcupada(0, 0));
    }

    // Esse teste é visual foi feito somente para o desenvolvimento da interface
    // e não deve ser executado em um teste automatizado para verificar o seu
    // funcionamento
    @Disabled
    @Test
    void showTabuleiro() {
        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.getCasas()[0][0] = "X";
        tabuleiro.getCasas()[0][1] = "O";

        System.out.print(tabuleiro.toString());
    }
}
