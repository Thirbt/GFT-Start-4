
package Exercício_01;

import java.util.Scanner;

public class Exercício_01 {

    public static void main(String[] args) {

        int senha;
        Scanner ler = new Scanner(System.in);

        // Senha correta = 2018

        System.out.println("|Digite uma senha em formato de ano|");

        System.out.print("Senha: ");
        senha = ler.nextInt();

        if(senha != 2018){

            System.out.println("|Senha Inválida|");
        }

        while (senha != 2018){
            System.out.print("Senha: ");
            senha = ler.nextInt();

            System.out.println("|Senha Inválida|");

        }

        System.out.println("|Acesso Garantido|");




    }

}
