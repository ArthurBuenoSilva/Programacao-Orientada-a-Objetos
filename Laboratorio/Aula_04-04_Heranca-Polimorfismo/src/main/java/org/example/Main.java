package org.example;

public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];

        funcionarios[0] = new Arquiteto("Anna", 19, 500, "Predial");
        funcionarios[1] = new Engenheiro("Victor", 22, 1000, "Iot");
        funcionarios[2] = new Professor("Chris", 30, 3000, "POO");

        for (Funcionario funcionario : funcionarios) {
            if (funcionario != null) {
                if (funcionario instanceof Arquiteto a)
                    a.mostraInfo();
                else if (funcionario instanceof Engenheiro e)
                    e.mostraInfo();
                else if (funcionario instanceof Professor p)
                    p.mostraInfo();
            }
        }
    }
}