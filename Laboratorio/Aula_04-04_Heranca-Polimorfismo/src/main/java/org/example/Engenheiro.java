package org.example;

public class Engenheiro extends Funcionario implements Gerencia {
    private String ramo;

    public Engenheiro(String nome, int idade, double salario, String ramo) {
        super(nome, idade, salario);
        this.ramo = ramo;
    }

    @Override
    public void mostraInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Salario: " + getSalario());
        System.out.println("Ramo: " + ramo);
        System.out.println("---------------------------");
    }

    @Override
    public void executaAcao() {
        super.executaAcao();
        System.out.println("Engenheiro " + getNome() + " está pesquisando sobre Iot");
    }

    @Override
    public double salarioBonus() {
        return super.salarioBonus() + 1200;
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    @Override
    public void gerencia() {
        System.out.println("Engenheiro gerencia");
    }
}
