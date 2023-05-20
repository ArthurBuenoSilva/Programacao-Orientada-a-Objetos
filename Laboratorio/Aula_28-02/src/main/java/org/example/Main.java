package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite seu peso(Kg): ");
        float peso = in.nextFloat();

        System.out.print("Digite sua altura(m): ");
        float altura = in.nextFloat();

        double imc = peso / Math.pow(altura, 2);

        if (imc < 18.5)
            System.out.println("Abaixo do peso");
        else if (imc < 24.9)
            System.out.println("Peso Normal");
        else if (imc < 29.9)
            System.out.println("Sobrepeso");
        else if (imc < 34.9)
            System.out.println("Obesidade Grau I");
        else if (imc < 39.9)
            System.out.println("Obesidade Grau II");
        else if (imc >= 40)
            System.out.println("Obesidade Grau III ou Mórbida");
    }
}