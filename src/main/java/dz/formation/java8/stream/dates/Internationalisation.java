/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.formation.java8.stream.dates;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.chrono.JapaneseDate;
import java.time.chrono.MinguoDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * @author tchakal.ahmed
 */
public class Internationalisation {

    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.of(1993, Month.DECEMBER, 1, 0, 0, 0);
        
        JapaneseDate jDate = JapaneseDate.from(date);
        System.out.println(jDate);
        
        MinguoDate mDate = MinguoDate.from(date);
        System.out.println(mDate);
        
        DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
        System.out.println(date.format(formatter));
        
        DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(date.format(formatter2));
        
        DateTimeFormatter formatter3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(date.format(formatter3));
    }
}
