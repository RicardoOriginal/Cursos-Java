package br.com.ricardo;

import java.time.*;
import java.util.HashMap;
import java.util.Map;

public class TesteMap {
    public static void main(String[] args) {
        Instant inicio = Instant.now();

        Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);

        nomesParaIdade.keySet().forEach(nome -> {
            System.out.println(nome);
        });

        nomesParaIdade.values().forEach(idade -> {
            System.out.println(idade);
        });

        nomesParaIdade.entrySet().forEach(associacao -> {
            System.out.println(associacao);
        });

        Instant fim = Instant.now();

        Duration duration = Duration.between(inicio, fim);
        Long duracaoEmMilissegundos = duration.toMillis();
        System.out.println(duracaoEmMilissegundos);

        LocalDate homemNoEspaco = LocalDate.of(1961, Month.APRIL, 12);
        LocalDate homemNaLua = LocalDate.of(1969, Month.MAY, 25);

        Period periodo = Period.between(homemNoEspaco, homemNaLua);

        System.out.println(periodo.getMonths());

//        System.out.printf("%s anos, %s mês e %s dias",
//                periodo.getYears() , periodo.getMonths(), periodo.getDays());
        //8 anos, 1 mês e 13 dias
    }
}
