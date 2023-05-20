package org.example;

public class Nave {
    String nome;
    int velocidade;
    boolean velocidadeDaLuz;
    Arma arma;

    public Nave(String nome, int velocidade, boolean velocidadeDaLuz, String tipo, int forca) {
        this.nome = nome;
        this.velocidade = velocidade;
        this.velocidadeDaLuz = velocidadeDaLuz;
        this.arma = new Arma(tipo, forca);
    }

    public void mostraInfo(){
        System.out.println("O nome da nave é " + this.nome);
        System.out.println("O velocidade da nave é " + this.velocidade);
        if (this.velocidadeDaLuz)
            System.out.println("A nave está na velocidade da luz");
        else
            System.out.println("A nave não está na velocidade da luz");
    }

    public void viajarVelocidadeLuz(){
        if (this.velocidadeDaLuz)
            System.out.println("A nave viaja na velocidade da luz");
        else
            System.out.println("A nave não viaja na velocidade da luz");
    }

    public void addArma(Arma arma){
        this.arma = arma;
        System.out.println("Arma foi adicionada");
    }
}
