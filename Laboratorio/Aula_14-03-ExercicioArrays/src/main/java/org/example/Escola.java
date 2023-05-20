package org.example;

public class Escola {
    String nome;
    String email;
    int numTelefone;
    String endereco;
    Estudante [] estudantes = new Estudante[10];

    public Escola(String nome, String email, int numTelefone, String endereco) {
        this.nome = nome;
        this.email = email;
        this.numTelefone = numTelefone;
        this.endereco = endereco;
    }

    public void addEstudante(Estudante e){
        for (int i = 0; i < estudantes.length; i++){
            if (estudantes[i] == null){
                estudantes[i] = e;
                break;
            }
        }
    }

    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + numTelefone);
        System.out.println("Endereço: " + endereco);
    }

    public void qtdEstudantesPorAno(){
        int primeiro = 0;
        int segundo = 0;
        int terceiro = 0;

        for (Estudante estudante: estudantes){
            if (estudante != null){
                switch (estudante.ano){
                    case "Primeiro" -> {
                        primeiro += 1;
                    }
                    case "Segundo" -> {
                        segundo += 1;
                    }
                    case "Terceiro" -> {
                        terceiro += 1;
                    }
                }
            }
        }

        System.out.println("Quantidade de alunos no Primeiro ano: " + primeiro);
        System.out.println("Quantidade de alunos no Segundo ano: " + segundo);
        System.out.println("Quantidade de alunos no Terceiro ano: " + terceiro);
    }
}
