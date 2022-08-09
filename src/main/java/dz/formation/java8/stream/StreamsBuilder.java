/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.formation.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 *
 * @author tchakal.ahmed
 */
public class StreamsBuilder {

    public static void main(String[] args) {
        //Stream
        List<String> listNoms = new ArrayList<>();
        listNoms.add("TCHAKAL");
        listNoms.add("OUDIA");
        listNoms.add("KHALIL");
        Stream s = listNoms.stream();
        s.forEach(System.out::println);
        
        //Stream Builder
        Stream.Builder b = Stream.builder();
        b.accept("TCHAKAL");
        b.accept("OUDIA");
        b.accept("KHALIL");
        b.build().forEach(System.out::println);

        //DoubleStream Builder
        DoubleStream.Builder db = DoubleStream.builder();
        db.accept(2.4);
        db.accept(4.2);
        db.build().forEach(System.out::println);
    }
}
