package br.com.fiap;

import java.util.Scanner;

public class CalculaArea {
    public static Scanner sca = new Scanner(System.in);
    public static void main(String[] args) {
        areaTriangulo();
        areaRetangulo();
        areaTrapezio();
    }
    public static void areaTriangulo(){
        System.out.println("\n======= Calculadora de Área de Triângulos =======");
        System.out.println("\nDigite qual é a medida da base: ");
        float base = sca.nextFloat();
        sca.nextLine();
        System.out.println("\nAgora digite a medida da altura: ");
        float altura = sca.nextFloat();
        sca.nextLine();
        float area = (base * altura) / 2;
        System.out.printf("A área do seu triângulo é: %.2f",area);
    }
    public static void areaRetangulo(){
        System.out.println("\n======= Calculadora de Área de Retângulos =======");
        System.out.println("\nDigite qual é a medida da base: ");
        float base = sca.nextFloat();
        sca.nextLine();
        System.out.println("\nAgora digite a medida da altura: ");
        float altura = sca.nextFloat();
        sca.nextLine();
        float area = base * altura;
        System.out.printf("A área do seu retângulo é: %.2f",area);
    }
    public static void areaTrapezio(){
        System.out.println("\n======= Calculadora de Área de Trapézios =======");
        System.out.println("\nDigite qual é a medida da base maior: ");
        float baseMaior = sca.nextFloat();
        sca.nextLine();
        System.out.println("\nAgora digite a medida da base menor: ");
        float baseMenor = sca.nextFloat();
        sca.nextLine();
        float area = ((baseMaior + baseMenor) * 2)/2;
        System.out.printf("A área do seu triângulo é: %.2f",area);
    }


}
