public class Formatacao {
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
