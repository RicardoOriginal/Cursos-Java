package br.com.ricardo;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class TesteEscrita3 {

    public static void main(Constante[] args) throws IOException {

        PrintStream ps = new PrintStream(new File(Constante.URL+"printStreamFileTestNovo.txt"));

        ps.println("Primeira linha: testando metodo de criar arquivo txt");
        ps.println();
        ps.println();
        ps.println("Segunda Linha: testando segunda linha de arquivo txt");

        ps.close();
    }
}
