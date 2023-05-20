import br.inatel.cdg.bloco.Bloco;
import br.inatel.cdg.conversor.Conversor;
import br.inatel.cdg.jogador.Jogador;

public class Main {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Jogador");
        Bloco b1 = new Bloco();
        Bloco b2 = new Bloco();
        Bloco b3 = new Bloco();
        Bloco b4 = new Bloco();

        jogador.destruirBloco(b1);
        jogador.destruirBloco(b2);
        jogador.destruirBloco(b3);

        System.out.println("Quantidade de blocos criados: " + Bloco.getBlocosCriados());
        System.out.println("Quantidade de blocos destruidos: " + Bloco.getBlocosDestruidos());
        System.out.println("Pontos do jogador: " + Conversor.converter(jogador.getPontos()));
    }
}