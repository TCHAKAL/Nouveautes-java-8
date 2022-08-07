/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.formation.java8.lmabda_expression;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author tchakal.ahmed
 */
public class LmabdaExpressionJFrame extends JFrame {

    int indice = 0;

    public LmabdaExpressionJFrame() {
        JButton button = new JButton("Cliquez vous !");
        add(button);
//      Avant l'utilisation de lambda expression
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//               System.out.println("Cliquez vous a fonctionné");
//                              indice++; // c'est pas possible 

//            }
//        });
//      sera remplacé par : 
        button.addActionListener(e  -> {
            indice++;
            System.out.println("Cliquez vous a fonctionné " + indice);
        });
        pack();
    }

    public static void main(String[] args) {
        LmabdaExpressionJFrame frame = new LmabdaExpressionJFrame();
        frame.setVisible(true);
    }

}

class ClassDeListner implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Clique moi a fonctionné");
    }

}
