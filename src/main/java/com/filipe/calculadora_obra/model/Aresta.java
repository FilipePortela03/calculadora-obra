package com.filipe.calculadora_obra.model;

public class Aresta {

    private Long id;
    private Vertice origem;
    private Vertice destino;
    private double espessura;
    private boolean possuiPorta;
    private boolean possuiJanela;

    public Aresta() {
    }

    public Aresta(Long id, Vertice origem, Vertice destino, double espessura,
                  boolean possuiPorta, boolean possuiJanela) {
        this.id = id;
        this.origem = origem;
        this.destino = destino;
        this.espessura = espessura;
        this.possuiPorta = possuiPorta;
        this.possuiJanela = possuiJanela;
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

    public boolean isPossuiJanela() {
        return possuiJanela;
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

    public void setPossuiJanela(boolean possuiJanela) {
        this.possuiJanela = possuiJanela;
    }
}