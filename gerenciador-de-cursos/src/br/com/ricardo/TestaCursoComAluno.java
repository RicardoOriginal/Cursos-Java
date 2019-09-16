package br.com.ricardo;

import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class TestaCursoComAluno {
    public static void main(String[] args){
        Curso curso = new Curso("Dominando as coleções do java", "Ricardo");
        curso.adiciona(new Aula("Trabalhando com ArrayList", 15));
        curso.adiciona(new Aula("Criando uma aula", 20));
        curso.adiciona(new Aula("Modelando as coleções", 24));

        Aluno a1 = new Aluno("Leticia Lima", 615651);
        Aluno a2 = new Aluno("Alice Lima", 61561);
        Aluno a3 = new Aluno("Isis Lima", 51616);
        Aluno a4 = new Aluno("Beatriz Lima", 84846);
        Aluno a5 = new Aluno("Ricardo Lima", 56564);
        Aluno a6 = new Aluno("Juliano Lima", 541151);

        curso.matricula(a1);
        curso.matricula(a2);
        curso.matricula(a3);
        curso.matricula(a4);

        System.out.println("Todos os alunos matriculados: ");
        for (Aluno aluno : curso.getAlunos()) {
            System.out.println(aluno);
        }

        Aluno alunoPesquisado = a1;
        String resposta = "O aluno(a) %s%s está matriculado";
        String complemento;
        if (curso.estaMatriculado(alunoPesquisado)){
            complemento = "";
        }else {
            complemento = " não";
        }
        System.out.printf(resposta, alunoPesquisado.getNome(), complemento);
        System.out.println();

        Aluno ricardo = new Aluno("Ricardo Lima", 454454);
        System.out.println("O a5 é equals ao Ricardo");
        System.out.println(a5.equals(ricardo));

        System.out.println(a5.hashCode() == ricardo.hashCode());


        Set<Aluno> alunos = curso.getAlunos();
        Iterator<Aluno> iterador = alunos.iterator();
        iterador.hasNext();

        while (iterador.hasNext()){
            Aluno proximo = iterador.next();
            System.out.println(proximo);
        }

    }
}
