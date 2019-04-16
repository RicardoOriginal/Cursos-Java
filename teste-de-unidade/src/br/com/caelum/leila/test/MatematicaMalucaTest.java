package br.com.caelum.leila.test;

import br.com.caelum.leila.dominio.MatematicaMaluca;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatematicaMalucaTest {

    @Test
    public void deveCalcularDepedendoDoValorRecebido() {

        MatematicaMaluca maluca = new MatematicaMaluca();

        assertEquals(40 * 4, maluca.contaMaluca(40));
        assertEquals(20 * 3, maluca.contaMaluca(20));
        assertEquals(9 * 2, maluca.contaMaluca(9));
    }

}
