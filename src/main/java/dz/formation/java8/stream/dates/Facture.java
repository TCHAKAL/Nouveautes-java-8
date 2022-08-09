/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.formation.java8.stream.dates;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

/**
 *
 * @author tchakal.ahmed
 */
public class Facture {

    private String numero;
    private LocalDate date;
    private LocalDate echeance;
    static private Period dureeMax = Period.of(0, 2, 0);

    public Facture(String numero) {
        this.numero = numero;
        this.date = LocalDate.now();
        echeance = date.plus(dureeMax);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public static Period getDureeMax() {
        return dureeMax;
    }

    public LocalDate getEcheance() {
        return echeance;
    }

    public void setEcheance(LocalDate echeance) {
        this.echeance = echeance;
    }

    @Override
    public String toString() {
        return "Facture{" + "numero=" + numero + ", date=" + date + ", echeance=" + echeance + '}';
    }

    long restAvantechaance() {
        return LocalDate.now().until(echeance,ChronoUnit.DAYS);
    }
    long restAvantechaance2() {
        return LocalDate.now().until(echeance.with(TemporalAdjusters.lastDayOfYear()),ChronoUnit.DAYS);
    }

}
