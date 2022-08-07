/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.formation.java8.interfaces_fonctionnelles_predicate;

import java.util.List;


/**
 *
 * @author tchakal.ahmed
 */
public class PredicateInterfaceFunctionnelle {

    public static void main(String[] args) {
        //Interface Predicate<T>
        Catalogue catalogue = new  Catalogue();
        catalogue.ajouterArticle(new Article("Bouteille d'eau", 35d));
        catalogue.ajouterArticle(new Article("Canette coca", 50d));
        catalogue.ajouterArticle(new Article("Boisson gazeuse Hamoud min", 60d));
        
        //Trouver les articles dont le prix >=50 da
        List<Article> resultat = catalogue.rechercherArticles( a-> {return a.getPrix()>=50;});
        System.out.print(resultat);
    }
}
