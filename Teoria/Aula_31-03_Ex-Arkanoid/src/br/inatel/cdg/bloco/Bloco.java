package br.inatel.cdg.bloco;

public class Bloco {

    private static int qtdBlocos;
    private static int blocosCriados;
    private static int blocosDestruidos;

    public Bloco() {
        qtdBlocos++;
        blocosCriados++;
    }

    public void destruir(){
        qtdBlocos--;
        blocosDestruidos++;
    }

    public static int getQtdBlocos() {
        return qtdBlocos;
    }

    public static int getBlocosCriados() {
        return blocosCriados;
    }

    public static int getBlocosDestruidos() {
        return blocosDestruidos;
    }
}
