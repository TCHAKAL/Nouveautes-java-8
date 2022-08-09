/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.formation.java8.concurrents;

/**
 *
 * @author tchakal.ahmed
 */
public class StampedLocks {

    public static void main(String[] args) {
        Point p = new Point(10, 20);
        System.out.println(p.distance());
        p.move(10, 0);
        System.out.println(p.distance());
    }
}
