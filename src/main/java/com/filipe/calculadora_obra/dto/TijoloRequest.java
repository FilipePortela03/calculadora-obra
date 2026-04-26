package com.filipe.calculadora_obra.dto;

import java.util.List;

public class TijoloRequest {

    private List<ArestaRequest> arestas;
    private double alturaParede;
    private double alturaTijolo;
    private double comprimentoTijolo;

    public List<ArestaRequest> getArestas() {
        return arestas;
    }

    public void setArestas(List<ArestaRequest> arestas) {
        this.arestas = arestas;
    }

    public double getAlturaParede() {
        return alturaParede;
    }

    public void setAlturaParede(double alturaParede) {
        this.alturaParede = alturaParede;
    }

    public double getAlturaTijolo() {
        return alturaTijolo;
    }

    public void setAlturaTijolo(double alturaTijolo) {
        this.alturaTijolo = alturaTijolo;
    }

    public double getComprimentoTijolo() {
        return comprimentoTijolo;
    }

    public void setComprimentoTijolo(double comprimentoTijolo) {
        this.comprimentoTijolo = comprimentoTijolo;
    }
}