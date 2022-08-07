/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.formation.java8.reference_methode;

import java.util.Arrays;

/**
 *
 * @author tchakal.ahmed
 */
public class TestReferenceMethode {

    public static void main(String[] args) {
        Personne[] personnes = new Personne[2];

        personnes[0] = new Personne("TCHAKAL", 29);
        personnes[1] = new Personne("OUDIA", 28);

        System.out.println(personnes[0]);
        System.out.println(personnes[1]);

        Arrays.sort(personnes, Personne::TrierParAge);
        System.out.println(personnes[0]);
        System.out.println(personnes[1]);

    }

}
