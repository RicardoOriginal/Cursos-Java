package br.com.ricardo;

import java.util.HashSet;
import java.util.Set;

public class TesteAlunosSemAcentos {
    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();

        //1) adicione alguns alunos
        alunos.add("Ricardo Lima");
        alunos.add("Alice Lima");
        alunos.add("Letícia Lima");
        alunos.add("Ísis Lima");

        //2) imprima o tamanho da colecao
        System.out.println(alunos.size());

        //3) tente adicionar um aluno que existe
        boolean adicionou = alunos.add("Ricardo Lima");
        System.out.println("Ricardo Lima foi adicionado ao Set? " + adicionou);

        //4) imprima novamente o tamanho da colecao
        System.out.println(alunos.size());
    }
}
