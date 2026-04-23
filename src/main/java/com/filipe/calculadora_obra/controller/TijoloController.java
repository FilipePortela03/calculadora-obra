package com.filipe.calculadora_obra.controller;

import com.filipe.calculadora_obra.dto.TijoloRequest;
import com.filipe.calculadora_obra.service.TijoloService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tijolos")
public class TijoloController {

    private final TijoloService tijoloService;

    public TijoloController(TijoloService tijoloService) {
        this.tijoloService = tijoloService;
    }

    @PostMapping("/calcular")
    public int calcular(@RequestBody TijoloRequest request) {
        return tijoloService.calcularQuantidade(request);
    }
}