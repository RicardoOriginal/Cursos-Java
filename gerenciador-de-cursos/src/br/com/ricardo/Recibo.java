package br.com.ricardo;

public class Recibo {
    private int size;
    private int numero;
    private long valor;

    public Recibo(int s) {
        size = s;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public long getValor() {
        return valor;
    }

    public void setValor(long valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Recibo recibo = (Recibo) o;

        if (numero != recibo.numero) return false;
        return valor == recibo.valor;
    }

    @Override
    public int hashCode() {
        int result = numero;
        result = 31 * result + (int) (valor ^ (valor >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Recibo{" +
                "numero=" + numero +
                ", valor=" + valor +
                '}';
    }
}
