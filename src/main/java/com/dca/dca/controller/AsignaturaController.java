package com.dca.dca.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/asignatura")
public class AsignaturaController {
    @GetMapping("/asignaturaDePrueba")
    public String muestraModeloDeAsignaturaDePrueba(){

        return "prueba";
    }

}
