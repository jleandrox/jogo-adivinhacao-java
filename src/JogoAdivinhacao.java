import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroAdivinhacao;
        Random random = new Random();
        int numeroSecreto = random.nextInt(100);
        boolean acertou = false;

        System.out.println("Número Secreto: " + numeroSecreto);

        for ( int i = 0; i <= 9; i++) {
            System.out.println("Tentativa Atual: " + (i + 1) +" de 10.");
            System.out.print("Informe um número de 0 a 100: ");
            numeroAdivinhacao = sc.nextInt();

            if (numeroAdivinhacao < 0 || numeroAdivinhacao > 100) {
                System.out.println("Número Inválido, tente novamente. >.>");
            }
             else if (numeroAdivinhacao == numeroSecreto) {
                System.out.println("Parabén, você ACERTOU o NÚMERO SECRETO!!");
                acertou = true;
                break;
            } else if (numeroAdivinhacao < numeroSecreto) {
                System.out.println("Foi quase, seu número é menor que o número secreto.");
            } else {
                System.out.println("Opss, número alto do que o número secreto.");
            }
            } if (!acertou) {
            System.out.println("Você perdeu! O número secreto era: " + numeroSecreto);
        }
        sc.close();
    }
}
