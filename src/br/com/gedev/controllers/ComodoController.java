package br.com.gedev.controllers;

import br.com.gedev.domain.Comodo;
import br.com.gedev.domain.TipoPiso;
import br.com.gedev.views.AddComodoView;

import java.util.ArrayList;
import java.util.List;

public class ComodoController {
    private List<Comodo> comodos;

    public ComodoController() {
        comodos = new ArrayList<Comodo>();
    }

    public List<Comodo> getComodos() {
        return comodos;
    }

    public void createComodo(TipoPisoController tipoPisoController) {
        String nomeComodo = AddComodoView.askNomeComodo();

        TipoPiso tipo = tipoPisoController.getOrCreate();

        double comprimento = AddComodoView.askComprimento();
        double largura = AddComodoView.askLargura();

        comodos.add(new Comodo(nomeComodo, comprimento, largura, tipo));
    }
}
