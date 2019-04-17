package br.com.caelum.leila.test;

import br.com.caelum.leila.dominio.Lance;
import br.com.caelum.leila.dominio.Leilao;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class LeilaoMatcher extends TypeSafeMatcher<Leilao> {

    private final Lance lance;

    private LeilaoMatcher(Lance lance) {
        this.lance = lance;
    }

    public void describeTo(Description description) {
        description.appendText("leilao com lance " + lance.getValor());
    }

    @Override
    protected boolean matchesSafely(Leilao item) {
        return item.getLances().contains(lance);
    }

    public static Matcher<Leilao> temUmLance(Lance lance) {
        return new LeilaoMatcher(lance);
    }
}
