public class Main {
    public static void main(String[] args) {
        Kart kart = new Kart("Rapido", "100", 120);

        kart.piloto = new Piloto("Mario", false);

        kart.pular();
        kart.fazerDrift();
        kart.soltarTurbo();

        kart.piloto.soltarSuperPoder();

        kart.motor.mostraInfos();
    }
}