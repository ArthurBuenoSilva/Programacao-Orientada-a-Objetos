package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aldeia aldeia = new Aldeia("Aldeia 1", 200, "Norte");
        Scanner in = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("---------- Opções ----------");
            System.out.println("1 - Adicionar Ninja");
            System.out.println("2 - Mostrar informações da aldeia e seus ninjas");
            System.out.println("3 - Mostrar nome dos ninjas ranking S");
            System.out.println("4 - Mostrar quantidade de ninjas em cada titulo");
            System.out.println("5 - Sair");
            int acao = in.nextInt();

            switch (acao) {
                case 1 -> {
                    in.nextLine();
                    System.out.println("Nome do ninja: ");
                    String nome = in.nextLine();

                    System.out.println("Idade do ninja: ");
                    int idade = in.nextInt();
                    in.nextLine();

                    System.out.println("Titulo do ninja: ");
                    String titulo = in.nextLine();

                    System.out.println("Ranking do ninja: ");
                    String ranking = in.nextLine();

                    Ninja ninja = new Ninja(nome, idade, titulo, ranking);
                    aldeia.adicionarNinja(ninja);
                }
                case 2 -> {
                    aldeia.mostraInfo();
                }
                case 3 -> {
                    aldeia.rankingS();
                }
                case 4 -> {
                    aldeia.qtdTitulos();
                }
                case 5 -> {
                    flag = false;
                }
                default -> {
                    System.out.println("Opção não encontrada!");
                }
            }
        }
    }
}