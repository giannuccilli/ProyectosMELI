package com.ar.dominio

class Persona {

    String nombre
    String apellido

    static hasOne = [direccion:Direccion]

    static constraints = {
    }

    @Override
    String toString() {
        nombre + " " +apellido
    }
}
