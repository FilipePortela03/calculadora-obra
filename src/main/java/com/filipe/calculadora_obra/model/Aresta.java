package com.filipe.calculadora_obra.model;

public class Aresta {

    private Long id;
    private Vertice origem;
    private Vertice destino;
    private double espessura;

    private boolean possuiPorta;
    private double alturaPorta;
    private double comprimentoPorta;

    private boolean possuiJanela;
    private double alturaJanela;
    private double comprimentoJanela;

    public Aresta() {
    }

    public Aresta(Long id, Vertice origem, Vertice destino, double espessura,
                  boolean possuiPorta, double alturaPorta, double comprimentoPorta,
                  boolean possuiJanela, double alturaJanela, double comprimentoJanela) {
        this.id = id;
        this.origem = origem;
        this.destino = destino;
        this.espessura = espessura;
        this.possuiPorta = possuiPorta;
        this.alturaPorta = alturaPorta;
        this.comprimentoPorta = comprimentoPorta;
        this.possuiJanela = possuiJanela;
        this.alturaJanela = alturaJanela;
        this.comprimentoJanela = comprimentoJanela;
    }

    public Long getId() {
        return id;
    }

    public Vertice getOrigem() {
        return origem;
    }

    public Vertice getDestino() {
        return destino;
    }

    public double getEspessura() {
        return espessura;
    }

    public boolean isPossuiPorta() {
        return possuiPorta;
    }

    public double getAlturaPorta() {
        return alturaPorta;
    }

    public double getComprimentoPorta() {
        return comprimentoPorta;
    }

    public boolean isPossuiJanela() {
        return possuiJanela;
    }

    public double getAlturaJanela() {
        return alturaJanela;
    }

    public double getComprimentoJanela() {
        return comprimentoJanela;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setOrigem(Vertice origem) {
        this.origem = origem;
    }

    public void setDestino(Vertice destino) {
        this.destino = destino;
    }

    public void setEspessura(double espessura) {
        this.espessura = espessura;
    }

    public void setPossuiPorta(boolean possuiPorta) {
        this.possuiPorta = possuiPorta;
    }

    public void setAlturaPorta(double alturaPorta) {
        this.alturaPorta = alturaPorta;
    }

    public void setComprimentoPorta(double comprimentoPorta) {
        this.comprimentoPorta = comprimentoPorta;
    }

    public void setPossuiJanela(boolean possuiJanela) {
        this.possuiJanela = possuiJanela;
    }

    public void setAlturaJanela(double alturaJanela) {
        this.alturaJanela = alturaJanela;
    }

    public void setComprimentoJanela(double comprimentoJanela) {
        this.comprimentoJanela = comprimentoJanela;
    }
}