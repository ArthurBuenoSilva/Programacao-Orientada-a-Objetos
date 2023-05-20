import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Facebook facebook = new Facebook("123", 10);
        Instagram instagram = new Instagram("123", 10);

        ArrayList<RedeSocial> redesSociais = new ArrayList<>();
        redesSociais.add(facebook);
        redesSociais.add(instagram);

        Usuario usuario = new Usuario("Arthur", "arthur.bueno@gec.inatel.br", redesSociais);

        System.out.println("Usuário " + usuario.getNome());
        System.out.println("----------------------");

        for (RedeSocial redeSocial: usuario.getRedesSociais()){
            if (redeSocial instanceof Facebook f){
                f.compartilhar();
                f.fazStreaming();
                f.postarVideo();
                System.out.println("----------------------");
            } else if (redeSocial instanceof GooglePlus g) {
                g.compartilhar();
                g.postarComentario();
                g.postarVideo();
                System.out.println("----------------------");
            } else if (redeSocial instanceof Twitter t) {
                t.postarFoto();
                t.curtirPublicacao();
                t.postarVideo();
                System.out.println("----------------------");
            } else if (redeSocial instanceof Instagram i) {
                i.curtirPublicacao();
                i.postarFoto();
                i.postarComentario();
                System.out.println("----------------------");
            }
        }
    }
}