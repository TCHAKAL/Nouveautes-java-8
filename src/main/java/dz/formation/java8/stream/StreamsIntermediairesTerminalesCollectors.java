/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.formation.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *
 * @author tchakal.ahmed
 */
public class StreamsIntermediairesTerminalesCollectors {

    public static void main(String[] args) {
        //Stream
        List<Facture> factures = new ArrayList<>();
        factures.add(new Facture("2022/0001", "TCHAKAL", 700000));
        factures.add(new Facture("2022/0001", "OUDIA", 800000));
        //Intermédiaire
        factures.stream().forEach(s -> System.err.println(s));
        //Intermidiaire + terminale
        factures.stream().filter(f -> f.getTotal() > 700000).forEach(System.out::println);
        factures.stream().map(f -> f.getTotal()).forEach(System.out::println);
        Optional resultat= factures.stream().map(f -> f.getTotal()).reduce(Double::sum);
        System.out.println("Total : "+resultat);
        //Collectors
        List<String> listClient = factures.stream()
                .map(f->f.getClient())
                .collect(Collectors.toList());
        listClient.forEach(System.out::println);
    }
}
