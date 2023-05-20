public class Kart {
    String nome;
    Motor motor;
    Piloto piloto;

    public Kart(String nome, String cilindradas, float velocidadeMaxima) {
        this.nome = nome;
        this.motor = new Motor(cilindradas, velocidadeMaxima);
    }

    public void pular() {
        System.out.println("Kart " + nome + " está pulando");
    }

    public void soltarTurbo() {
        System.out.println("Kart " + nome + " soltar turbo");
    }

    public void fazerDrift() {
        System.out.println("Kart " + nome + " está fazendo drift");
    }
}
