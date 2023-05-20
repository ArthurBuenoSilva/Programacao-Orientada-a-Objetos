import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        int mina_line = random.nextInt(2);
        int mina_column = random.nextInt(2);

        int [][] campo = new int[2][2];
        campo[mina_line][mina_column] = 1;

        int sum = 0;
        boolean flag = true;

        while (flag){
            System.out.println("Digite a linha que você quer acessar: ");
            int line = in.nextInt();

            System.out.println("Digite a coluna que você quer acessar: ");
            int column = in.nextInt();

            if (campo[line][column] == 1){
                System.out.println("Pisou na bomba na linha " + line + " e coluna " + column);
            }else if (campo[line][column] == 0) {
                campo[line][column] = -1;
                sum += 1;
            }

            if (sum == 3){
                flag = false;
            }
        }

        System.out.println("Você sobreviveu ao campo");
    }
}