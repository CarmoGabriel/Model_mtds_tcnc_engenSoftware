package Exemplos;

import java.util.Scanner;

class trianguloRetangulo{
    int height;
    int width;

    public trianguloRetangulo(int height, int width){
        this.height = height;
        this.width = width;
    };

    public double calculoHipotenusa() {
        double hipotenusa= Math.sqrt((this.height *this.height) + (this.width * this.width));

        return hipotenusa;
    } ;

};




public class Prog02_poo {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Quer criar um trianguloretangulo e descobrir a hipotenusa do mesmo?");
        System.out.println("digite a altura do triangulo retangulo:");
        int Altura = read.nextInt();
        System.out.println("digite a larguura do triangulo retangulo:");
        int Largura = read.nextInt();

        trianguloRetangulo triangulo= new trianguloRetangulo(Altura, Largura);

        System.out.println("A soma dos catetos do triangulo é: "+ triangulo.calculoHipotenusa());

    }
}
