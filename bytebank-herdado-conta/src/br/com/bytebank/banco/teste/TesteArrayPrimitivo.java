package br.com.bytebank.banco.teste;

public class TesteArrayPrimitivo {

	public static void main(String[] args) {
		
		int[] idades = new int[5]; 
		
		for(int i = 0; i<idades.length; i++) {
			idades[i] = i * i;
		}
		
		for(int i = 0; i<idades.length; i++) {
			System.out.println(idades[i]);
		}
		
//		idades[0] = 29;
//		idades[1] = 39;
//		idades[2] = 19;
//		idades[3] = 35;
//		idades[4] = 55;
//		
//		
//		System.out.println(idades[0]);
//		System.out.println(idades.length);
		
//		int idade1 = 29;
//		int idade2 = 39;
//		int idade3 = 19;
//		int idade4 = 49;
//		int idade5 = 35;
		

	}

}
