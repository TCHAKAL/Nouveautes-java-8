/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.formation.java8.concurrents;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author tchakal.ahmed
 */
public class Concurrence {
    
    private static Map<String,Integer> compteur = Collections.synchronizedMap(new HashMap<String,Integer>(1990));
    public static void comptageIncrement(String str){
        Integer cp = compteur.get(str);
        if(cp==null){
            compteur.put(str, 1);
        }else{
            compteur.put(str, cp+1);
        }
    }
    public static void main(String[] args) {
        comptageIncrement("Chaine");
        comptageIncrement("Chaine");
        
        compteur.forEach((s,i)-> System.out.println("Clé : "+s+" Valeur : "+i));
    }
}
