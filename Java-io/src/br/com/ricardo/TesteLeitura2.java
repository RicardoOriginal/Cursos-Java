package br.com.ricardo;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2{

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File(Constante.URL+"contas.csv"));
        while (scanner.hasNextLine()){
            String linha = scanner.nextLine();
//            System.out.println(linha);

            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");

            String tipoConta = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int conta = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();

            String texto = String.format(formatoBrasileiro(), "%s - %04d-%08d, %20s: %10.2f", tipoConta, agencia, conta, titular, saldo);

            System.out.println(texto);

            linhaScanner.close();

//            String[] valores =  linha.split(",");
//            System.out.println(valores[3]);
        }
        scanner.close();
    }

    private static Locale formatoBrasileiro(){
        return new Locale("pt", "BR");
    }
}
