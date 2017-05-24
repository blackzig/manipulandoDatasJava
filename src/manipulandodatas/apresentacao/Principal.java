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
import java.time.LocalTime;
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

    public void camposConfiguraveis() {
        CampoCalendar cc = new CampoCalendar();
        cc.contadorDeCampos();
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
        // camposConfiguraveis();
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
        System.out.println("Data atual: " + date);
        date.setMonth(9);
        System.out.println("Alterando para o mês 10: " + date);
        date.setDate(29);
        System.out.println("Alterando para o dia 29 do mês atual: " + date);

        System.out.println("--------------------------------------------------");

        Calendar c = Calendar.getInstance();
        System.out.println("Data atual " + c.getTime());
        System.out.println("Calendar.YEAR>>> " + Calendar.YEAR);//retorna posição field -> Calendar.FIELD_COUNT
        System.out.println("Calendar.DAY_OF_MONTH>>> " + Calendar.DAY_OF_MONTH);//retorna posição field -> Calendar.FIELD_COUNT
        c.set(c.get(Calendar.YEAR), 9, c.get(Calendar.DAY_OF_MONTH));
        System.out.println("Alterando para o mês 10: " + c.getTime());

        c.set(c.get(Calendar.YEAR), 9, 29);
        System.out.println("Alterando para o dia 29 do mês atual: " + c.getTime());

        //camposConfiguraveis();
        c.set(c.get(Calendar.YEAR), 9, -248);
        System.out.println("Alterando para o 25° dia do ano: " + c.getTime());

        System.out.println("--------------------------------------------------");

        LocalDate data = LocalDate.now();
        System.out.println("Data atual: " + data);
        data = data.withMonth(10);
        System.out.println("Alterando para o mês 10: " + data);
        data = data.withDayOfMonth(29);
        System.out.println("Alterando para o dia 29 do mês atual: " + data);
        data = data.withDayOfYear(25);
        System.out.println("Alterando para o 25° dia do ano: " + data);
        System.out.println("");
    }

    public void dataPreDefinida() {
        int ano = 2014;
        int mes = 12;
        int dia = 25;
        int hora = 15;
        int min = 35;
        int sec = 15;

        Date date = new Date(ano - 1900, mes - 1, dia, hora, min, sec);
        System.out.println("Data pré-definida: " + date);

        System.out.println("--------------------------------------------------");

        Calendar c = Calendar.getInstance();
        c.set(ano, mes - 1, dia, hora, min, sec);
        System.out.println("Data pré-definida: " + c.getTime());
        System.out.println("--------------------------------------------------");

        LocalDateTime localDateTime = LocalDateTime.of(ano, mes, dia, hora, min, sec);
        System.out.println("Data pré-definida: " + localDateTime);
        System.out.println("");
    }

    public void compararDatas() {
        Date noiteDate = new Date(2017 - 1900, 11, 25, 20, 30);
        Date tardeDate = new Date(2017 - 1900, 11, 25, 12, 30);
        System.out.println("A noite é antes da tarde: " + noiteDate.before(tardeDate));
        System.out.println("A noite é depois da tarde: " + noiteDate.after(tardeDate));
        System.out.println("A noite e a tarde são no mesmo horário: " + noiteDate.equals(tardeDate));

        System.out.println("--------------------------------------------------");

        Calendar noiteCalendar = Calendar.getInstance();
        noiteCalendar.set(2017, 11, 25, 20, 30);
        Calendar tardeCalendar = Calendar.getInstance();
        tardeCalendar.set(2017, 11, 25, 12, 30);

        System.out.println("A noite é antes da tarde: " + noiteCalendar.before(tardeCalendar));
        System.out.println("A noite é depois da tarde: " + noiteCalendar.after(tardeCalendar));
        System.out.println("A noite e a tarde são no mesmo horário: " + noiteCalendar.equals(tardeCalendar));
        
        System.out.println("--------------------------------------------------");

        LocalDate anoNovo = LocalDate.of(2017, 1, 1);
        System.out.println("Ano novo " + anoNovo);
        LocalDate natal = LocalDate.of(2017, 12, 25);
        System.out.println("Natal " + natal);
        System.out.println("Ano novo é antes do natal: " + anoNovo.isBefore(natal));
        System.out.println("Ano novo é depois do natal: " + anoNovo.isAfter(natal));
        System.out.println("A data do ano novo é a mesma do natal: " + anoNovo.isEqual(natal));
        
        LocalTime almoco = LocalTime.of(12, 0);
        System.out.println("Almoço: " + almoco);
        LocalTime jantar = LocalTime.of(20, 30);
        System.out.println("Jantar: " + jantar);
        System.out.println("O almoço é antes do jantar: " + almoco.isBefore(jantar));
        System.out.println("O almoço é depois do jantar: " + almoco.isAfter(jantar));
        System.out.println("O horário do almoço é o mesmo do jantar: " + almoco.equals(jantar));

        System.out.println("--------------Segunda Comparação------------------");
        LocalDateTime anoNovoAlmoco = LocalDateTime.of(anoNovo, almoco);
        System.out.println("Almoço do ano novo " + anoNovoAlmoco);
        LocalDateTime natalJantar = LocalDateTime.of(natal, jantar);
        System.out.println("Jantar de natal " + natalJantar);
        System.out.println("O almoço do ano novo é antes do jantar de natal: " + anoNovoAlmoco.isBefore(natalJantar));
        System.out.println("O almoço do ano novo é depois do jantar de natal: " + anoNovoAlmoco.isAfter(natalJantar));
        System.out.println("O almoço do ano novo é no mesmo dia e horário do jantar de natal: " + anoNovoAlmoco.isEqual(natalJantar));
    }

}
