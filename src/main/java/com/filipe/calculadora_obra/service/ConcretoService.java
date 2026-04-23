package com.filipe.calculadora_obra.service;

import com.filipe.calculadora_obra.dto.ConcretoRequest;
import org.springframework.stereotype.Service;

@Service
public class ConcretoService {

    public double calcularVolume(ConcretoRequest request) {
        return request.getLargura() * request.getAltura() * request.getComprimento();
    }
}