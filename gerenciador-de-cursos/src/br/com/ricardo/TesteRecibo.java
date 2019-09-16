package br.com.ricardo;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TesteRecibo {
    public static void main(String[] args){
        Recibo rec1 = new Recibo(1);
        rec1.setNumero(1);
        rec1.setValor(180);

        Recibo rec2 = new Recibo(2);
        rec2.setNumero(2);
        rec2.setValor(120);

        Recibo rec3 = new Recibo(3);
        rec3.setNumero(3);
        rec3.setValor(130);

        Set<Recibo> recibos = new TreeSet<>(new OrdenaReciboPorNumero());
        recibos.add(rec1);
        recibos.add(rec2);
        recibos.add(rec3);

        Iterator<Recibo> iterator = recibos.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next().getValor());
        }

        System.out.println(recibos);
    }
}
