/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.formation.java8.interfaces.fonctionnelles.supplier;

/**
 *
 * @author tchakal.ahmed
 */
public class Fibonacci {

    static int[] suite = {1,2,3,4,5,6,7,8,9};
    static int i=0;
    static int getAsInt() {
        return suite[i++];
    }
}
