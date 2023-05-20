import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String email;
    private ArrayList<RedeSocial> redesSociais;

    public Usuario(String nome, String email, ArrayList<RedeSocial> redesSociais) {
        this.nome = nome;
        this.email = email;
        this.redesSociais = redesSociais;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<RedeSocial> getRedesSociais() {
        return redesSociais;
    }
}
