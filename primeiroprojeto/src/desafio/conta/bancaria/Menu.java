package desafio.conta.bancaria;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    public static Scanner sca = new Scanner(System.in);
    public static boolean programStillRun = true;
    public static String options = "12345";
    public static ContaBancaria conta;
    public static void showOptions(){
        System.out.println(String.format("""
                Operações:
                
                1- Criar conta 
                2- Consultar dados da conta
                3- Receber valor
                4- Fazer transferência
                5- Sair
                
                """));
    }
    public static String validateResponse(String response){
        while(!options.contains(response)){
            System.out.println("Opção inválida.");
            showOptions();
            response = sca.nextLine();
        }
        return response;
    }
    public static int readAnswerOptions(){

            String response = sca.nextLine();

            response = validateResponse(response);

            return Integer.parseInt(response);
    }
    public static void choseOption(int option){
        switch (option){
            case(1):
                accCreation();
                break;
            case(2):
                optionSelectAccInformation();
                break;
            case(3):
                optionReceiveMoney();
                break;

            case(4):
                optionTransference();
                break;
            case(5):
                programStillRun = !programStillRun;
        }
    }
    public static void accCreation(){
        System.out.println("Digite seu nome completo: ");
        String name = sca.nextLine();
        conta = new ContaBancaria(name);
        System.out.println("Conta criada com sucesso.\n");
    }
    public static void optionSelectAccInformation(){
        conta.getAccInformations();
        System.out.println();

    }
    public static void optionReceiveMoney(){
        System.out.println("Qual é o valor a ser recebido?");
        double value = sca.nextDouble();
        sca.nextLine();
        conta.receiveMoney(value);
        System.out.println("Valor recebido.\n");

    }
    public static void optionTransference(){
        System.out.println("Qual é o valor a ser transferido?");
        double value = sca.nextDouble();
        sca.nextLine();
        conta.transferation(value);
        System.out.println("Transferencia realizada com sucesso.\n");

    }
    public static void main(String[] args) {
        while(programStillRun){
            showOptions();
            choseOption(readAnswerOptions());

        }
    }
}
