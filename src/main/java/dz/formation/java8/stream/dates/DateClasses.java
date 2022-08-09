/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.formation.java8.stream.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.Chronology;
import java.time.chrono.JapaneseChronology;
import java.time.chrono.JapaneseDate;
import java.time.temporal.ChronoField;
import java.util.Locale;

/**
 *
 * @author tchakal.ahmed
 */
public class DateClasses {

    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        LocalTime lt = LocalTime.of(12, 50);
        ZoneId zid = ZoneId.of("Europe/Paris");
        ZoneId zid2 = ZoneId.of("Asia/Tokyo");
        ZonedDateTime zd = ZonedDateTime.of(ldt, zid);
        ZonedDateTime zd2 = zd.withZoneSameInstant(zid2);
        System.out.println( zd2 + " / " + zd);
        
        Period p = Period.of(1, 0, 0);
        LocalDate ld = LocalDate.now();
        LocalDate ld2 = ld.plus(p);
        System.out.println(ld+" + "+p+" = "+ld2);
        
        Chronology c = Chronology.ofLocale(Locale.FRANCE);
        JapaneseChronology c2 = JapaneseChronology.INSTANCE;
        ChronoLocalDate cld = c.dateNow();
        ChronoLocalDate cld2 = JapaneseDate.now();
        int annee = cld.get(ChronoField.YEAR);
        int annee2 = cld2.get(ChronoField.YEAR);
        System.out.println(c+" "+cld+" "+ annee);
        System.out.println(c2+" "+cld2+" "+ annee2);
    }
}
