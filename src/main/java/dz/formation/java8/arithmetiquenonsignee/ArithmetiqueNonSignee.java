/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.formation.java8.arithmetiquenonsignee;

/**
 *
 * @author tchakal.ahmed
 */
public class ArithmetiqueNonSignee {
    public static void main(String[] args) {
        Integer v = Integer.MIN_VALUE;
        for(int i=0;i<5;i++){
            System.out.println(v);
            System.out.println(Integer.toUnsignedString(v));
            v++;
        }
    }
}
