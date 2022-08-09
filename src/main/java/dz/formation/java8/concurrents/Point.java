/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.formation.java8.concurrents;

import java.util.concurrent.locks.StampedLock;

/**
 *
 * @author tchakal.ahmed
 */
public class Point {
    
    private double x, y;
    private final StampedLock sl = new StampedLock();

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    
    void move(double dx, double dy) {
        long stamp = sl.writeLock();
        try {
            x += dx;
            y += dy;
        } finally {
            sl.unlockWrite(stamp);
        }
    }
    
    double distance() {
        long stamp = sl.tryOptimisticRead();
        double cx = x, cy = y;
        if (!sl.validate(stamp)) {
            stamp = sl.writeLock();
            try {
                cx = x;
                cy = y;
            } finally {
                sl.unlockWrite(stamp);
            }
        }
        return Math.sqrt(cx * cx + cy * cy);
    }
}
