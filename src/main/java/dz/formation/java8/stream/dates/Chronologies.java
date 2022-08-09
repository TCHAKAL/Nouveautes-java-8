/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.formation.java8.stream.dates;

import java.time.chrono.ChronoLocalDate;
import java.time.chrono.Chronology;
import java.util.Set;

/**
 *
 * @author tchakal.ahmed
 */
public class Chronologies {

    public static void main(String[] args) {
        Set<Chronology> lesChrono = Chronology.getAvailableChronologies();
        for (Chronology c : lesChrono) {
            System.out.println(c.toString());
        }

        Chronology chrono = Chronology.of("Hijrah-umalqura");
        System.out.println(chrono);

        ChronoLocalDate cld = chrono.dateNow();
        System.out.println(cld);
        System.out.println(cld.getEra());

        System.out.println(cld.lengthOfYear());
    }

}
