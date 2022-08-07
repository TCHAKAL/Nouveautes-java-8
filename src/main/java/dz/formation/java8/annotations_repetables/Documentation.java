/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dz.formation.java8.annotations_repetables;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author tchakal.ahmed
 */
//@Target(ElementType.METHOD)
//@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Documentations.class)
public @interface Documentation {

    String auteur();

    String date();

    int version();

    String[] responsables();
}

