package com.filipe.calculadora_obra.service;

import com.filipe.calculadora_obra.dto.TijoloRequest;
import org.springframework.stereotype.Service;

@Service
public class TijoloService {

    public int calcularQuantidade(TijoloRequest request) {
        double areaParede = request.getAlturaParede() * request.getComprimentoParede();
        double areaTijolo = request.getAlturaTijolo() * request.getComprimentoTijolo();

        return (int) Math.ceil(areaParede / areaTijolo);
    }
}