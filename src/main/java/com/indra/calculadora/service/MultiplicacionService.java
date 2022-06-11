package com.indra.calculadora.service;

import com.indra.calculadora.entity.Multiplicacion;

import java.util.List;

public interface MultiplicacionService {

    Multiplicacion guardar(Multiplicacion data);

    List<Multiplicacion> listar();

    void eliminarHistorial();

}
