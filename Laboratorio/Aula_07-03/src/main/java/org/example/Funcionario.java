package org.example;

public class Funcionario {
    private int idade;
    public String nome;
    private int cpf;
    private final float salario;

    public Funcionario(int idade, String nome, int cpf, float salario) {
        this.idade = idade;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public void tirarFerias(String mes, int quantidade){
        System.out.println("O funcionário " + this.nome + " tirou " + quantidade + " dias de férias no mês de " + mes);
    }

    public float calcularSalarioAnual(){
        return this.salario * 12;
    }

    public float calcularSalarioAnual(float bonus){
        return this.salario * 12 + bonus;
    }
}
