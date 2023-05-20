public class Instagram extends RedeSocial{

    public Instagram(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou foto no Instagram");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou vídeo do Instagram");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou comentário no Instagram");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu publicação no Instagram");
    }
}
