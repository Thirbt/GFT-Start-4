package Exercício_04;

import java.util.Scanner;

public class Exercício_04 {

    public static void main(String[] args) {

        int numeroSwitch, numero1, numero2, soma;
        double altura, peso, calculoIMC;
        Scanner ler = new Scanner(System.in);

        System.out.println("|Menu de Opções|");

        System.out.println("|01 - SOMA |");
        System.out.println("|02 - IMC  |");
        System.out.println("|03 - Sair |");

        System.out.println("Escolha uma opção a cima: ");
        numeroSwitch = ler.nextInt();

        switch (numeroSwitch) {

            case 1:

                System.out.println("|Digite 2 números para realizar a soma|");
                System.out.print("Numero 1: ");
                numero1 = ler.nextInt();
                System.out.println("Numero 2: ");
                numero2 = ler.nextInt();

                soma = numero1 + numero2;

                break;

            case 2:

                System.out.println("|Digite seu peso e sua altura|");
                System.out.print("Peso: ");
                peso = ler.nextDouble();
                System.out.println("Altura: ");
                altura = ler.nextDouble();

                calculoIMC = peso / (altura * altura);

                if (calculoIMC < 18.5) {

                    System.out.println("|Peso abaixo do normal!|");

                } else if (calculoIMC >= 18.5 && calculoIMC <= 25) {

                    System.out.println("|Peso normal!|");

                } else if (calculoIMC >= 25 && calculoIMC <= 30) {

                    System.out.println("|Sobre o peso!|");

                } else if (calculoIMC > 30 && calculoIMC <= 35) {

                    System.out.println("|Grau de obesidade I!|");

                }

                break;

            case 3:

                System.out.println("|Saindo do Sistema..|");

                break;

        }

    }

}
