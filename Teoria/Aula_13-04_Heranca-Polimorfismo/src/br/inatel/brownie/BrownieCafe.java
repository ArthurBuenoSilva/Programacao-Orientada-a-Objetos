package br.inatel.brownie;

public class BrownieCafe extends Brownie{
    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionarCafe(){

    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println(getNome() + " foi adicionado ao carrinho");
    }
}
