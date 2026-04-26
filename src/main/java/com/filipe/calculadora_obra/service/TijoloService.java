package com.filipe.calculadora_obra.service;

import com.filipe.calculadora_obra.dto.ArestaRequest;
import com.filipe.calculadora_obra.dto.TijoloRequest;
import org.springframework.stereotype.Service;

@Service
public class TijoloService {

    public int calcularQuantidade(TijoloRequest request) {

        double comprimentoTotal = 0;

        for (ArestaRequest aresta : request.getArestas()) {
            comprimentoTotal += aresta.getComprimento();
        }

        double areaParede = request.getAlturaParede() * comprimentoTotal;
        double areaTijolo = request.getAlturaTijolo() * request.getComprimentoTijolo();

        return (int) Math.ceil(areaParede / areaTijolo);
    }
}