

public class Main {

    public static String[] tiposPrimitivos = {"int","String","boolean","double","char","byte","short","long","float"};

    public static void main(String[] args){
        listarTiposPrimitivos();
        printarTextoFormatado();
    }
    public static void listarTiposPrimitivos(){
        System.out.println("\nTipos de dados primitivos: \n");

        for (String tipoPrimitivo : tiposPrimitivos) {
            System.out.println(tipoPrimitivo);
        }
    }
    public static void printarTextoFormatado(){
        String nome = "Paulo";
        short idade = 19;
        double valorDePi = 3.14159265359;

        String mensagem = """
                Olá, meu nome é %s!
                
                Tenho %d anos e sei que o valor de PI é aproximadamente %.2f.
                """.formatted(nome,idade,valorDePi);

        System.out.println(mensagem);
        /*
        Outra forma de formatar o texto:

        System.out.println(String.format("""
                Olá, meu nome é %s!

                Tenho %d anos e sei que o valor de PI é aproximadamente %.2f.
                """,nome, idade, valorDePi));
         */
    }
}
