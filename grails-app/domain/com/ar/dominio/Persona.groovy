package com.ar.dominio

class Persona {

    String nombre
    String apellido


    static constraints = {
    }

    @Override
    String toString() {
        nombre + " " +apellido
    }
}
