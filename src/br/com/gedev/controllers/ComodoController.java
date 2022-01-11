package br.com.gedev.controllers;

import br.com.gedev.domain.Comodo;
import br.com.gedev.domain.TipoPiso;
import br.com.gedev.views.AddComodoView;

import java.util.ArrayList;
import java.util.List;

public class ComodoController {
    private List<Comodo> comodos;
    private TipoPisoController tipoPisoController;
    private double areaTotal;

    public ComodoController() {
        comodos = new ArrayList<Comodo>();
        tipoPisoController = new TipoPisoController();
        areaTotal = 0;
    }

    public List<Comodo> getComodos() {
        return comodos;
    }

    public void start() {
        do {
            createComodo();
        } while (AddComodoView.askContinuar());
    }

    private void createComodo() {
        String nomeComodo = AddComodoView.askNomeComodo();

        TipoPiso tipo = tipoPisoController.getOrCreate();

        double comprimento = AddComodoView.askComprimento();
        double largura = AddComodoView.askLargura();

        Comodo comodo = new Comodo(nomeComodo, comprimento, largura, tipo);
        areaTotal += comodo.getArea();

        comodos.add(comodo);
    }
}
