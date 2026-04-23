package com.filipe.calculadora_obra.controller;

import com.filipe.calculadora_obra.model.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class PlantaController {

    @GetMapping("/planta/exemplo")
    public Planta exemplo() {

        Vertice v1 = new Vertice(1L, 0, 0);
        Vertice v2 = new Vertice(2L, 5, 0);
        Vertice v3 = new Vertice(3L, 5, 4);
        Vertice v4 = new Vertice(4L, 0, 4);

        Aresta a1 = new Aresta(1L, v1, v2, 0.15, true, false);
        Aresta a2 = new Aresta(2L, v2, v3, 0.15, false, true);
        Aresta a3 = new Aresta(3L, v3, v4, 0.15, false, false);
        Aresta a4 = new Aresta(4L, v4, v1, 0.15, false, false);

        Comodo sala = new Comodo("Sala", 5, 4, 2.8);

        return new Planta(
                Arrays.asList(v1, v2, v3, v4),
                Arrays.asList(a1, a2, a3, a4),
                Arrays.asList(sala)
        );
    }
}