package org.example;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario(21, "Victor", 123456789, 500);
        Funcionario f2 = new Funcionario(20, "Ives", 123456789,400);

        if (f1.equals(f2))
            System.out.println("São Iguais");
        else
            System.out.println("São Diferentes");

        System.out.println("O salario anual do " + f1.nome + " é R$ " + f1.calcularSalarioAnual(300));
        f1.tirarFerias("Junho", 27);
    }
}