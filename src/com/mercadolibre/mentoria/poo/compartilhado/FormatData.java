package com.mercadolibre.mentoria.poo.compartilhado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatData {

    public static void formatarData(LocalDate data) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = data.format(formatter);

        System.out.println("data formatada: " + dataFormatada);
    }
}
