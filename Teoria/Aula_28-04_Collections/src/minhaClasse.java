public abstract class minhaClasse implements Comparable<minhaClasse> {
    String nome;
    int valor;

    public minhaClasse(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public int compareTo(minhaClasse o) {
        return Integer.compare(o.valor, this.valor);
    }
}
