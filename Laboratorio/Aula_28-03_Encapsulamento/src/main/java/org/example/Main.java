package org.example;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Paulo", 1220);
        Funcionario f2 = new Funcionario("Marcos", 4350.2f);

        System.out.println(Funcionario.getCont());
    }
}