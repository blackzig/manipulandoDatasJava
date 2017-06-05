/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulandodatas.JavaTime;

import java.time.Clock;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Michel
 */
public class Duracao {

    public void abs1() {
        Duration d = Duration.ZERO;
        System.out.println(d.abs());
    }

    public void adicionarTempo() {
        Duration duration = Duration.ofDays(2);
        Temporal l = duration.addTo(LocalDateTime.now());
        System.out.println(l);
    }

    public void entre() {
        System.out.println(LocalTime.MIDNIGHT);
        System.out.println(LocalTime.NOON);
        Duration duration = Duration.between(LocalTime.MIDNIGHT, LocalTime.NOON);
        System.out.println(duration.get(ChronoUnit.SECONDS) + " segundos");

        Long horas = (duration.get(ChronoUnit.SECONDS) / 60) / 60;
        System.out.println("Entre " + LocalTime.MIDNIGHT + " e o " + LocalTime.NOON + " tem " + horas + " horas de diferença.");
    }

    public void comparar() {
        Duration duration = Duration.between(LocalTime.MIDNIGHT, LocalTime.NOON);
        System.out.println(duration.getSeconds() + " segundos");
        System.out.println(Duration.ofSeconds(2340).compareTo(duration));//antes dá negativo
        System.out.println(Duration.ofSeconds(43200).compareTo(duration));//dá zero
        System.out.println(Duration.ofSeconds(50000).compareTo(duration));//depois dá positivo
    }

    public void divididoPor() {
        Duration duration = Duration.between(LocalTime.MIDNIGHT, LocalTime.NOON);
        System.out.println(duration.getSeconds() + " segundos");
        duration = duration.dividedBy(2);
        System.out.println(duration.getSeconds() + " segundos");
    }

    public void igual() {
        Duration duration = Duration.between(LocalTime.MIDNIGHT, LocalTime.NOON);
        System.out.println(duration);
        Duration duration1 = Duration.between(LocalTime.now(), LocalTime.MIDNIGHT);
        System.out.println(duration1);
        System.out.println(duration.equals(duration1));
    }

    public void origem() {
        Duration duration = Duration.from(Duration.ZERO);
        System.out.println(duration);
        Duration d = Duration.between(LocalTime.MIDNIGHT, LocalTime.NOON);
        Duration du = Duration.from(d);
        System.out.println(du);
    }

    public void capturar() {
        Duration duration = Duration.between(LocalTime.MIDNIGHT, LocalTime.NOON);
        System.out.println(duration.get(ChronoUnit.SECONDS));
    }

    public void capturarNano() {
        Duration duration = Duration.between(LocalTime.MIDNIGHT, LocalTime.now());
        System.out.println(duration.getNano());
    }

    public void capturarSegundo() {
        Duration duration = Duration.between(LocalTime.MIDNIGHT, LocalTime.now());
        System.out.println(duration.getSeconds());
    }

    public void capturarUnidade() {
        Period p = Period.ofMonths(1);
        System.out.println(p);
        System.out.println(p.getUnits());
    }

    public void codigoHash() {
        Duration duration = Duration.between(LocalTime.MIDNIGHT, LocalTime.NOON);
        System.out.println("hash>>> " + duration.hashCode());
    }

    public void ehNegativo() {
        Duration duration = Duration.between(LocalTime.MIDNIGHT, LocalTime.NOON);
        System.out.println(duration.getSeconds() + " segundos");
        System.out.println(duration.isNegative());   
    }
    
    public void ehZero(){
        Duration duration = Duration.between(LocalTime.MIDNIGHT, LocalTime.NOON);
        System.out.println(duration.getSeconds() + " segundos");
        System.out.println(duration.isZero());
        
        Duration duration1 = Duration.between(LocalTime.MIDNIGHT, LocalTime.MIDNIGHT);
        System.out.println(duration1.getSeconds() + " segundos");
        System.out.println(duration1.isZero());        
    }
}
