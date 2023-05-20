package br.inatel.brownie;

public class Brownie {
    private String nome;
    private double preco;
    private String sabor;

    public Brownie(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhoDeCompras(){
        System.out.println("Brownie default adicionado ao carrinho");
    }

    public void calculaValorTotalCompra(){
        System.out.println("Valor total da compra = " + preco);
    }

    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Sabor: " + sabor);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getSabor() {
        return sabor;
    }
}
