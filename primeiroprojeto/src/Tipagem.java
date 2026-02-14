public class Tipagem {
    public static String[] tiposPrimitivos = {"int","String","boolean","double","char","byte","short","long","float"};

    public static void getTiposPrimitivos(){
        System.out.println("\nTipos de dados primitivos: \n");

        for (String tipoPrimitivo : tiposPrimitivos) {
            System.out.println(tipoPrimitivo);
        }
    }
}
