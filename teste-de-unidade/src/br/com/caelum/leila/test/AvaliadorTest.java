package br.com.caelum.leila.test;

import br.com.caelum.leila.dominio.Avaliador;
import br.com.caelum.leila.dominio.Lance;
import br.com.caelum.leila.dominio.Leilao;
import br.com.caelum.leila.dominio.Usuario;
import br.com.caelum.leila.testDataBuilder.CriadorDeLeilao;
import org.hamcrest.CoreMatchers;
import org.junit.*;

import java.util.List;

import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AvaliadorTest {

    private Avaliador leiloeiro;
    private Usuario joao;
    private Usuario jose;
    private Usuario maria;

    @BeforeClass
    public static void testandoBeforeClass() {
        System.out.println("before class");
    }

    @AfterClass
    public static void testandoAfterClass() {
        System.out.println("after class");
    }

    @Before
    public void setup() {
        this.leiloeiro = new Avaliador();
        this.joao = new Usuario("João");
        this.jose = new Usuario("José");
        this.maria = new Usuario("Maria");

        System.out.println("inicializando teste!");
    }

    @After
    public void finaliza() {
        System.out.println("fim");
    }

    @Test(expected = RuntimeException.class)
    public void naoDeveAvaliarLeiloesSemNemUmLance() {
        Leilao leilao = new CriadorDeLeilao().para("Playstation 3 Novo").constroi();
        leiloeiro.avalia(leilao);
    }

    @Test
    public void deveRetornarLancesMaiorEMenorValor() {

        Leilao leilao = new CriadorDeLeilao().para("Playstation 3 Novo")
                .lance(maria, 250.0)
                .lance(joao, 300.0)
                .lance(maria, 400.0)
                .constroi();

        leiloeiro.avalia(leilao);

        double maiorEsperado = 400;
        double menorEsperado = 250;
        double mediaEsperada = (250.0 + 300.0 + 400.0) / 3;

        assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.0001);
        assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.0001);
        assertEquals(mediaEsperada, leiloeiro.getMediaLance(), 0.0001);
    }

    @Test
    public void deveEntenderLancesEmOrdemCrescenteComOutrosValores() {

        Leilao leilao = new CriadorDeLeilao().para("Playstation 3 Novo")
                .lance(maria, 1000.0)
                .lance(joao, 2000.0)
                .lance(jose, 3000.0)
                .constroi();

        leiloeiro.avalia(leilao);

        assertEquals(3000, leiloeiro.getMaiorLance(), 0.0001);
        assertEquals(1000, leiloeiro.getMenorLance(), 0.0001);
    }

    @Test
    public void deveEntenderLeilaoComApenasUmLance() {

        Leilao leilao = new CriadorDeLeilao().para("Playstation 3 Novo")
                .lance(joao, 1000.0)
                .constroi();

        leiloeiro.avalia(leilao);

        assertEquals(1000, leiloeiro.getMaiorLance(), 0.0001);
        assertEquals(1000, leiloeiro.getMenorLance(), 0.0001);
    }

    @Test
    public void deveEncontrarOsTresMaioresLances() {

        Leilao leilao = new CriadorDeLeilao().para("Playstation 3 Novo")
                .lance(joao, 100.0)
                .lance(maria, 200.0)
                .lance(joao, 300.0)
                .lance(maria, 400.0)
                .constroi();

        leiloeiro.avalia(leilao);

        List<Lance> maiores = leiloeiro.getTresMaiores();

        assertThat(maiores, hasItems(
                new Lance(maria, 400),
                new Lance(joao, 300),
                new Lance(maria, 200)
        ));
    }

    @Test
    public void deveEncontrarOsTresMaioresLancesCurso() {
        Leilao leilao = new CriadorDeLeilao().para("Playstation 3 Novo")
                .lance(joao, 200.0)
                .lance(maria, 450.0)
                .lance(joao, 120.0)
                .lance(maria, 700.0)
                .lance(joao, 630.0)
                .lance(maria, 230.0)
                .constroi();

        leiloeiro.avalia(leilao);

        assertEquals(120, leiloeiro.getMenorLance(), 0.00001);
        assertEquals(700, leiloeiro.getMaiorLance(), 0.00001);

    }

    @Test
    public void deveVerificarSaidaEmOrdemDecrescente() {
        Leilao leilao = new CriadorDeLeilao().para("Playstation 3 Novo")
                .lance(joao, 400.0)
                .lance(maria, 300.0)
                .lance(joao, 200.0)
                .lance(maria, 100.0)
                .constroi();

        leiloeiro.avalia(leilao);

        assertEquals(400.0, leiloeiro.getMaiorLance(), 0.0001);
        assertEquals(100.0, leiloeiro.getMenorLance(), 0.0001);

    }

    @Test
    public void deveEncontrarOsTresMaiores() {
        Leilao leilao = new CriadorDeLeilao().para("Playstation 3 Novo")
                .lance(joao, 500.0)
                .lance(jose, 300.0)
                .lance(joao, 200.0)
                .lance(maria, 100.0)
                .lance(maria, 400.0)
                .constroi();

        leiloeiro.avalia(leilao);

        List<Lance> maiores = leiloeiro.getTresMaiores();

        assertEquals(3, maiores.size());
        assertEquals(500, maiores.get(0).getValor(), 0.00001);
        assertEquals(300, maiores.get(1).getValor(), 0.00001);
        assertEquals(200, maiores.get(2).getValor(), 0.00001);

    }

    @Test
    public void deveEncontrarOsDoisMaiores() {
        Leilao leilao = new CriadorDeLeilao().para("Playstation 3 Novo")
                .lance(joao, 400.0)
                .lance(maria, 300.0)
                .constroi();

        leiloeiro.avalia(leilao);

        List<Lance> maiores = leiloeiro.getTresMaiores();

        assertEquals(2, maiores.size());
        assertEquals(400, maiores.get(0).getValor(), 0.00001);
        assertEquals(300, maiores.get(1).getValor(), 0.00001);
    }

    @Test
    public void deveEntenderLancesEmOrdemCrescente() {

        Leilao leilao = new CriadorDeLeilao()
                .para("Playstation 3 Novo")
                .lance(joao, 250)
                .lance(jose, 300)
                .lance(maria, 400)
                .constroi();

        leiloeiro.avalia(leilao);

        assertThat(leiloeiro.getMenorLance(), equalTo(250.0));
        assertEquals(400.0, leiloeiro.getMaiorLance(), 0.00001);
    }
}
