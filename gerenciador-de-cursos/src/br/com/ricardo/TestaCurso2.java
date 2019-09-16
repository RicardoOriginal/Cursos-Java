package br.com.ricardo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Ricardo
 *
 */
public class TestaCurso2 {
	public static void main(String[] args) {
		Curso curso = new Curso("Dominando as coleções do java", "Ricardo");
		curso.adiciona(new Aula("Criando uma aula", 20));
		curso.adiciona(new Aula("Modelando as coleções", 24));

		List<Aula> aulasImutaveis = curso.getAulas();
		System.out.println(aulasImutaveis);

		List<Aula> aulas = new ArrayList<>(aulasImutaveis);

		Collections.sort(aulas);
		System.out.println(aulas);
		System.out.printf("Tempo total do Curso: %d Horas", curso.getTempoTotal());
		System.out.println();

	}
}
