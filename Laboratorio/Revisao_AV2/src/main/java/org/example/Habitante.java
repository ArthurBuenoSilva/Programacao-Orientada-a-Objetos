package org.example;

public abstract class Habitante {
    public static int contador;
    protected int id;
    protected String nome;
    protected int idade;
    protected float energia;
    protected Arma arma;

    public Habitante(String nome, int idade, float energia) {
        this.nome = nome;
        this.idade = idade;
        this.energia = energia;

        contador++;
        id = contador;
    }

    public void atacar(){
        if (arma != null) {
            if (arma.isMagica())
                energia -= 20;
            else
                energia -= 10;

            System.out.println("Atributos da Arma");
            System.out.println("Nome: " + arma.getNomeArma());
            System.out.println("É mágica: " + arma.isMagica());
            System.out.println(nome + " está atacando");
        } else {
            System.out.println("Você não tem arma para atacar");
        }
    }

    public void mostraInfo(){
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Energia: " + energia);
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
}
