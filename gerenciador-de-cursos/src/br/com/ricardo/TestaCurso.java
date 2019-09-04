package br.com.ricardo;

import java.util.List;

/**
 * @author Ricardo
 *
 */
public class TestaCurso {
	public static void main(String[] args) {
		Curso curso = new Curso("Dominando as coleções do java", "Ricardo");
		curso.adiciona(new Aula("aula 1", 12));
		curso.adiciona(new Aula("aula 2", 15));
		curso.adiciona(new Aula("aula 3", 30));
		
		List<Aula> aulas = curso.getAulas();
		System.out.println(aulas);
	}
}
