/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.formation.java8.interfaces.fonctionnelles.consumer;

/**
 *
 * @author tchakal.ahmed
 */
public class ConsumerInterfaceFunctionnelle {

    public static void main(String[] args) {
        Repertoire repertoire = new Repertoire("dir");
        Fichier fichier = new Fichier("data.txt");
        Fichier fichier2 = new Fichier("script.sql");
        repertoire.ajouterFichier(fichier);
        repertoire.ajouterFichier(fichier2);
        //fichier.affiche(f -> System.out.println(fichier.getNom()));
        repertoire.affiche(r->System.out.println(r));

    }

}
