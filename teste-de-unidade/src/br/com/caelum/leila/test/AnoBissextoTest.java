package br.com.caelum.leila.test;

import br.com.caelum.leila.dominio.AnoBissexto;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AnoBissextoTest {


    @Test
    public void deveRetornarAnoBissexto() {
        AnoBissexto anoBissexto = new AnoBissexto();

        assertEquals(true, anoBissexto.ehBissexto(2012));
        assertEquals(true, anoBissexto.ehBissexto(2016));
    }

    @Test
    public void naoDeveRetornarAnoBissexto() {
        AnoBissexto anoBissexto = new AnoBissexto();

        assertEquals(false, anoBissexto.ehBissexto(2011));
        assertEquals(false, anoBissexto.ehBissexto(2019));
    }

}
