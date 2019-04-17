package br.com.caelum.leila.test;

import br.com.caelum.leila.dominio.AnoBissexto;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnoBissextoTest {

    @Test
    public void deveRetornarAnoBissexto() {
        AnoBissexto anoBissexto = new AnoBissexto();

        assertTrue(anoBissexto.ehBissexto(2012));
        assertTrue(anoBissexto.ehBissexto(2016));
    }

    @Test
    public void naoDeveRetornarAnoBissexto() {
        AnoBissexto anoBissexto = new AnoBissexto();

        assertFalse(anoBissexto.ehBissexto(2011));
        assertFalse(anoBissexto.ehBissexto(2019));
    }
}
