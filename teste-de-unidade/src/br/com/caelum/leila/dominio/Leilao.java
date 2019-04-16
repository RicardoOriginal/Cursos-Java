package br.com.caelum.leila.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leilao {

    private String descricao;
    private List<Lance> lances;

    public Leilao(String descricao) {
        this.descricao = descricao;
        this.lances = new ArrayList<>();
    }


    public void propoe(Lance lance) {
        if (lances.isEmpty() || podeDarLance(lance.getUsuario())) {
            lances.add(lance);
        }
    }

    private boolean podeDarLance(Usuario usuario) {
        return !ultimoLanceDado().getUsuario().equals(usuario) && qtdLancesDo(usuario) < 5;
    }

    private int qtdLancesDo(Usuario usuario) {
        int total = 0;
        for (Lance l : lances) {
            if (l.getUsuario().equals(usuario)) total++;
        }
        return total;
    }

    private Lance ultimoLanceDado() {
        return lances.get(lances.size() - 1);
    }

    private Lance ultimoLanceDo(Usuario usuario) {
        Lance ultimo = null;
        for (Lance lance : lances) {
            if (lance.getUsuario().equals(usuario)) ultimo = lance;
        }

        return ultimo;
    }

    public void dobraLance(Usuario usuario) {
        Lance ultimoLance = ultimoLanceDo(usuario);
        if (ultimoLance != null) {
            propoe(new Lance(usuario, ultimoLance.getValor() * 2));
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public List<Lance> getLances() {
        return Collections.unmodifiableList(lances);
    }
}
