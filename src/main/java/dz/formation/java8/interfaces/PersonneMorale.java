/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.formation.java8.interfaces;

/**
 *
 * @author tchakal.ahmed
 */
public class PersonneMorale implements IPersonne{

    private String siret;
    private String raisonSociale;

    PersonneMorale(String raisonSociale, String siret) {
        this.raisonSociale = raisonSociale;
        this.siret = siret;
    }

    @Override
    public String getNom() {
        return raisonSociale;
    }

    @Override
    public String getSiret() {
        return siret;
    }

    @Override
    public String toString() {
        return "PersonneMorale{" + "siret=" + siret + ", raisonSociale=" + raisonSociale + '}';
    }
    
    
    
}
