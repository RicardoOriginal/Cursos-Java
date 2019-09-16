package br.com.ricardo;

import java.util.*;

/**
 * @author Ricardo
 *
 */
public class Curso {
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaparaAluno = new HashMap<>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public String getInstrutor() {
		return instrutor;
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal(){
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	public void matricula(Aluno aluno) {
	    this.alunos.add(aluno);
	    this.matriculaparaAluno.put(aluno.getNumeroMatricula(), aluno);
	}

	public Set<Aluno> getAlunos(){
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatriculado(int numero) {
	    if(!matriculaparaAluno.containsKey(numero))
	        throw new NoSuchElementException();
		return matriculaparaAluno.get(numero);
	}

	@Override
	public String toString() {
		return "Curso{" +
				"nome='" + nome + '\'' +
				", instrutor='" + instrutor + '\'' +
				", aulas=" + aulas +
				", alunos=" + alunos +
				'}';
	}
}
