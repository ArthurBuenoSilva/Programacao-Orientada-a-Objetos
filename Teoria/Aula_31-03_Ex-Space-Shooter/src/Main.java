import br.inatel.cdg.inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;

public class Main {
    public static void main(String[] args) {
        Nave nave = new Nave("Nave Explosiva", 32, "Explosivo");
        Nave nave2 = new Nave("Nave Normal", 32, "Normal");

        Asteroide ast1 = new Asteroide("Asteroide Grande", "Grande");
        Asteroide ast2 = new Asteroide("Asteroide Pequeno", "Pequeno");

        nave.atirar(ast1);
        nave.atirar(ast2);

        nave2.atirar(ast1);
        nave2.atirar(ast2);
    }
}