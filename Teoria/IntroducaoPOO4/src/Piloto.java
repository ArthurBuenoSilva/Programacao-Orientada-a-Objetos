public class Piloto {
    String nome;
    boolean vilao;

    public Piloto(String nome, boolean vilao) {
        this.nome = nome;
        this.vilao = vilao;
    }

    public void soltarSuperPoder() {
        System.out.println("Piloto " + nome + " soltou super poder");
    }
}
