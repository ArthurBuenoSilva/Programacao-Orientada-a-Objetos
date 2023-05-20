package org.example;

public class Main {
    public static void main(String[] args) {
        Anao anao = new Anao("Dain IronFoot", 300, 250, 10.5f, "Erebor");
        Elfo elfo = new Elfo("Elrond", 1500, 500, "Valfenda");
        Mago mago = new Mago("Gandalf", 5000, 700, "Cinzento");

        anao.setArma(new Arma("Machado", false));
        elfo.setArma(new Arma("Arco", false));
        mago.setArma(new Arma("Cajado", true));

        TerraMedia terraMedia = new TerraMedia();

        terraMedia.addHabitante(anao);
        terraMedia.addHabitante(elfo);
        terraMedia.addHabitante(mago);

        terraMedia.listarHabitantes();
    }
}