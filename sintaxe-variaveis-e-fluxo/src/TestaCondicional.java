
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 18;
		int quantidadePessoas = 2;
		boolean acompanhado = quantidadePessoas>=2;
		System.out.println("valor de acompanhado = "+acompanhado);
		if (idade >= 18 && acompanhado) {
			System.out.println("seja bem vindo");
		} else {
			System.out.println("infelismente voc� nao pode entrar");
		}
	}
}
