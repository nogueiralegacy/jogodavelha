package com.github.nogueiralegacy.jogoDaVelha.application.console;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CriaJogo jogoDaVelha = new CriaJogo();
        while (true) {
            jogoDaVelha.jogar();
            System.out.println("Digite \"exit\" para fechar o jogo");
            System.out.println("Digite qualquer outra coisa para jogar novamente");
            if (sc.nextLine().equals("exit")) {
                break;
            }
        }
    }
}
