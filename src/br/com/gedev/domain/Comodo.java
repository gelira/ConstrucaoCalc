package br.com.gedev.domain;

public class Comodo {
    private String nomeComodo;
    private double comprimento;
    private double largura;
    private double area;
    private TipoPiso tipoPiso;

    public Comodo(String nomeComodo, double comprimento, double largura, TipoPiso tipoPiso) {
        this.nomeComodo = nomeComodo;
        this.comprimento = comprimento;
        this.largura = largura;
        this.tipoPiso = tipoPiso;

        area = comprimento * largura;
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

    public double getArea() {
        return area;
    }

    public TipoPiso getTipoPiso() {
        return tipoPiso;
    }
}
