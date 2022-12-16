package com.github.nogueiralegacy.jogoDaVelha.domain;

import java.util.Arrays;

public class Tabuleiro {
    private String[][] casas = new String[3][3];

    public Tabuleiro() {
        limpa();
    }

    public void limpa() {
        for (int indiceLinha = 0; indiceLinha < 3; indiceLinha++) {
            for (int indiceColuna = 0; indiceColuna < 3; indiceColuna++) {
                casas[indiceLinha][indiceColuna] = " ";
            }
        }
    }

    public boolean casaOcupada(int linha, int coluna) {
        return !casas[linha][coluna].equals(" ");
    }

    public String[][] getCasas() {
            return casas;
        }

    public void setCasas(String[][] casas) {
        this.casas = casas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("    1     2    3\n");
        for (int indiceLinha = 0; indiceLinha < 3; indiceLinha++) {
            sb.append(indiceLinha + 1 + " ");
            for (int indiceColuna = 0; indiceColuna < 3; indiceColuna++) {
                sb.append("  " + casas[indiceLinha][indiceColuna] + "  ");
                if (indiceColuna < 2) {
                    sb.append("|");
                }
            }
            sb.append("\n");
            if (indiceLinha < 2) {
                sb.append("   ---------------\n");
            }
        }

        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tabuleiro tabuleiro = (Tabuleiro) o;

        return Arrays.deepEquals(casas, tabuleiro.casas);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(casas);
    }
}

