package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardadorReferencias {

	public static void main(String[] args) {

		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(22, 33);
		guardador.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(55, 88);
		guardador.adiciona(cc2);
		
		System.out.println("Quantidade de elementos"+guardador.getQuantidadeDeElementos());
		
//		Conta ref = guardador.getReferencia(0);
	}

}
