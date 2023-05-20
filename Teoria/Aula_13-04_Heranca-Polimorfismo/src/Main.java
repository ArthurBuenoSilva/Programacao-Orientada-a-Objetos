import br.inatel.brownie.Brownie;
import br.inatel.brownie.BrownieCafe;
import br.inatel.brownie.BrownieNutella;
import br.inatel.brownie.BrownieDoceDeLeite;
import br.inatel.comprador.Comprador;

public class Main {
    public static void main(String[] args) {
        Comprador comprador = new Comprador("Arthur", 200);

        Brownie bn = new BrownieNutella("Brownie de Nutella", 12, "Nutella");
        Brownie bc = new BrownieCafe("Brownie de Café", 10, "Café");
        Brownie bd = new BrownieDoceDeLeite("Brownie de Doce de Leite", 8, "Doce de Leite");

        System.out.println("------ Informações do Brownie ------");
        bn.mostraInfo();
        System.out.println("------------------");
        bc.mostraInfo();
        System.out.println("------------------");
        bd.mostraInfo();

        System.out.println("------ Compras ------");
        comprador.efetuaCompra(bn);
        System.out.println("------------------");
        comprador.efetuaCompra(bc);
        System.out.println("------------------");
        comprador.efetuaCompra(bd);
        System.out.println("------------------");
    }
}