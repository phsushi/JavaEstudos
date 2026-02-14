

public class Main {

    public static void main(String[] args){
        //Tipos de váriaveis
        //Tipagem.getTiposPrimitivos();
        //Print formatado
        //Formatacao.printarTextoFormatado();

        /*ConversorTemperatura graus = new ConversorTemperatura();

        graus.setTemperatura(35);

        double convertido = graus.converter();

        System.out.println(convertido);*/
        Notas calc = new Notas();
        calc.setNotas();
        System.out.println(calc.getNotas());
        System.out.println(calc.calcularMedia());

    }


}
