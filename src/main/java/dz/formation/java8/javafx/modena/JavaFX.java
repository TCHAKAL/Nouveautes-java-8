/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.formation.java8.javafx.modena;

import java.awt.Button;
import javafx.application.Application;
import javafx.embed.swing.SwingNode;
import javafx.stage.Stage;

/**
 *
 * @author tchakal.ahmed
 */
public class JavaFX extends Application {

    @Override
    public void start(Stage stage) throws Exception {
       
        Button btn = new Button();
        btn.setLabel("Say Hello world ! ");
        
        final SwingNode swingNode = new SwingNode();
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
