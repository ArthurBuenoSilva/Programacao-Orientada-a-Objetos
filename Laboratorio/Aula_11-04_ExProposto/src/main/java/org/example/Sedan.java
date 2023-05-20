package org.example;

public class Sedan extends Carro {
    private int portaMalas;

    public Sedan(double valor, String cor, int ano, int portaMalas) {
        super(valor, cor, ano);
        this.portaMalas = portaMalas;
    }

    @Override
    public void taxa() {
        System.out.println("Taxa: 4.5%");
    }

    @Override
    public void mostraInfo() {
        System.out.println("Valor: " + getValor());
        System.out.println("Cor: " + getCor());
        System.out.println("Ano: " + getAno());
        System.out.println("Porta Malas: " + portaMalas);
        System.out.println("-------------------------");
    }
}
