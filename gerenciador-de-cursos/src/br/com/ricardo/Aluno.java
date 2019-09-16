package br.com.ricardo;

import java.util.Objects;

public class Aluno {
    private String nome;
    private int numeroMatricula;

    public Aluno(String nome, int numeroMatricula) {
        if(nome == null){
            throw new NullPointerException("Nome não pode ser nulo!");
        }
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Aluno aluno = (Aluno) o;

        if (numeroMatricula != aluno.numeroMatricula) return false;
        return nome.equals(aluno.nome);
    }

    @Override
    public int hashCode() {
        int result = nome.hashCode();
        result = 31 * result + numeroMatricula;
        return result;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", numeroMatricula=" + numeroMatricula +
                '}';
    }
}
