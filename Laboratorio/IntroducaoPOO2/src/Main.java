public class Main {
    public static void main(String[] args) {
        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi1.vida = 22;
        zumbi2.vida = 16;

        System.out.println("Vida do Zumbi 1: " + zumbi1.mostraVida());
        System.out.println("Vida do Zumbi 2: " + zumbi2.mostraVida());

       if (!zumbi1.transfereVida(zumbi2, 21 ))
           System.out.println("Não foi possível transferir a vida");

        System.out.println(" ------------------------------- ");
        System.out.println("Vida do Zumbi 1: " + zumbi1.mostraVida());
        System.out.println("Vida do Zumbi 2: " + zumbi2.mostraVida());
    }
}