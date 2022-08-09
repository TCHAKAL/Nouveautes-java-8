/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.formation.java8.interfaces.fonctionnelles.consumer;

import java.util.function.Consumer;

/**
 *
 * @author tchakal.ahmed
 */
public class Fichier {

    private String nom;

    public Fichier(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void affiche(Consumer<Fichier> sortie) {
        sortie.accept(this);
    }
}
