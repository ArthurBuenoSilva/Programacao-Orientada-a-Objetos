import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Empresario empresario = new Empresario("Chris", 123456790);
        Banda banda = new Banda("Javinha da Madruga", "Não Binário");

        banda.empresario = empresario;

        Scanner in = new Scanner(System.in);

        boolean flag = true;

        while (flag){
            System.out.println("1 - Adicionar Membro");
            System.out.println("2 - Adicionar Música");
            System.out.println("3 - Mostra Info");
            System.out.println("4 - Sair");

            int acao = in.nextInt();

            switch (acao) {
                case 1 -> {
                    in.nextLine();
                    System.out.println("Digite o nome do membro: ");
                    String nome = in.nextLine();

                    System.out.println("Digite a função desse mebro: ");
                    String funcao = in.nextLine();

                    Membro membro = new Membro(nome, funcao);
                    banda.addMembroNovo(membro);
                }
                case 2 -> {
                    in.nextLine();
                    System.out.println("Digite o nome da musica: ");
                    String nome = in.nextLine();

                    System.out.println("Digite a duração da musica: ");
                    double duracao = in.nextDouble();

                    Musica musica = new Musica(nome, duracao);
                    banda.addMusicaNova(musica);
                }
                case 3 -> {
                    banda.mostraInfo();
                }
                case 4 -> {
                    flag = false;
                }
                default -> {
                    System.out.println("Opção não encontrada");
                }
            }

            System.out.println("----------------------------------");
        }
    }
}