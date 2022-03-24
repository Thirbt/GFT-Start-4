package Exercício_03;

import java.util.Scanner;

public class Exercício_03 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int idade, p1 = 0, p2 = 0, p3 = 0, p4 = 0;
        double soma1, soma2, soma3, soma4;
        double peso1a10, peso11a20, peso21a31, peso31;
        double resultado1 = 0, resultado2 = 0, resultado3 = 0, resultado4 = 0;

        System.out.println("|Programa que recebe a idade e peso para calcular a média|");

        for (int i = 1; i <= 10; i++) {

            System.out.println("|Digite sua Idade|");
            System.out.print("Idade: ");
            idade = ler.nextInt();

            if (idade >= 1 && idade <= 10) {
                p1++;
                System.out.println("|Digite seu Peso|");
                System.out.print("Peso: ");
                peso1a10 = ler.nextDouble();

                soma1 = (peso1a10 + peso1a10) / p1;

            } else if (idade >= 11 && idade <= 20) {

                p2++;

                System.out.println("|Digite o peso|");
                System.out.print("Peso: ");
                peso11a20 = ler.nextDouble();

                soma2 = peso11a20 + peso11a20;

                resultado2 = soma2 / p2;

            } else if (idade >= 21 && idade <= 31) {

                p3++;

                System.out.println("|Digite o peso|");
                System.out.print("Peso: ");
                peso21a31 = ler.nextDouble();

                soma3 = peso21a31 + peso21a31;

                resultado3 = soma3 / p3;

            } else if (idade > 31) {
                p4++;

                System.out.println("|Digite o peso|");
                System.out.print("Peso: ");
                peso31 = ler.nextDouble();

                soma4 = peso31 + peso31;

                resultado4 = soma4 / p4;

            } else {
                System.out.println("|ERRO|");
                System.out.println("|Você Inseriu uma idade negativa|");
            }

            if (i == 10) {
                System.out.println();
                System.out.println("|Resultado dos calculos|");
                System.out.println();
                System.out.println("A média dos pesos de pessoas entre 1 a 10 anos foi: " + resultado1);
                System.out.println("A média dos pesos de pessoas entre 11 a 20 anos foi: " + resultado2);
                System.out.println("A média dos pesos de pessoas entre 21 a 31 anos foi: " + resultado3);
                System.out.println("A média dos pesos de pessoas com mais de 31 anos foi: " + resultado4);
            }

        }

    }

}
