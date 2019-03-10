package br.com.caelum.leilao.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.caelum.leilao.dominio.MatematicaMaluca;

public class MatematicaMalucaTest {

	@Test
	public void deveCalcularDepedendoDoValorRecebido() {
		
		MatematicaMaluca maluca = new MatematicaMaluca();
		
		assertEquals(40*4, maluca.contaMaluca(40));
		assertEquals(20*3, maluca.contaMaluca(20));
		assertEquals(9*2, maluca.contaMaluca(9));
	}

}
