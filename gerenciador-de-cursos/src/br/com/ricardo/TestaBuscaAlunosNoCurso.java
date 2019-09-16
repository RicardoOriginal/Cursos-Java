package br.com.ricardo;

import java.util.HashSet;
import java.util.Set;

public class TestaBuscaAlunosNoCurso {
    public static void main(String[] args){
        Curso curso = new Curso("Dominando as coleções do java", "Ricardo");
        curso.adiciona(new Aula("Criando uma aula", 20));
        curso.adiciona(new Aula("Modelando as coleções", 24));

        Aluno a1 = new Aluno("Leticia Lima", 615651);
        Aluno a2 = new Aluno("Alice Lima", 61561);
        Aluno a3 = new Aluno("Isis Lima", 51616);
        Aluno a4 = new Aluno("Beatriz Lima", 84846);
        Aluno a5 = new Aluno("Ricardo Lima", 56564);

        curso.matricula(a1);
        curso.matricula(a2);
        curso.matricula(a3);
        curso.matricula(a4);
        curso.matricula(a5);

        int matriculaProcurada = 615651;
        System.out.printf("Quem é o aluno com a matricula %d?", matriculaProcurada);
        System.out.println();

        Aluno aluno = curso.buscaMatriculado(2);
        System.out.println(aluno);
    }
}
