package org.example;

public class Jogo {
    private String nome;
    private Double preco;
    private String genero;

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public String getGenero() {
        return genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
