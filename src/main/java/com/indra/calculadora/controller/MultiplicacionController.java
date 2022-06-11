package com.indra.calculadora.controller;

import com.indra.calculadora.entity.Multiplicacion;
import com.indra.calculadora.service.MultiplicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/multiplicacion")
@CrossOrigin(value = "*")
public class MultiplicacionController {

    @Autowired
    private MultiplicacionService service;

    @PostMapping()
    public Multiplicacion multiplicar(@RequestBody Multiplicacion data) {
        return service.guardar(data);
    }

    @GetMapping
    public List<Multiplicacion> listar() {
        return service.listar();
    }

    @DeleteMapping
    public void eliminarHistorial() {
        service.eliminarHistorial();
    }

}
