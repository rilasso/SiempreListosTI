package org.example.dia2;

import java.time.LocalDate;
import java.util.ArrayList;

public class PracticaDeTiempo {
    public static void main(String[] args) {
        ArrayList<LocalDate> listaDeTiempos = new ArrayList<>();
        LocalDate currentTime = LocalDate.now();
        listaDeTiempos.add(currentTime);
        LocalDate ofTime = LocalDate.of(2000, 7, 19);
        listaDeTiempos.add(ofTime);
        LocalDate ofTime2 = LocalDate.of(2008, 7, 19);
        listaDeTiempos.add(ofTime2);
        LocalDate parseTime = LocalDate.parse("2005-07-19");
        listaDeTiempos.add(parseTime);

        LocalDate aux = listaDeTiempos.get(1);

        for (LocalDate time:listaDeTiempos) {
            if(aux.isBefore(time)){
                aux = time;
            }
        }
        System.out.println(aux);
    }
}
