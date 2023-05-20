package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Livro[] livros = new Livro[10];

        livros[0] = new Livro("Livro 1", 300);
        livros[1] = new Livro("Livro 2", 250);

        for (Livro livro : livros) {
            try {
                System.out.println(livro.nome);
            } catch (NullPointerException e) {
                break;
            }
        }

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.nome = "Biblioteca";

        boolean flag = true;
        Scanner in = new Scanner(System.in);

        while (flag) {
            System.out.println("Bem vindo a biblioteca");
            System.out.println("1 - Cadastrar Livro");
            System.out.println("2 - Mostrar Info");
            System.out.println("3 - Sair");

            int acao = in.nextInt();

            switch (acao) {
                case 1 -> {
                    System.out.print("Digite o nome do livro: ");
                    in.nextLine();
                    String nome = in.nextLine();

                    System.out.print("Digite o número de páginas: ");
                    int nPaginas = in.nextInt();

                    Livro livro = new Livro(nome, nPaginas);

                    biblioteca.addLivro(livro);
                }
                case 2 -> {
                    biblioteca.mostraInfo();
                }
                case 3 -> {
                    flag = false;
                }
                default -> {
                    System.out.println("Opção não disponível");
                }
            }

            System.out.println("------------------------------");
        }
    }
}