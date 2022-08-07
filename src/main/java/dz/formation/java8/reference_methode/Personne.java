/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.formation.java8.reference_methode;

/**
 *
 * @author tchakal.ahmed
 */
public class Personne {

    private String nom;
    private int age;

    public Personne(String nom) {
        this.nom = nom;
    }

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }
    
    public static int TrierParAge(Personne p1,Personne p2){
        return p1.age-p2.age;
    }

    @Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", age=" + age + '}';
    }
    
    

}
