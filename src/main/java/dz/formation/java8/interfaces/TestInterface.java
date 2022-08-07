/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.formation.java8.interfaces;

/**
 *
 * @author tchakal.ahmed
 */
public class TestInterface {

    public static void main(String[] args) {
        PersonnePhysique personnePhysique = new PersonnePhysique("TCHAKAL");
        System.err.println(personnePhysique);
        PersonneMorale personneMorale = new PersonneMorale("ELIT", "7549875642154421");
        System.err.println(personneMorale);
    }

}
