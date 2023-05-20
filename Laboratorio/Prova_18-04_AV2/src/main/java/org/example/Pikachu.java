package org.example;

public class Pikachu extends Pokemon implements FazerBarulho, AtaqueEspecial{
    private float soltaRaios;
    private float paralisiaEletrica;

    public Pikachu(String nome, String tipo, float soltaRaios, float paralisiaEletrica) {
        super(nome, tipo);
        this.soltaRaios = soltaRaios;
        this.paralisiaEletrica = paralisiaEletrica;
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " esta atacando!");
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Solta Raios: " + soltaRaios);
        System.out.println("Paralisia Eletrica: " + paralisiaEletrica);
    }

    @Override
    public void ataqueEspecial() {
        // Se tiver Held Item adiciona poder
        if (getHeldItem() != null)
            soltaRaios += 200;

        if (soltaRaios > 750)
            System.out.println(getNome() + " conseguiu ganhar de seu oponente!");
        else
            System.out.println(getNome() + " perdeu a batalha");
    }

    @Override
    public void fazerBarulho() {
        System.out.println(getNome() + " esta fazendo barulho!");
    }
}
