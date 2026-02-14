import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Notas {
    private List<Float> notas = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void setNotas() {
        String[] opcoes = {"sim", "não"};

        while (true) {
            System.out.print("Insira uma nota > ");
            notas.add(input.nextFloat());


            input.nextLine(); // Consome o "Enter" que sobrou do nextFloat()

            System.out.print("Deseja inserir mais uma nota? (sim/não) > ");
            String resposta = input.nextLine().toLowerCase();

            // Validação da resposta
            while (!(Arrays.asList(opcoes).contains(resposta))) {
                System.out.println("Resposta inválida.");
                System.out.print("Digite 'sim' ou 'não' > ");
                resposta = input.nextLine().toLowerCase();
            }

            // Se a resposta for "não", sai do loop principal
            if (resposta.equals("não")) {
                break;
            }
        }
    }
    public String getNotas(){
        StringBuilder display = new StringBuilder();
        for (float nota : this.notas){
            display.append(nota).append("\n");
        }
        return display.toString();
    }
    public float calcularMedia(){
        float somaNotas = 0;
        for (float nota : this.notas){
            somaNotas += nota;
        }
        return somaNotas / this.notas.size();
    }

}
