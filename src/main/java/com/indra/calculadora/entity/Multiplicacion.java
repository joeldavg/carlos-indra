package com.indra.calculadora.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table
@Data
public class Multiplicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private BigDecimal valor1;

    @Column(nullable = false)
    private BigDecimal valor2;

    private BigDecimal resultado;

    @PrePersist
    public void multiplicar() {
        this.resultado = new BigDecimal(
                valor1.multiply(valor2).doubleValue()
        );
    }

}
