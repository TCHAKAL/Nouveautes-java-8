/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.formation.java8.javaneturlpermission;

import java.net.URLPermission;
import java.security.AccessControlException;
import java.security.AccessController;

/**
 *
 * @author tchakal.ahmed
 */
public class JavaNetUrlPermission {

    public static void main(String[] args) {
        URLPermission maPermission = new URLPermission("https://www.linkedin.com/in/ahmed-tchakal-89aa0b128/");
        try {
            AccessController.checkPermission(maPermission);
            System.out.println("Permission accordée");
        } catch (AccessControlException e) {
            System.out.println("Permission réfusée " + e);
        }
    }
}
