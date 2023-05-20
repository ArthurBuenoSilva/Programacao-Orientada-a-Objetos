public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento{
    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou foto no GooglePlus");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou vídeo do GooglePlus");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou comentário no GooglePlus");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou no GooglePlus");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Está fazendo streaming no GooglePlus");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu publicação no GooglePlus");
    }
}
