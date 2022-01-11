package br.com.gedev.views;

import br.com.gedev.domain.Comodo;
import br.com.gedev.domain.TipoPiso;

import java.util.List;

public class RelatorioView {
    public static void relatorioPorTipoPiso(TipoPiso tipo, List<Comodo> comodos) {
        double areaTotal = 0;

        System.out.printf("Cômodos com piso de %s%n", tipo.getNomeTipo());

        for (Comodo comodo : comodos) {
            double area = comodo.getArea();
            System.out.printf("Cômodo: %s%nÁrea: %.2f m²%n%n", comodo.getNomeComodo(), area);

            areaTotal += area;
        }

        System.out.printf("Área total com piso de %s: %.2f m²%n%n", tipo.getNomeTipo(), areaTotal);
    }

    public static void relatorioAreaTotal(double areaTotal) {
        System.out.printf("A quantidade total de revestimento a ser adquirida é %.2f m²%n", areaTotal);
    }
}
