package org.example;

public class Aldeia {
    String nome;
    int qtdMoradores;
    String regiao;
    Ninja[] ninjas = new Ninja[10];

    public Aldeia(String nome, int qtdMoradores, String regiao) {
        this.nome = nome;
        this.qtdMoradores = qtdMoradores;
        this.regiao = regiao;
    }

    public void adicionarNinja(Ninja ninja) {
        for (int i = 0; i < ninjas.length; i++) {
            if (ninjas[i] == null) {
                ninjas[i] = ninja;
                break;
            }
        }
    }

    public void mostraInfo() {
        System.out.println("--------------------");
        System.out.println("Informações da Aldeia");
        System.out.println("Nome: " + nome);
        System.out.println("Qtd de Moradores: " + qtdMoradores);
        System.out.println("Região: " + regiao);

        for (Ninja ninja : ninjas) {
            if (ninja != null) {
                ninja.mostraInfo();
            }
        }
    }

    public void rankingS() {
        System.out.println("--------------------");
        for (Ninja ninja : ninjas) {
            if (ninja != null) {
                if (ninja.ranking.equals("S")) {
                    System.out.println(ninja.nome + " tem ranking S");
                }
            }
        }
    }

    public void qtdTitulos() {
        int gennin = 0;
        int chunnin = 0;
        int anbu = 0;

        for (Ninja ninja : ninjas) {
            if (ninja != null) {
                switch (ninja.titulo) {
                    case "Gennin" -> {
                        gennin += 1;
                    }
                    case "Chunnin" -> {
                        chunnin += 1;
                    }
                    case "ANBU" -> {
                        anbu += 1;
                    }
                    default -> {
                    }
                }
            }
        }

        System.out.println("--------------------");
        System.out.println("Ninjas Gennin: " + gennin);
        System.out.println("Ninjas Chunnin: " + chunnin);
        System.out.println("Ninjas ANBU: " + anbu);
    }
}
