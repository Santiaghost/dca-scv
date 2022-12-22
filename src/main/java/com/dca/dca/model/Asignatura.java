package com.dca.dca.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Asignatura {
    private int id;
    private String nombre;
    private int creditos;

    public Asignatura(int id, String nombre, int creditos){
        this.id=id;
        this.nombre=nombre;
        this.creditos=creditos;
    }
}
