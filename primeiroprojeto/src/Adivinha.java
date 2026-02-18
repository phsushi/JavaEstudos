import java.util.Random;
import java.util.Scanner;

public class Adivinha {
    public static void main(String[] args) {
        int chances = 10;
        int numeroAleatorio = new Random().nextInt(100);
        Scanner sca = new Scanner(System.in);
        int tentativa;
        do{
            System.out.println("Tente adivinhar o número entre 1-100");
            tentativa =  sca.nextInt();
            if(tentativa == numeroAleatorio){
                System.out.println("Parabens, você acertou!");
                break;
            } else if (tentativa >= numeroAleatorio) {
                System.out.println("Quase, o número que você tentou é maior que o número gerado.");
            }else{
                System.out.println("Quase, o número que você tentou é menor que o número gerado.");
            }
            chances--;
            System.out.println("Você tem "+chances+" chances ainda.");
        }
        while (chances > 0 && tentativa != numeroAleatorio);
        if (chances == 0){
            System.out.println("O número gerado era: "+numeroAleatorio+";");
        }

    }
}
