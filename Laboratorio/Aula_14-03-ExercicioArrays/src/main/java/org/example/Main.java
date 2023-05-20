package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Escola escola = new Escola("Inatel", "Inatel@.com", 987655, "Rua x");

        boolean flag = true;
        Scanner in = new Scanner(System.in);

        while (flag){
            System.out.println("Bem vindo a " + escola.nome);
            System.out.println("1 - Cadastra estudante");
            System.out.println("2 - Mostra info estudante");
            System.out.println("3 - Mostra quantidade de estudante por ano");
            System.out.println("4 - Sair");

            int acao = in.nextInt();

            switch (acao){
                case 1 -> {
                    in.nextLine();

                    System.out.print("Digite o nome: ");
                    String nome = in.nextLine();

                    System.out.print("Digite a idade: ");
                    int idade = in.nextInt();

                    System.out.print("Digite o ano: ");
                    in.nextLine();
                    String ano = in.nextLine();

                    Estudante estudante = new Estudante(nome, idade, ano);

                    escola.addEstudante(estudante);
                }
                case 2 -> {
                    for (Estudante estudante: escola.estudantes){
                        if (estudante != null){
                            estudante.mostraInfo();
                        }
                    }
                }
                case 3 -> {
                    escola.qtdEstudantesPorAno();
                }
                case 4 -> {
                    flag = false;
                }
                default -> {
                    System.out.println("Opção não disponível");
                }
            }

            System.out.println("----------------------------");
        }
    }
}