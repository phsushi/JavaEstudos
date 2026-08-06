package br.com.fiap;

import java.util.Scanner;

public class EquacaoSegundoGrau {
 //x1 = (-b + sqrt(b^2 - 4*a*c))/2
 //x2 = (-b - sqrt(b^2 - 4*a*c))/2
     public static Scanner sca = new Scanner(System.in);
     public static void main(String[] args) {

         System.out.println("\n===== Calculadora de equações do segundo grau =====");
         System.out.println("Digite o valor de A: ");
         float a = sca.nextFloat();
         sca.nextLine();
         System.out.println("Digite o valor de B: ");
         float b = sca.nextFloat();
         sca.nextLine();
         System.out.println("Digite o valor de C: ");
         float c = sca.nextFloat();
         sca.nextLine();

         calculaEquacao(b,a,c);
     }
     public static double calculaDelta(float b, float a, float c){
         double delta = Math.pow(b,2) - 4*a*c;
         return delta;
     }
     public static void calculaEquacao(float b, float a, float c){
         double delta = calculaDelta(b,a,c);
         if (delta < 0){
             System.out.println("Delta negativo");
             return;
         }
         float x1 = (float) (-b + Math.sqrt(delta))/(2*a);
         float x2 = (float) (-b - Math.sqrt(delta))/(2*a);
         System.out.printf("Os valores de x que resolvem essa equação são %.2f e %.2f",x1,x2);
     }
}
