package org.example.dia2;

import java.time.*;

public class TimeZone {

    public static void main(String[] args) {
        Instant ahora = Instant.now();
        Clock clockPA = Clock.system(ZoneId.of("America/Panama"));
        Instant ahoraPA = Instant.now(clockPA);
        Instant parseado = Instant.parse("2022-11-10T08:00:00.00Z");
        System.out.println("ahora : "+ ahora);
        System.out.println("ahoraPA : "+ahoraPA);
        System.out.println("parseado : "+parseado);


        LocalDate date = LocalDate.of(2022, 03, 07);
        System.out.println(date);

        LocalDate date1 = LocalDate.now();
        System.out.println(date1);

        LocalTime time2 = LocalTime.parse("11:00:59.759");
        LocalTime time3 = LocalTime.of(11,14,45,200);
        System.out.println("Entrada por cadena: "+ time2);
        System.out.println("Entrada por hmsn: " + time3);
    }


}
