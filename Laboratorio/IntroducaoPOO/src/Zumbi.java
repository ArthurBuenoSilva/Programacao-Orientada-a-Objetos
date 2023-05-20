public class Zumbi{
    String nome;
    int vida;

    public void atacar(){
        System.out.println("Atacando");
    }

    public void tomouDano(int dano) {
        if (dano >= vida) {
            vida = 0;
            System.out.println(nome + " morreu");
        } else {
            vida -= dano;
            System.out.println("Ainda resta " + vida + " de vida");
        }
    }
}