package com.filipe.calculadora_obra.controller;

import com.filipe.calculadora_obra.dto.ConcretoRequest;
import com.filipe.calculadora_obra.service.ConcretoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/concreto")
public class ConcretoController {

    private final ConcretoService concretoService;

    public ConcretoController(ConcretoService concretoService) {
        this.concretoService = concretoService;
    }

    @PostMapping("/calcular")
    public double calcular(@RequestBody ConcretoRequest request) {
        return concretoService.calcularVolume(request);
    }
}