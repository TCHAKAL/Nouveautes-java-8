/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.formation.java8.interfaces.fonctionnelles.supplier;

import java.util.function.IntSupplier;


/**
 *
 * @author tchakal.ahmed
 */
public class SupplierInterfaceFunctionnelle {

    public static void main(String[] args) {
        parcours(Fibonacci::getAsInt);
    }
    
    public static void parcours(IntSupplier f){
        for(int i = 0 ; i<=5 ;i++){
            System.out.println("Suivant : "+f.getAsInt());
        }
    }
}
