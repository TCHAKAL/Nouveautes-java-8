/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.formation.java8.stream.dates;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
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
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder()
                .appendLiteral(" Le : ")
                .appendValue(ChronoField.DAY_OF_MONTH)
                .appendLiteral(" du mois ")
                .appendValue(ChronoField.MONTH_OF_YEAR)
                .appendLiteral(" de l'an ")
                .appendValue(ChronoField.YEAR);
        return "Facture avec dateTimeFormatter {" + "numero=" + numero + ", date=" + date.format(dateTimeFormatter) + ", echeance=" + echeance + '}'+
         "\nFacture avec dateTimeFormatterBuilder {" + "numero=" + numero + ", date=" + date.format(dateTimeFormatterBuilder.toFormatter()) + ", echeance=" + echeance + '}';
    }

    long restAvantechaance() {
        return LocalDate.now().until(echeance, ChronoUnit.DAYS);
    }

    long restAvantechaance2() {
        return LocalDate.now().until(echeance.with(TemporalAdjusters.lastDayOfYear()), ChronoUnit.DAYS);
    }

}
