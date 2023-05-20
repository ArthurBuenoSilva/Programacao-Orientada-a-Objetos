public class Twitter extends RedeSocial implements Compartilhamento{
    public Twitter(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou foto no Twitter");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou vídeo do Twitter");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou comentário no Twitter");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou no Twitter");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu publicação no Twitter");
    }
}
