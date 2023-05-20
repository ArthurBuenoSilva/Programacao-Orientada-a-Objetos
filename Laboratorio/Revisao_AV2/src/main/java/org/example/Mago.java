package org.example;

public class Mago extends Habitante implements Cura, Feitico{
    private String cor;

    public Mago(String nome, int idade, float energia, String cor) {
        super(nome, idade, energia);
        this.cor = cor;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Cor: " + cor);
    }

    @Override
    public void curar() {
        energia += energia * 0.15;
        System.out.println(nome + " esta curando");
    }

    @Override
    public void lancaFeitico() {
        energia -= energia * 0.1;
        System.out.println(nome + " esta lancando feitiço");
    }
}
