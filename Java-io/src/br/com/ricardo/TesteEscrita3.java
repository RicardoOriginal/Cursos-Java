package br.com.ricardo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscrita2 {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("TesteFileWriter2.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Primeira linha: testando metodo de criar arquivo txt");
        bw.newLine();
        bw.write("Segunda Linha: testando segunda linha de arquivo txt");

        bw.close();
    }
}
