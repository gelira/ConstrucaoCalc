package br.com.gedev.domain;

public class Comodo {
    private String nomeComodo;
    private double comprimento;
    private double largura;
    private TipoPiso tipoPiso;

    public Comodo(String nomeComodo, double comprimento, double largura, TipoPiso tipoPiso) {
        this.nomeComodo = nomeComodo;
        this.comprimento = comprimento;
        this.largura = largura;
        this.tipoPiso = tipoPiso;
    }

    public String getNomeComodo() {
        return nomeComodo;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public TipoPiso getTipoPiso() {
        return tipoPiso;
    }
}
