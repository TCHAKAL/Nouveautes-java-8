/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.formation.java8.interfaces.fonctionnelles.predicate;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

/**
 *
 * @author tchakal.ahmed
 */
public class Catalogue {

    List<Article> listeArticles = new ArrayList<>();

    public void ajouterArticle(Article article) {
        listeArticles.add(article);
    }

    public List<Article> rechercherArticles(Predicate<Article> f) {
        List<Article> returnList = new ArrayList<>();

        listeArticles.stream().filter(a -> (f.test(a))).forEachOrdered(a -> {
            returnList.add(a);
        });
        return returnList;
    }

}
