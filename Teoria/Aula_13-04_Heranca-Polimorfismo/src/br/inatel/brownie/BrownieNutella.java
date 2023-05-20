package br.inatel.brownie;

public class BrownieNutella extends Brownie{

    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionarNutella(){

    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println(getNome() + " foi adicionado ao carrinho");
    }
}
