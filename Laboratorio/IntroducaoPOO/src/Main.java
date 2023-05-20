public class Main {
    public static void main(String[] args) {
        Zumbi zumbi = new Zumbi();
        zumbi.nome = "Zumbi";
        zumbi.vida = 10;

        zumbi.tomouDano(5);
        zumbi.atacar();
    }
}