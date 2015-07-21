package com.ar.dominio

class RestController {

    def int contador = 0;

    def incrementarContador() {

        contador++

        if ((contador%2)==0) {
            // Si es par info
            println "1"
            log.info "Mensaje de INFO contador: ${contador}"
        } else {
            // Si es impar warn
            println "2"
            log.warn "Mensaje de WARN contador: ${contador}"

        }

        if (contador==0 || (contador%5)==0) {
            // Multiplo de 5 error
            log.error "Mensaje de ERROR contador: ${contador}"
        }

        render "ok" as String
    }
}
