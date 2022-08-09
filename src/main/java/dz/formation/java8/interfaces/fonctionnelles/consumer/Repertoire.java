/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.formation.java8.interfaces.fonctionnelles.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author tchakal.ahmed
 */
public class Repertoire {

    private String nom;
    private List<Fichier> listFichiers = new ArrayList<>();

    public Repertoire(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Fichier> getListFichiers() {
        return listFichiers;
    }

    public void setListFichiers(List<Fichier> listFichiers) {
        this.listFichiers = listFichiers;
    }

    public void affiche(Consumer<Repertoire> sortie) {
        sortie.accept(this);
    }

    public void ajouterFichier(Fichier fichier) {
        this.listFichiers.add(fichier);
    }

    @Override
    public String toString() {
        String resultat = "";
        resultat = listFichiers.stream().map(fichier -> nom + '/' + fichier.getNom() + "\n").reduce(resultat, String::concat);
        return resultat;
    }

}
