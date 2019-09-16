package br.com.ricardo;

import java.util.Comparator;

public class OrdenaReciboPorNumero implements Comparator<Recibo> {
    @Override
    public int compare(Recibo recibo, Recibo outroRecibo) {
        return recibo.getNumero()-outroRecibo.getNumero();
    }
}
