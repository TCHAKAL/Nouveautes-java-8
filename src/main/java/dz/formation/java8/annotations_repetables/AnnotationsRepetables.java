/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.formation.java8.annotations_repetables;

/**
 *
 * @author tchakal.ahmed
 */
public class AnnotationsRepetables {
    
    public static void main(String[] args){
        Voiture voiture = new Voiture();
        System.out.println(voiture.getClass().getAnnotations());
    }
    
}
