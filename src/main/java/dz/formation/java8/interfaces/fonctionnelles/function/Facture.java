/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.formation.java8.interfaces.fonctionnelles.function;

import java.util.function.UnaryOperator;

/**
 *
 * @author tchakal.ahmed
 */
public class Facture {
    
    private String numero;

    Facture(String numero) {
        this.numero=numero;
    }
    
    public void incrementNumero(UnaryOperator<String> inc){
        numero = inc.apply(numero);
    }

    public String getNumero() {
        return numero;
    }
    
}
