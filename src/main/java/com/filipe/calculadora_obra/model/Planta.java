package com.filipe.calculadora_obra.model;

import java.util.List;

public class Planta {

    private List<Vertice> vertices;
    private List<Aresta> arestas;
    private List<Comodo> comodos;

    public Planta() {
    }

    public Planta(List<Vertice> vertices, List<Aresta> arestas, List<Comodo> comodos) {
        this.vertices = vertices;
        this.arestas = arestas;
        this.comodos = comodos;
    }

    public List<Vertice> getVertices() {
        return vertices;
    }

    public void setVertices(List<Vertice> vertices) {
        this.vertices = vertices;
    }

    public List<Aresta> getArestas() {
        return arestas;
    }

    public void setArestas(List<Aresta> arestas) {
        this.arestas = arestas;
    }

    public List<Comodo> getComodos() {
        return comodos;
    }

    public void setComodos(List<Comodo> comodos) {
        this.comodos = comodos;
    }
}