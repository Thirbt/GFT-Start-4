
package Exercício_02;

import java.util.Scanner;


public class Exercício_02 {

    public static void main(String[] args) {


        int numero;
        String incomoda = "incomoda";
        Scanner ler = new Scanner(System.in);

        System.out.println("|Digite quantas vezes o 'incomoda' da música elefantinha aparecerá|");
        System.out.print("Números de vezes: ");
        numero = ler.nextInt();
        System.out.println();

        for(int i = 1; i <= numero; i++){

            System.out.println(i + " elefante " + incomoda + " muita gente");

        }
    }

}

