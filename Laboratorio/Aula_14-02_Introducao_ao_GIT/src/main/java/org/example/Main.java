package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Almoxarifado");
        System.out.println("Resistor | Capacitor | Protoboard");
        System.out.println("Faça sua requisição:");

        Scanner in = new Scanner(System.in);
        String componente = in.nextLine();

        switch (componente) {
            case ("Resistor") -> System.out.println("Você requisitou um Resistor");
            case ("Capacitor") -> System.out.println("Você requisitou um Capacitor");
            case ("Protoboard") -> System.out.println("Você requisitou uma Protoboard");
            default -> System.out.println("Escolha inválida");
        }
    }
}