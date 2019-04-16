package br.com.caelum.leila.dominio;

import java.util.ArrayList;
import java.util.List;

public class FiltroDeLances {

    public List<br.com.caelum.leila.dominio.Lance> filtra(List<br.com.caelum.leila.dominio.Lance> lances) {
        ArrayList<br.com.caelum.leila.dominio.Lance> resultado = new ArrayList<br.com.caelum.leila.dominio.Lance>();

        for (br.com.caelum.leila.dominio.Lance lance : lances) {
            if (lance.getValor() > 1000 && lance.getValor() < 3000)
                resultado.add(lance);
            else if (lance.getValor() > 500 && lance.getValor() < 700)
                resultado.add(lance);
            else if (lance.getValor() > 5000)
                resultado.add(lance);
        }

        return resultado;

    }
}
