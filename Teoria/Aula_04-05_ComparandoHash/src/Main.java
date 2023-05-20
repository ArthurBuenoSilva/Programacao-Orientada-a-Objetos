import java.util.*;

public class Main {
    public static void tempo_array_list(int qtd){
        long TInicial = System.currentTimeMillis();

        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < qtd; i++) {
            lista.add(i);
        }

        long TFinal = System.currentTimeMillis();

        System.out.println("Inserir ArrayList: " + (TFinal - TInicial) + " ms");

        TInicial = System.currentTimeMillis();

        for (int i = 0; i < qtd; i++) {
            lista.contains(i);
        }

        TFinal = System.currentTimeMillis();
        System.out.println("Ler ArrayList: " + (TFinal - TInicial) + " ms");
    }

    public static void tempo_hash_set(int qtd){
        long TInicial = System.currentTimeMillis();

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < qtd; i++) {
            set.add(i);
        }

        long TFinal = System.currentTimeMillis();

        System.out.println("Inserir HashSet: " + (TFinal - TInicial) + " ms");

        TInicial = System.currentTimeMillis();

        for (int i = 0; i < qtd; i++) {
            set.contains(i);
        }

        TFinal = System.currentTimeMillis();
        System.out.println("Ler HashSet: " + (TFinal - TInicial) + " ms");
    }

    public static void tempo_hash_map(int qtd){
        long TInicial = System.currentTimeMillis();

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < qtd; i++) {
            map.put(i, i);
        }

        long TFinal = System.currentTimeMillis();

        System.out.println("Inserir HashMap: " + (TFinal - TInicial) + " ms");

        TInicial = System.currentTimeMillis();

        //map.forEach((chave, valor) -> {});

        for (int i = 0; i < qtd; i++) {
            map.containsKey(i);
        }

        TFinal = System.currentTimeMillis();
        System.out.println("Ler HashMap: " + (TFinal - TInicial) + " ms");
    }

    public static void main(String[] args) {

        int qtd = 100000;

        tempo_array_list(qtd);
        tempo_hash_set(qtd);
        tempo_hash_map(qtd);
    }
}