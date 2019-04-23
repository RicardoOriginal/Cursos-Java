package br.com.ricardo;

import java.io.*;

public class TesteEscrita {

    public static void main(String[] args) throws IOException {

        OutputStream fos = new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Primeira linha: testando metodo de criar arquivo txt");
//        bw.newLine();
        bw.newLine();
        bw.write("Segunda Linha: testando segunda linha de arquivo txt");

        bw.close();

    }
}
