package br.com.ricardo.bytebank;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteBiblioteca {
	public static void main(String[] args) {
		Conta c = new ContaCorrente(133, 321);
		
		c.deposita(200.3);
		System.out.println(c.getSaldo());
	}
}
