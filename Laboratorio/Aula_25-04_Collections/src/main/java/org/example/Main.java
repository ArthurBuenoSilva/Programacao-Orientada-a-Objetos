package org.example;

import java.util.ArrayList;
import static java.util.Collections.sort;
import static java.util.Collections.reverse;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> array = new ArrayList<>();

        Conta c1 = new Conta("Arthur", 2500);

        array.add(10);
        array.add(c1);
        array.add("Yves");
        array.add(false);

        array.remove(c1);

        for (Object obj: array) {
            System.out.println(obj);
        }

        ArrayList<Integer> integer_array = new ArrayList<>();

        integer_array.add(3);
        integer_array.add(12);
        integer_array.add(5);

        // Crescente
        sort(integer_array);
        for (Object obj: integer_array) {
            System.out.println(obj);
        }

        // Decrescente
        reverse(integer_array);
        for (Object obj: integer_array) {
            System.out.println(obj);
        }

        ArrayList<Conta> contas = new ArrayList<>();

        contas.add(new Conta("Arthur", 13550));
        contas.add(new Conta("Anna Clara", 12000));
        contas.add(new Conta("Pedro", 7250));

        // Saldo em ordem crescente
        sort(contas);
        for (Conta conta : contas) {
            System.out.println(conta.saldo);
        }
    }
}