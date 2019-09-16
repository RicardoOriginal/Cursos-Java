package br.com.ricardo;

import java.awt.desktop.SystemSleepEvent;
import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

    public static void main(String[] args){
        Set<String> alunos = new HashSet<>();
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");
        alunos.add("Mauricio Aniche");

        boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");

        System.out.println(pauloEstaMatriculado);

        System.out.println(alunos.size());

        for (String aluno: alunos) {
            System.out.println(aluno);
        }

        System.out.println(alunos);
        alunos.remove("Rodrigo Turini");
        System.out.println(alunos);

        alunos.forEach(System.out::println);
    }
}
