package Exemplos;

import java.util.Scanner;
public class Prog01_mat {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);

        System.out.println("BEM VINDO A CALCULADORA DE PORCENTAGEM:");
        System.out.println("Digite um valor o total:");
        int valueTot= read.nextInt();
        System.out.println("Digite a porcentagem na qual deseja descobrir o valor real");
        int percent= read.nextInt();

        int calcPercent= valueTot * percent/100;
        System.out.println(percent+"% de " + valueTot + " e igual a: "+ calcPercent);
    }
}

/* nome: "Gabriel Eduardo do Carmo",
   curso: "Analise e Desenvolvimento de sistemas",
   periodo: 4 
*/