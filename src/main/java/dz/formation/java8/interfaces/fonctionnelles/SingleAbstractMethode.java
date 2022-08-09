/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.formation.java8.interfaces.fonctionnelles;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author tchakal.ahmed
 */
public class SingleAbstractMethode extends JFrame{//SAM

    public SingleAbstractMethode() {
        JButton monButton = new JButton("Ne pas Cliquer svp ");
        add(monButton);
        monButton.addActionListener(al->System.out.println("Vous avez cliquer comme meme -_-\'"));
        pack();
    }
    public static void appelInterfaceSAM(MonInterfaceSam i){
        i.executer();
    }
    
    public static void declancheExecution(MonInterfaceFocntionnelle i){
        i.executer();
    }
    public static void main(String[] args) {
        
        appelInterfaceSAM(()->System.out.println("Execution sans @"));
        
        declancheExecution(()->System.out.println("Execution de mon interface fonctionnelle"));
        //Execution avec l'interface
        MonInterfaceFocntionnelle monInterface = ()->System.out.println("Exécution retardée");
        monInterface.executer();
        //Execution avec une classe qui implimente l'interface fonctionnelle
        MaClass maClass= new MaClass();
        monInterface = maClass::executer;
        declancheExecution(monInterface);
        //ou bien 
        declancheExecution(maClass::executer);
    }
}
