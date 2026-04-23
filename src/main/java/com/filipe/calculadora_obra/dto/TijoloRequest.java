package com.filipe.calculadora_obra.dto;

public class TijoloRequest {

    private double alturaParede;
    private double comprimentoParede;
    private double alturaTijolo;
    private double comprimentoTijolo;

    public double getAlturaParede() {
        return alturaParede;
    }

    public void setAlturaParede(double alturaParede) {
        this.alturaParede = alturaParede;
    }

    public double getComprimentoParede() {
        return comprimentoParede;
    }

    public void setComprimentoParede(double comprimentoParede) {
        this.comprimentoParede = comprimentoParede;
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