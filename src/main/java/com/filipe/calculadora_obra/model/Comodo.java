package com.filipe.calculadora_obra.model;

public class Comodo {

    private String nome;
    private double largura;
    private double comprimento;
    private double altura;

    public Comodo() {
    }

    public Comodo(String nome, double largura, double comprimento, double altura) {
        this.nome = nome;
        this.largura = largura;
        this.comprimento = comprimento;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public double getLargura() {
        return largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}