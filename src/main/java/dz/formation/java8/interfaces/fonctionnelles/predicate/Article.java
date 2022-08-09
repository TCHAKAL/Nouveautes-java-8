/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.formation.java8.interfaces.fonctionnelles.predicate;

/**
 *
 * @author tchakal.ahmed
 */
public class Article {

    private String nom;
    private Double prix;

    public Article(String nom, Double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Article{" + "nom=" + nom + ", prix=" + prix + " Da}";
    }

}
