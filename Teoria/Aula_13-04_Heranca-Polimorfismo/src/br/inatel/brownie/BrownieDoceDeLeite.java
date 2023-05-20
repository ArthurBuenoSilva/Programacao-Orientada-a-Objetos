package br.inatel.brownie;

public class BrownieDoceDeLeite extends Brownie {

    public BrownieDoceDeLeite(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionarDoceDeLeite(){

    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println(getNome() + " foi adicionado ao carrinho");
    }
}
