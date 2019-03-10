package br.com.caelum.leilao.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.caelum.leilao.dominio.AnoBissexto;

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
