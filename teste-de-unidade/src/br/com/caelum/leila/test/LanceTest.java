package br.com.caelum.leila.test;

import br.com.caelum.leila.dominio.Lance;
import br.com.caelum.leila.dominio.Usuario;
import org.junit.Test;

public class LanceTest{

    @Test(expected=IllegalArgumentException.class)
    public void deveRecusarLancesComValorDeZero() {
        new Lance(new Usuario("John Doe"), 0);
    }

    @Test(expected=IllegalArgumentException.class)
    public void deveRecusarLancesComValorNegativo() {
        new Lance(new Usuario("John Doe"), -10);
    }
}