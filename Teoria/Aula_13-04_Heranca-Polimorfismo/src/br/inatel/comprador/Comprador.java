package br.inatel.comprador;

import br.inatel.brownie.Brownie;

public class Comprador {
    private String nome;
    private double saldo;

    public Comprador(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public void efetuaCompra(Brownie brownie){
        if (saldo - brownie.getPreco() >= 0){
            brownie.addCarrinhoDeCompras();
            brownie.calculaValorTotalCompra();

            saldo -= brownie.getPreco();
        }else{
            System.out.println("Não foi possível comprar, saldo insuficiente");
        }
    }
}
