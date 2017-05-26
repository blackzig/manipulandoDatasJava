/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulandodatas.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

/**
 *
 * @author Michel
 */
public class Datas {

    public String soDataDeHoje(LocalDate data) {
        String soData = data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return soData;
    }

    public String soHorarioDeHoje(LocalTime horario) {
        String soHorario = horario.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        return soHorario;
    }

    public String horarioReferenteA(String zone) {
        LocalTime lt = LocalTime.now(ZoneId.of(zone));
        String horario = lt.format(DateTimeFormatter.ofPattern("HH:mm:ss"));        
        return horario;
    }

}
