package com.ar.dominio

class Empleado extends Persona {

    String legajo

    static constraints = {
    }

    @Override
    String toString() {
        return super.toString() + getLegajo()
    }
}
