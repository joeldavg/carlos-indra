package com.indra.calculadora.repository;

import com.indra.calculadora.entity.Multiplicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MultiplicacionRepository extends JpaRepository<Multiplicacion, Long> {

}
