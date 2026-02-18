import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Digite um número:");
        int valor = sca.nextInt();
        int fatorial = valor;
        StringBuilder operacao = new StringBuilder(valor+" = "+valor);
        while(valor>1){
            valor--;
            fatorial *=valor;
            operacao.append(" * "+valor);
        }
        operacao.append(" = "+fatorial);
        System.out.println(operacao);
    }
}
