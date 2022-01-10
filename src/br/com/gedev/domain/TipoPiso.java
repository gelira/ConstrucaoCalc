package br.com.gedev.domain;

public class TipoPiso {
    private String idTipo;
    private String nomeTipo;

    public TipoPiso(String idTipo, String nomeTipo) {
        this.idTipo = idTipo;
        this.nomeTipo = nomeTipo;
    }

    public String getNomeTipo() {
        return nomeTipo;
    }

    public String getIdTipo() {
        return idTipo;
    }
}
