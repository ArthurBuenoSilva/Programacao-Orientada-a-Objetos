public class Banda {
    String nome;
    String genero;
    Empresario empresario;

    Membro[] membros = new Membro[10];
    Musica[] musicas = new Musica[10];


    public Banda(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Genero: " + genero);

        for (Membro membro: membros){
            if (membro != null)
                System.out.println(membro.nome);
            else
                break;
        }

        for (Musica musica: musicas){
            if (musica != null)
                System.out.println(musica.nome);
            else
                break;
        }

        System.out.println(empresario.nome);
    }

    public void addMusicaNova(Musica musica){
        for (int i = 0; i < musicas.length; i++) {
            if (musicas[i] == null){
                musicas[i] = musica;
                break;
            }
        }
    }

    public void addMembroNovo(Membro membro){
        for (int i = 0; i < membros.length; i++) {
            if (membros[i] == null){
                membros[i] = membro;
                break;
            }
        }
    }
}
