/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.formation.java8.lmabda_expression;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author tchakal.ahmed
 */
public class LimitesLmabdaExpressionJFrame extends JFrame {


    public LimitesLmabdaExpressionJFrame() {
        setLayout(new FlowLayout());
        JTextField texte = new JTextField("Hello");
        add(texte);
        JButton button = new JButton("Cliquez vous !");
        pack();
    }

    public static void main(String[] args) {
        LimitesLmabdaExpressionJFrame frame = new LimitesLmabdaExpressionJFrame();
        frame.setVisible(true);
    }

}
