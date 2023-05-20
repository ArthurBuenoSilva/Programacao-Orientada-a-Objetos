package org.example;

public class Elfo extends Habitante implements Cura{

    private String tribo;

    public Elfo(String nome, int idade, float energia, String tribo) {
        super(nome, idade, energia);
        this.tribo = tribo;
    }

    public void viajar(){
        System.out.println(nome + " esta viajando");
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Tribo: " + tribo);
    }

    @Override
    public void curar() {
        energia += energia * 0.15;
        System.out.println(nome + " esta curando");
    }
}
