package br.com.fiap;

public class Questionario {
    public static void main(String[] args) {
        System.out.println("1) Explique Orientação à Objetos\n");

        System.out.println("R. Paradigma que determina uma forma de como encarar e resolver um problema. Essa forma sendo por meio de conceitos de Objeto e Classes.\n");

        System.out.println("2) Explique o que é objeto\n");

        System.out.println("R. Algo que tem caracteristicas e/ou ações. A instância de uma classe. A partir do momento que você coloca os atributos definidos pela classe, você irá obter um objeto.\n");

        System.out.println("3) Explique o que é classe\n");

        System.out.println("R. Classe é uma fabrica de objetos, um molde que define quais serão os atributos e métodos que os objetos vão precisar ter. Uma generalização de todos os objetos de um conjunto especifico.\n");

        System.out.println("4) Explique o que é abstração\n");

        System.out.println("R. É a ocultação da complexidade de como um processo é realizado e apenas extraindo o seu resultado ou o que é mais importante para o contexto apenas.\n");

        System.out.println("5) Explique o que é herança\n");

        System.out.println("R. É quando a partir duma classe você cria subclasses relacionadas e essas subclasses irão herdar todos os atributos e métodos da classe base. \n");

        System.out.println("6) Explique o que é encapsulamento\n");

        System.out.println("R. É a forma de separar dos aspectos externos de um objeto, acessíveis por outros objetos, de seus detalhes internos de implementação, que ficam ocultos dos demais objetos. Você cria uma variável cpf e ela é privada, a única forma de você ter acesso ao cpf seria por meio de um método get.\n");

        System.out.println("7) Explique o que é polimorfismo\n");

        System.out.println("R. Quando uma mesma coisa, com mesmo nome, realiza diferentes funções. \n");

        System.out.println("8) Quais os principais tipos de polimorfismo? Explique cada um deles.\n");

        System.out.println("R. Sobrescrita e Sobrecarga. \nSobrescrita: Métodos que tem o mesmo nome, mas com funcionalidades diferentes. Em um caso de herança, por exemplo, você obtém todos os métodos e atributos da classe base, mas não quer que um certo método seja feito da mesma forma, então você o sobrescreve, mudando o que ele faz. \nSobrecarga: Ocorre quando existem dois métodos com mesmo nome, na mesma classe com parâmetros diferentes. Seja mais, ou menos, ou de um tipo de dados diferente.");
    }
}
