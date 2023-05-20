package org.example;

public class Bulbassaur extends Pokemon implements FazerBarulho, AtaqueEspecial{
    private float luminosidadeAmbiente;

    public Bulbassaur(String nome, String tipo, float luminosidadeAmbiente) {
        super(nome, tipo);
        this.luminosidadeAmbiente = luminosidadeAmbiente;
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " esta atacando!");
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Luminosidade Ambiente: " + luminosidadeAmbiente);
    }

    @Override
    public void ataqueEspecial() {
        // Se tiver Held Item adiciona poder
        if (getHeldItem() != null)
            luminosidadeAmbiente += 300;

        if (luminosidadeAmbiente > 650)
            System.out.println(getNome() + " conseguiu ganhar de seu oponente!");
        else
            System.out.println(getNome() + " perdeu a batalha");
    }

    @Override
    public void fazerBarulho() {
        System.out.println(getNome() + " esta fazendo barulho!");
    }
}
