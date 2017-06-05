/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulandodatas.JavaTime;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import static java.time.Instant.ofEpochMilli;
import java.time.ZoneId;

/**
 *
 * @author Michel
 */
public class Relogio {

    public void ehIgual() {
        Clock c = Clock.systemDefaultZone();
        System.out.println(c);

        ZoneId zone = ZoneId.of("Europe/Paris");
        Clock c1 = Clock.system(zone);
        System.out.println(c1);

        ZoneId zone1 = ZoneId.of("America/Sao_Paulo");
        Clock c2 = Clock.system(zone1);
        System.out.println(c2);

        Boolean igual = c.equals(c1);
        System.out.println("Horário de Paris é o mesmo de São Paulo: " + igual);

        Boolean igual1 = c.equals(c2);
        System.out.println("Horário de São Paulo é o mesmo de São Paulo: " + igual1);
    }

    public void fixado() {
        ZoneId zone1 = ZoneId.of("America/Sao_Paulo");
        Instant i = Instant.now();
        System.out.println("Instant>>> " + i);
        Clock c = Clock.fixed(i, zone1);
        System.out.println(c);
    }

    public void captureAZone() {
        Clock c = Clock.systemDefaultZone();
        ZoneId z = c.getZone();
        System.out.println(z);
    }

    public void codigoHash() {
        Clock c = Clock.systemDefaultZone();
        Integer i = c.hashCode();
        System.out.println(i);
    }

    public void instante() {
        Clock c = Clock.systemDefaultZone();
        Instant i = c.instant();
        System.out.println(i);
    }

    public void millissegundos() {
        Clock c = Clock.systemDefaultZone();
        Long l = c.millis();
        System.out.println(l);
    }

    public void offConfiguracao() {
        Clock constClock = Clock.fixed(
                ofEpochMilli(0), ZoneId.systemDefault());
        System.out.println("Current millis: "
                + constClock.millis());

        // go to the future:
        Clock clock = Clock.offset(
                constClock, Duration.ofSeconds(10));
        System.out.println("Current millis: "
                + clock.millis());
    }

    public void sistema() {
        ZoneId zone = ZoneId.of("America/Sao_Paulo");
        Clock c = Clock.system(zone);
        System.out.println(c);
    }

    public void sistemaPadrao() {
        Clock c = Clock.systemDefaultZone();
        System.out.println(c);
    }

    public void sistemaUTC() {
        Clock c = Clock.systemUTC();
        System.out.println(c);
    }

    public void tiqueTaque() {
        Clock c1 = Clock.systemDefaultZone();
        Clock c = Clock.tick(c1, Duration.ofSeconds(10));
        System.out.println(c);
    }

    public void tiqueTaqueMinutos() {
        ZoneId zone = ZoneId.of("America/Sao_Paulo");
        Clock c = Clock.tickMinutes(zone);
        System.out.println(c);
    }

    public void tiqueTaqueSegundos() {
        ZoneId zone = ZoneId.of("America/Sao_Paulo");
        Clock c = Clock.tickSeconds(zone);
        System.out.println(c);
    }

    public void comZona() {
        Clock clock = Clock.systemUTC();
        System.out.println(clock.getZone());
        clock.withZone(ZoneId.systemDefault());
        System.out.println(clock.getZone());
    }
}
