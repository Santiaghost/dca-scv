package com.dca.dca.controller;

import com.dca.dca.model.Asignatura;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/asignatura")
public class AsignaturaController {
    @GetMapping("/asignaturaDePrueba")
    public String muestraModeloDeAsignaturaDePrueba(){
        Asignatura asignatura = new Asignatura(1,"Desarrollo Colaborativo de Aplicaciones", 6);
        return "Id:" + asignatura.getId() + " Nombre: " + asignatura.getNombre() + " Créditos: " + asignatura.getCreditos();
    }

}
