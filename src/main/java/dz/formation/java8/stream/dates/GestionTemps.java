/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.formation.java8.stream.dates;

import java.time.LocalDate;

/**
 *
 * @author tchakal.ahmed
 */
public class GestionTemps {
    public static void main(String[] args) {
        Facture facture = new Facture("2022/0001");
        System.out.println(facture);
        System.out.println("rest Avant echaance "+facture.restAvantechaance()+" Jours");
        System.out.println("rest Avant echaance "+facture.restAvantechaance2()+" Jours");
    }
}
