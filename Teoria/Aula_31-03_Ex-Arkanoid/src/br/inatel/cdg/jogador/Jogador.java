package br.inatel.cdg.jogador;

import br.inatel.cdg.bloco.Bloco;

public class Jogador {
    private int pontos;
    private String nome;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public void destruirBloco(Bloco bloco) {
        bloco.destruir();
        pontos++;
    }

    public int getPontos() {
        return pontos;
    }

    public String getNome() {
        return nome;
    }
}
