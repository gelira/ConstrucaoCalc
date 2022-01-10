package br.com.gedev.controllers;

import br.com.gedev.domain.TipoPiso;
import br.com.gedev.views.TipoPisoView;

import java.util.ArrayList;
import java.util.List;

public class TipoPisoController {
    private List<TipoPiso> tiposPiso;

    public TipoPisoController() {
        tiposPiso = new ArrayList<TipoPiso>();
    }

    public List<TipoPiso> getTiposPiso() {
        return tiposPiso;
    }

    public TipoPiso getOrCreate() {
        String nomeTipoPiso = TipoPisoView.askTipoPiso();

        TipoPiso tipo = searchTipoPiso(nomeTipoPiso);

        if (tipo == null) {
            tipo = createTipoPiso(nomeTipoPiso);
        }

        return tipo;
    }

    private TipoPiso searchTipoPiso(String nomeTipoPiso) {
        String idTipoPiso = generateIdTipoPiso(nomeTipoPiso);

        for (TipoPiso tipo : tiposPiso) {
            if (tipo.getIdTipo().equals(idTipoPiso)) {
                return tipo;
            }
        }

        return null;
    }

    private TipoPiso createTipoPiso(String nomeTipoPiso) {
        String idTipoPiso = generateIdTipoPiso(nomeTipoPiso);

        TipoPiso tipo = new TipoPiso(idTipoPiso, nomeTipoPiso);
        tiposPiso.add(tipo);

        return tipo;
    }

    private String generateIdTipoPiso(String nomeTipoPiso) {
        return nomeTipoPiso.toLowerCase().trim();
    }
}
