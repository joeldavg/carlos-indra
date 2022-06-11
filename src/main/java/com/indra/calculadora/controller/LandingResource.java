package com.indra.calculadora.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LandingResource {

    @RequestMapping(value="/")
    public String swaggerUi() {
        return "redirect:/swagger-ui/";
    }
}