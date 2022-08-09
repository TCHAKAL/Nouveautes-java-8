/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.formation.java8.optional;

import java.util.Optional;

/**
 *
 * @author tchakal.ahmed
 */
public class LangageOptional {

    public static void main(String[] args) throws NoSuchMethodException {

        //Avant java 8
//        int donnees = trouver("Hello");
//        if (donnees == -1) {
//            //traitement défaut 
//        } else {
//            //faire le boulot
//        }

        //Avec Optional
        Optional donnees = trouver("Hello");
        if(donnees.isPresent()){
            System.out.println("Data : "+donnees.get());
        }else{
            System.out.println("Absente");
        }
    }

//    private static int trouver(String str) {
//        if (str == "bonjour") {
//            return 1;
//        } else {
//            return -1;
//        }
//    }

    private static Optional trouver(String str) {
        if (str == "Hello") {
            return Optional.of(1);
        } else {
            return Optional.empty();
        }
    }
}
