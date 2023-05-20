public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento{
    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou foto no Facebook");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou vídeo do Facebook");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou comentário no Facebook");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou no Facebook");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Está fazendo streaming no Facebook");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu publicação no Facebook");
    }
}
