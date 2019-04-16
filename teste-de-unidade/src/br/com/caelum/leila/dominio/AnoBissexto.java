package br.com.caelum.leila.dominio;

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
}
