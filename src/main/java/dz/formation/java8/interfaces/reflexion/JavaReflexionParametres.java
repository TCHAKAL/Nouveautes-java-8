/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.formation.java8.interfaces.reflexion;

import dz.formation.java8.reference_methode.Personne;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 *
 * @author tchakal.ahmed
 */
public class JavaReflexionParametres {

    public static void main(String[] args) throws NoSuchMethodException {
        Personne p = new Personne();
        Voiture v  = new Voiture();
        v.acheter(p);
        v.getClass().getMethods();
        Method m =v.getClass().getMethod("acheter",Personne.class);
        Parameter[] parametres = m.getParameters();
        String str =parametres[0].getName();
        System.out.println(str);
    }   
    

}
