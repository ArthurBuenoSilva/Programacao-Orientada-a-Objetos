package org.example;

public class Funcionario {
    String nome;
    int id;
    private float salario;
    private static int cont;

    public Funcionario(String nome, float salario) {
        cont++;
        this.nome = nome;
        this.id = cont;
        this.salario = salario;
    }

    public void mostraInfo(){
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
    }

    public static int getCont() {
        return cont;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
