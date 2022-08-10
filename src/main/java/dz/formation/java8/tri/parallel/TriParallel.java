/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.formation.java8.tri.parallel;

import java.util.Arrays;

/**
 *
 * @author tchakal.ahmed
 */
public class TriParallel {

    public static void main(String[] args) {
        int MAX=1000;
        int[] donnees = new int[MAX];
        for (int i = 0; i < MAX; i++) {
            donnees[i] = (int) (Math.random() * 100);
        }
//        System.out.println("Avant le tri");
//        for (int i = 0; i < MAX; i++) {
//            System.out.println(donnees[i]);
//        }
        triSequenciel(donnees, MAX);
        triParallel(donnees, MAX);
//        System.out.println("Après le tri");
//        for (int i = 0; i < MAX; i++) {
//            System.out.println(donnees[i]);
//        }
    }

    static void triSequenciel(int[] donnees, int MAX) {
        long debut = System.currentTimeMillis();
        Arrays.sort(donnees);
        long fin = System.currentTimeMillis();
        System.out.println("Trié sequenciel en : " + (fin - debut) + " Millisecondes");
    }

    static void triParallel(int[] donnees, int MAX) {
        long debut = System.currentTimeMillis();
        Arrays.parallelSort(donnees);
        long fin = System.currentTimeMillis();
        System.out.println("Trié parallel en : " + (fin - debut) + " Millisecondes");
    }
}
