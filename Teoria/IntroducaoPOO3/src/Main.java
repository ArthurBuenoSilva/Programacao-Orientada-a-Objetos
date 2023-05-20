public class Main {
    public static void main(String[] args) {
        Arma arma = new Arma();
        arma.nome = "Faca";
        arma.poder = 0;
        arma.resistencia = 999;
        arma.descricao = "";

        Personagem personagem = new Personagem();
        personagem.nome = "Matheus";
        personagem.pontos = 100;
        personagem.arma = arma;

        personagem.tomarDano();
        personagem.usarArma();

        arma.mostraInfoArma();
    }
}