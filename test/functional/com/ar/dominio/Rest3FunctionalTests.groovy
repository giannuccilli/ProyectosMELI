package com.ar.dominio

import com.grailsrocks.functionaltest.*

class Rest3FunctionalTests extends BrowserTestCase {

    void testGetOk() {
        get('/log/devuelvo') {

        }
        assertStatus 200
        assertContentContains '"resultado":ok llego'
    }
}
