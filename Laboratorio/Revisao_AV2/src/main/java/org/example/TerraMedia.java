package org.example;

public class TerraMedia {
    private Habitante [] herois = new Habitante[10];

    public void addHabitante(Habitante habitante){
        for (int i = 0; i < herois.length; i++) {
            if (herois[i] == null){
                herois[i] = habitante;
                break;
            }
        }
    }

    public void listarHabitantes(){
        for (Habitante habitante: herois){
            if (habitante instanceof Anao anao) {
                anao.minerar();
                anao.atacar();
                anao.mostraInfo();
                System.out.println("-----------------------");
            } else if (habitante instanceof Elfo elfo){
                elfo.viajar();
                elfo.curar();
                elfo.atacar();
                elfo.mostraInfo();
                System.out.println("-----------------------");
            } else if (habitante instanceof Mago mago){
                mago.lancaFeitico();
                mago.curar();
                mago.atacar();
                mago.mostraInfo();
                System.out.println("-----------------------");
            }
        }
    }
}
