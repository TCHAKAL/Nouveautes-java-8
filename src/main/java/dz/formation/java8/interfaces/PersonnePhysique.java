/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.formation.java8.interfaces;

/**
 *
 * @author tchakal.ahmed
 */
public class PersonnePhysique implements IPersonne{

    private String nom;

    PersonnePhysique(String nom) {
        this.nom=nom;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "PersonnePhysique{" + "siret=" + getSiret()+ " nom=" + nom + '}';
    }
    
    
}
