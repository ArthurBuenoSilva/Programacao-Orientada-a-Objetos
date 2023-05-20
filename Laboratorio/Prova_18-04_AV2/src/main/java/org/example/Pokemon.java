package org.example;

public abstract class Pokemon {
    public static int qtdPokemon;
    private String nome;
    private String tipo;
    private HeldItem heldItem;

    public Pokemon(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;

        qtdPokemon++;
    }

    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
    }

    public abstract void atacar();

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public HeldItem getHeldItem() {
        return heldItem;
    }

    public void setHeldItem(HeldItem heldItem) {
        this.heldItem = heldItem;
    }
}
