package org.example;

public class Arquiteto extends Funcionario {
    private String especialidade;

    public Arquiteto(String nome, int idade, double salario, String especialidade) {
        super(nome, idade, salario);
        this.especialidade = especialidade;
    }

    @Override
    public void mostraInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Salario: " + getSalario());
        System.out.println("Especialidade: " + especialidade);
        System.out.println("---------------------------");
    }

    @Override
    public void executaAcao() {
        super.executaAcao();
        System.out.println("Arquiteto " + getNome() + " está planejando um prédio");
    }

    @Override
    public double salarioBonus() {
        return super.salarioBonus() + 700;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
