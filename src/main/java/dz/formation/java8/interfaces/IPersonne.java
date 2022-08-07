/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dz.formation.java8.interfaces;

/**
 *
 * @author tchakal.ahmed
 */
public interface IPersonne {

    String getNom();

    default String getSiret(){
     return  "Pas de siret";
    }
    

}
