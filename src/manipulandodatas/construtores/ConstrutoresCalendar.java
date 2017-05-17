/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulandodatas.construtores;

import static java.time.temporal.TemporalQueries.zone;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/**
 *
 * @author Michel
 */
public class ConstrutoresCalendar {

    public void calendario() {
        Calendar c = Calendar.getInstance();
        System.out.println("calendário " + c);
    }

    public void calendario1() {
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT"),Locale.CANADA);
        System.out.println("calendário " + c);
    }

}
