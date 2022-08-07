/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.formation.java8.lmabda_expression;

interface MonInterface{
    //void print(String s);
    void printDeuxParam(String s1,String s2);
}

/**
 *
 * @author tchakal.ahmed
 */
public class LmabdaExpression {
    
   
//    public static void affiche(MonInterface printer){
//        printer.print("Coucou");
//    }
    public static void affiche(MonInterface printer){
        printer.printDeuxParam("Coucou","Help");
    }
    
    public static void main(String [] args){
        affiche((x,y)->{System.out.println(x+y);});
    }
    
}
