package com.github.nogueiralegacy.jogoDaVelha.domain;

public class Jogo {
    private Jogador jogadorX;
    private Jogador jogadorO;
    private Tabuleiro tabuleiro;
    private int countJogadas = 0;

    public Jogo() {
        jogadorX = new Jogador("X");
        jogadorO = new Jogador("O");
        tabuleiro = new Tabuleiro();
    }

    public void jogada(int linha, int coluna) {
            if (getJogadorDaVez().equals(jogadorX)) {
                jogadorX.fazerJogada(tabuleiro, linha, coluna);
            } else {
                jogadorO.fazerJogada(tabuleiro, linha, coluna);
            }

            countJogadas++;
    }

    public boolean validaVitoria(String identificador) {
        for (int indiceLinha = 0; indiceLinha < 3; indiceLinha++) {
            if (tabuleiro.getCasas()[indiceLinha][0].equals(identificador) &&
                    tabuleiro.getCasas()[indiceLinha][1].equals(identificador) &&
                    tabuleiro.getCasas()[indiceLinha][2].equals(identificador)) {
                return true;
            }
        }

        for (int indiceColuna = 0; indiceColuna < 3; indiceColuna++) {
            if (tabuleiro.getCasas()[0][indiceColuna].equals(identificador) &&
                    tabuleiro.getCasas()[1][indiceColuna].equals(identificador) &&
                    tabuleiro.getCasas()[2][indiceColuna].equals(identificador)) {
                return true;
            }
        }

        if (tabuleiro.getCasas()[0][0].equals(identificador) &&
                tabuleiro.getCasas()[1][1].equals(identificador) &&
                tabuleiro.getCasas()[2][2].equals(identificador)) {
            return true;
        }

        if (tabuleiro.getCasas()[0][2].equals(identificador) &&
                tabuleiro.getCasas()[1][1].equals(identificador) &&
                tabuleiro.getCasas()[2][0].equals(identificador)) {
            return true;
        }

        return false;
    }

    public boolean verificaEmpate() {
        return countJogadas == 9;
    }

    public void reiniciaJogo() {
        tabuleiro.limpa();
        countJogadas = 0;
    }

    public Jogador getJogadorDaVez() {
        if (countJogadas % 2 == 0) {
            return jogadorX;
        } else {
            return jogadorO;
        }
    }

    public Jogador getJogadorX() {
        return jogadorX;
    }

    public void setJogadorX(Jogador jogadorX) {
        this.jogadorX = jogadorX;
    }

    public Jogador getJogadorO() {
        return jogadorO;
    }

    public void setJogadorO(Jogador jogadorO) {
        this.jogadorO = jogadorO;
    }

    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public int getCountJogadas() {
        return countJogadas;
    }

    public void setCountJogadas(int countJogadas) {
        this.countJogadas = countJogadas;
    }
}
