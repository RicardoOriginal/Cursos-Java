package br.com.ricardo;

import java.io.*;

public class TesteCopiarArquivo {

    public static void main(String[] args) throws IOException {

        InputStream fis = new FileInputStream(Constante.URL+"lorem2.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        OutputStream fos = new FileOutputStream(Constante.URL+"lorem10.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String linha = br.readLine();

        while (linha != null && !linha.isEmpty()) {
            bw.write(linha);
            bw.newLine();
            linha = br.readLine();
        }

        br.close();
        bw.close();
    }
}
