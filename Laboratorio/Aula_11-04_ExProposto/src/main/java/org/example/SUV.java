package org.example;

public class SUV extends Carro {
    private String tracao;

    public SUV(double valor, String cor, int ano, String tracao){
        super(valor, cor, ano);
        this.tracao = tracao;
    }

    @Override
    public void taxa() {
        System.out.println("Taxa: 5%");
    }

    @Override
    public void mostraInfo() {
        System.out.println("Valor: " + getValor());
        System.out.println("Cor: " + getCor());
        System.out.println("Ano: " + getAno());
        System.out.println("Tracao: " + tracao);
        System.out.println("-------------------------");
    }
}
