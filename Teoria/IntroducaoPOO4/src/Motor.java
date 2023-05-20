public class Motor {
    String cilindradas;
    float velocidadeMaxima;

    public Motor(String cilindradas, float velocidadeMaxima) {
        this.cilindradas = cilindradas;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void mostraInfos() {
        System.out.println("Cilindradas = " + cilindradas + " | Velocidade Máxima = " + velocidadeMaxima);
    }
}
