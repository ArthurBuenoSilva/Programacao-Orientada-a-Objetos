package org.example;

public class Professor extends Funcionario {
    private String materia;

    public Professor(String nome, int idade, double salario, String materia) {
        super(nome, idade, salario);
        this.materia = materia;
    }

    @Override
    public void mostraInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Salario: " + getSalario());
        System.out.println("Materia: " + materia);
        System.out.println("---------------------------");
    }

    public void corrigirProvas() {
        System.out.println("O professor " + this.getNome() + " está corrigindo provas");
    }

    @Override
    public void executaAcao() {
        super.executaAcao();
        System.out.println("Professor " + this.getNome() + " está dando aulas");
    }

    @Override
    public double salarioBonus() {
        return super.salarioBonus() + 350;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}