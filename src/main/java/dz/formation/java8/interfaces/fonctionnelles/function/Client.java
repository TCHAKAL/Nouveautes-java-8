/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.formation.java8.interfaces.fonctionnelles.function;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/**
 *
 * @author tchakal.ahmed
 */
public class Client {

    private String nom;
    private Facture facture;

    public Client(String nom) {
        this.nom = nom;
    }

    public String rendre(Function<Client, String> rendu) {
        return rendu.apply(this);
    }

    public String getNom() {
        return nom;
    }

    public String lie(BiFunction<Client, Facture, String> liaison) {
        return liaison.apply(this, facture);
    }

    public Facture getFacture() {
        return facture;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }

}
