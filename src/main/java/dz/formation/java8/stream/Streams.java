/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.formation.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 *
 * @author tchakal.ahmed
 */
public class Streams {

    public static void main(String[] args) {
        List<String> listNoms = new ArrayList<>();
        listNoms.add("TCHAKAL");
        listNoms.add("OUDIA");
        listNoms.add("KHALIL");
        //Filtre
        listNoms.stream()
                .filter(nom -> nom.length() < 7)
                .forEach(System.out::println);
        
        //Map 
        Stream.of("TCHAKAL", "OUDIA", "KHALIL")
                .filter(nom -> nom.length() < 7)
                .map(String::toLowerCase)
                .forEach(System.out::println);
       
        //Reduce
        Optional somme = Stream.of("TCHAKAL", "OUDIA", "KHALIL")
                .filter(nom -> nom.length() < 7)
                .map(s -> s.length())
                .reduce((l1, l2) -> l1 + l2);
        System.out.println("Somme des longueur de chaine de caracteres < 7 est :" + somme.get());
       
       
    }

}
