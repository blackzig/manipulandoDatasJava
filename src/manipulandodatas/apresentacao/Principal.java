/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulandodatas.apresentacao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import manipulandodatas.campos.CampoCalendar;

/**
 *
 * @author Michel
 */
public class Principal {

    public void timeZoneAvaliados() {
        String tz[] = TimeZone.getAvailableIDs();

        for (String timeZone : tz) {
            System.out.println(timeZone);
        }
    }

    public void dataAgora() {
        Date date = new Date();
        System.out.println("Hoje: " + date);
        System.out.println("Tipo: " + date.getClass().getName());

        System.out.println("-------------------------------------------------");

        Calendar dateCalendar = Calendar.getInstance();
        System.out.println("Hoje: " + dateCalendar.getTime());
        System.out.println("Tipo: " + dateCalendar.getClass().getName());

        System.out.println("-------------------------------------------------");

        LocalDateTime dataHoraAtual = LocalDateTime.now();
        System.out.println("Hoje: " + dataHoraAtual);
        System.out.println("Tipo: " + dataHoraAtual.getClass().getName());
        System.out.println("");
    }

    public void configuraDataComMilissegundos() {
        //https://currentmillis.com/
        Date date = new Date(1494639436965L);
        System.out.println("Hoje " + date);

        System.out.println("-------------------------------------------------");

        Calendar dateCalendar = Calendar.getInstance();
        dateCalendar.setTimeInMillis(1494639436965L);
        System.out.println("Hoje: " + dateCalendar.getTime());
        System.out.println("");
    }

    public void fusoHorarios() {
        //TimeZone JDK1.1 
        //http://24timezones.com/pt_horamundial/paris_hora_local.php
        //timeZoneAvaliados();
        Date date1 = new Date();
        System.out.println("Horário Brasil/São Paulo: " + date1);
        TimeZone.setDefault(TimeZone.getTimeZone("Europe/Paris"));
        System.out.println("Horário França/Paris: " + date1);

        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Europe/Paris"));
        System.out.println("Horário França/Paris: " + c.getTime());

        System.out.println("--------------------------------------------------");

        LocalDateTime dataHoraAtualFranca = LocalDateTime.now(Clock.system(ZoneId.of("Europe/Paris")));
        System.out.println("Data atual na França: " + dataHoraAtualFranca);

        LocalDateTime dataHoraAtualFranca1 = LocalDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("Data atual na França: " + dataHoraAtualFranca1);
        System.out.println("");
    }

    public void incrementoData() {
        //Mostrar campos configuráveis
        //CampoCalendar cc = new CampoCalendar();
        //cc.contadorDeCampos();
        TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        c.add(5, 4);
        c.add(2, 1);
        System.out.println("Adicionando 1 mês e 4 dias>>> " + c.getTime());
        c.add(11, 2);
        c.add(12, 10);
        System.out.println("Adicionando 2 horas e 10 minutos " + c.getTime());

        System.out.println("--------------------------------------------------");

        LocalDateTime dataHora = LocalDateTime.now();
        dataHora = dataHora.plusMonths(1).plusDays(4);
        System.out.println("Adicionando 1 mês e 4 dias " + dataHora);
        dataHora = dataHora.plusHours(2).plusMinutes(10);
        System.out.println("Adicionando 2 horas e 10 minutos " + dataHora);
        System.out.println("");
    }

    public void alterarAno() {
        Date date = new Date();
        date.setYear(2015 - 1900);
        System.out.println("Ano alterado>>> " + date);

        System.out.println("-------------------------------------------------");

        Calendar hoje = Calendar.getInstance();
        hoje.set(Calendar.YEAR, 2015);
        System.out.println("Ano alterado>>> " + hoje.getTime());

        System.out.println("-------------------------------------------------");

        LocalDate data = LocalDate.now();
        data = data.withYear(2015);
        System.out.println("Ano alterado: " + data);
        System.out.println("");
    }

    public void alterarData() {
        Date date = new Date();
        System.out.println("Date: " + date);
        date.setMonth(9);
        System.out.println("Alterando para o mês 10: " + date);
        date.setDate(29);
        System.out.println("Alterando para o dia 29 do mês atual: " + date);
        
        System.out.println("--------------------------------------------------");
        
        LocalDate data = LocalDate.now();
        System.out.println("Data atual: " + data);
        data = data.withMonth(10);
        System.out.println("Alterando para o mês 10: " + data);
        data = data.withDayOfMonth(29);
        System.out.println("Alterando para o dia 29 do mês atual: " + data);
        data = data.withDayOfYear(25);
        System.out.println("Alterando para o 25° dia do ano: " + data);
    }

}
