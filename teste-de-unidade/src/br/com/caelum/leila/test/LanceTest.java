package br.com.caelum.leila.test;

import br.com.caelum.leila.dominio.Lance;
import br.com.caelum.leila.dominio.Leilao;
import br.com.caelum.leila.dominio.Usuario;
import br.com.caelum.leila.testDataBuilder.CriadorDeLeilao;
import org.junit.Test;

import static br.com.caelum.leila.test.LeilaoMatcher.temUmLance;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;

public class LanceTest{

    @Test(expected=IllegalArgumentException.class)
    public void deveRecusarLancesComValorDeZero() {
        new Lance(new Usuario("John Doe"), 0);
    }

    @Test(expected=IllegalArgumentException.class)
    public void deveRecusarLancesComValorNegativo() {
        new Lance(new Usuario("John Doe"), -10);
    }

    @Test
    public void deveTerPeloMenosUmLance(){
        Leilao leilao = new CriadorDeLeilao().para("Macbook Pro 15").constroi();
        assertEquals(0, leilao.getLances().size());

        Lance lance = new Lance(new Usuario("Steve Jobs"), 2000);
        leilao.propoe(lance);

        assertThat(leilao.getLances().size(), equalTo(1));
        assertThat(leilao, temUmLance(lance));
    }
}