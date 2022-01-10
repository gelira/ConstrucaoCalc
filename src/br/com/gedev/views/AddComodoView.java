package br.com.gedev.views;

import java.util.Scanner;

public class AddComodoView {
    public static String askNomeComodo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do cômodo: ");
        String nomeComodo = sc.nextLine();

        return nomeComodo;
    }

    public static double askComprimento() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Comprimento do cômodo (em metros): ");
        double comprimento = sc.nextDouble();

        return comprimento;
    }

    public static double askLargura() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Largura do cômodo (em metros): ");
        double largura = sc.nextDouble();

        return largura;
    }
}
