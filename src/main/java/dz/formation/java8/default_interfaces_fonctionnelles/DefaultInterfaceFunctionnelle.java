/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.formation.java8.default_interfaces_fonctionnelles;

/**
 *
 * @author tchakal.ahmed
 */
public class DefaultInterfaceFunctionnelle {

    public static void main(String[] args) {
        //Interface Function<T,R>
        Client monClient = new Client("TCHAKAl");
        String str = monClient.rendre((Client c) -> {
            return c.getNom();
        });
        System.out.println("Le client est rendu " + str);
        str = monClient.rendre((Client c) -> {
            return "Ahmed " + c.getNom();
        });
        System.out.println("Le client est rendu " + str);

        //Interface UnaryOperator
        Facture facture = new Facture("2022/001");
        System.out.println("Facture Initiale : "+facture.getNumero());
        facture.incrementNumero(f->{return f+"1";});
        System.out.println("Facture +1 : "+facture.getNumero());
        
         //Interface BiFunction
         monClient.setFacture(facture);
         String reultat = monClient.lie((Client c , Facture f)->{ return c.getNom()+" "+f.getNumero();});
        System.out.println("Résultat : "+reultat);
    }
}
