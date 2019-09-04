package br.com.ricardo;

/**
 * @author Ricardo
 *
 */
public class TestaCurso2 {
	public static void main(String[] args) {
		Curso curso = new Curso("Dominando as coleções do java", "Ricardo");
		curso.adiciona(new Aula("aula 1", 12));
		curso.adiciona(new Aula("aula 2", 15));
		System.out.println(curso);
	}
}
