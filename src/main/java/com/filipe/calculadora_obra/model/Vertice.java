package com.filipe.calculadora_obra.model;

public class Vertice {

    private Long id;
    private double x;
    private double y;

    public Vertice() {
    }

    public Vertice(Long id, double x, double y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    public Long getId() {
        return id;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}