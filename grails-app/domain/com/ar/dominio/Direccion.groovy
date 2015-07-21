package com.ar.dominio

class Direccion {

    String calle
    String localidad
    int numero
    String codigoPostal

    static constraints = {
    }

    @Override
    String toString() {
        calle +" "+numero+" "+localidad+" "+codigoPostal
    }
}
