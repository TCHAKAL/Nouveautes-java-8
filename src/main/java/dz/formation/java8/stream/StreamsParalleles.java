/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.formation.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author tchakal.ahmed
 */
public class StreamsParalleles {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("" + i);
        }
        //ParallelStream
        list.parallelStream().forEach(System.out::println);

        List<Facture> factures = new ArrayList<>();
        factures.add(new Facture("2022/0001", "TCHAKAL", 200));
        factures.add(new Facture("2022/0001", "OUDIA", 100));
        factures.add(new Facture("2022/0001", "KHALIL", 300));
        //parallel
        String resultat = factures.stream()
                .filter(f -> f.getTotal() > 100)
                .parallel()
                .map(Facture::getNumero)
                .collect(Collectors.joining(","));
        System.out.println(resultat);
        //sequential
        String resultat2 = factures.stream()
                .filter(f -> f.getTotal() > 100)
                .sequential()
                .map(Facture::getNumero)
                .collect(Collectors.joining(","));
        System.out.println(resultat2);
    }
}
