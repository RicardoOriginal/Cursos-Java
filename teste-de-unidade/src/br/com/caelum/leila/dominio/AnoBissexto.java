package br.com.caelum.leila.dominio;

import java.util.Objects;

public class AnoBissexto {
    private int ano;


    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean ehBissexto(int ano) {
        if ((ano % 4 == 0) && (ano % 100 != 0)) return true;
        else if (ano % 400 == 0) return true;
        else return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnoBissexto that = (AnoBissexto) o;
        return ano == that.ano;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ano);
    }
}
