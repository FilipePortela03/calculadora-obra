package com.filipe.calculadora_obra.service;

import com.filipe.calculadora_obra.dto.ArestaRequest;
import com.filipe.calculadora_obra.dto.ConcretoRequest;
import org.springframework.stereotype.Service;

@Service
public class ConcretoService {

    public double calcularVolume(ConcretoRequest request) {

        double comprimentoTotal = 0;

        for (ArestaRequest aresta : request.getArestas()) {
            comprimentoTotal += aresta.getComprimento();
        }

        return request.getLargura() * request.getAltura() * comprimentoTotal;
    }
}