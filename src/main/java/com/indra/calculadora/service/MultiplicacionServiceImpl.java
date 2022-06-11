package com.indra.calculadora.service;

import com.indra.calculadora.entity.Multiplicacion;
import com.indra.calculadora.repository.MultiplicacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MultiplicacionServiceImpl implements MultiplicacionService {

    @Autowired
    private MultiplicacionRepository repository;

    @Override
    public Multiplicacion guardar(Multiplicacion data) {
        return repository.save(data);
    }

    @Override
    public List<Multiplicacion> listar() {
        return repository.findAll();
    }

    @Override
    public void eliminarHistorial() {
        repository.deleteAll();
    }
}
