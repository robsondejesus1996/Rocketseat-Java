package poo.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateSimple {

    public static void main(String[] args) {
//        LocalDate meuAniversario = LocalDate.of(1996, 5, 8);
//
//        System.out.println(meuAniversario);

//        String stringDataBr = "17/01/2023";
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//
//        LocalDate dataConcreta = LocalDate.parse(stringDataBr, formatter);
//
//        System.out.println(dataConcreta);

        LocalDate aniversarioIzabelly = LocalDate.of(2023, 4, 5);
        LocalDate dataQueTera15anos = aniversarioIzabelly.plusYears(15);
        LocalDate novaData = aniversarioIzabelly.minusDays(7);

        System.out.println(dataQueTera15anos);
        System.out.println(novaData);


        LocalDate data1 = LocalDate.of(2025, 3, 4);
        LocalDate data2 = LocalDate.of(2024, 4, 3);


        System.out.println(data2.isAfter(data1));
        System.out.println(data2.isBefore(data1));
        System.out.println(data2.isEqual(data1));
    }
}
