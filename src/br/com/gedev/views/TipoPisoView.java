package br.com.gedev.views;

import java.util.Scanner;

public class TipoPisoView {
    public static String askTipoPiso() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tipo do piso desse cômodo: ");
        String nomeTipoPiso = sc.nextLine();

        return nomeTipoPiso;
    }
}
