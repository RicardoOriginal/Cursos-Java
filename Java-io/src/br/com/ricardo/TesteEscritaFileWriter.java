package br.com.ricardo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

    public static void main(String[] args) throws IOException {

        long ini = System.currentTimeMillis();

        FileWriter fw = new FileWriter(Constante.URL+"TesteFileWriter2.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Primeira linha: testando metodo de criar arquivo txt");
        bw.newLine();
        bw.write("Segunda Linha: testando segunda linha de arquivo txt");

        long fim = System.currentTimeMillis();

        System.out.println("Passaram " + (fim - ini) + " milissegundos");

        bw.close();
    }
}
