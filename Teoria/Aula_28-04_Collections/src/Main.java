import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<minhaClasse> lista = new ArrayList<>();
        lista.add(new classe1("Teste1", 10));
        lista.add(new classe1("Teste2", 12));

        lista.add(new classe2("Teste3", 5));
        lista.add(new classe2("Teste4", 24));

        lista.add(new classe3("Teste5", 43));
        lista.add(new classe3("Teste6", 7));

        Collections.sort(lista);

        for (minhaClasse classe: lista){
            System.out.println(classe.valor);
        }
    }
}