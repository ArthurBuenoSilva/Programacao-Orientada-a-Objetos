package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //criando um arquivo
        Arquivo arq = new Arquivo();
        //criando Jogos
        Jogo jogo = new Jogo();
        //variavel para escanear
        Scanner sc = new Scanner(System.in);
        //flag para manter o fluxo
        boolean flag = true;

        while(flag){

            System.out.println("Bem vindo ao menu!");
            System.out.println("1-Cadastrar Jogo!");
            System.out.println("2-Listar Jogos");
            System.out.println("3-Sair");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op){
                case 1:
                    System.out.println("Nome do Jogo");
                    jogo.setNome(sc.nextLine());
                    System.out.println("Preço do Jogo");

                    double preco = sc.nextDouble();

                    // Checa se o preço é menor que 0
                    try{
                        if (preco <= 0) {
                            throw new PrecoNegativoException("O preço não pode ser negativo");
                        }
                    } catch (PrecoNegativoException e) {
                        System.out.println(e);
                        break;
                    }

                    jogo.setPreco(preco);
                    sc.nextLine();
                    System.out.println("Gênero do Jogo");
                    jogo.setGenero(sc.nextLine());

                    arq.escrever(jogo);

                    break;
                case 2:
                    //armazena o retorno do medoto de leitura
                    ArrayList<Jogo> jogos = arq.ler();

                    for (int i = 0; i < jogos.size(); i++) {
                        System.out.println("INFORMACOES DO JOGO");
                        System.out.println(jogos.get(i).getNome());
                        System.out.println(jogos.get(i).getPreco());
                        System.out.println(jogos.get(i).getGenero());
                    }
                    break;
                case 3:
                    flag =false;
                    break;
            }
        }
    }
}