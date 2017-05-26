/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulandodatas.apresentacao;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import manipulandodatas.campos.CampoCalendar;
import manipulandodatas.metodos.MetodosCalendar;

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

        System.out.println("--------------Terceira Comparação------------------");

        LocalDateTime noite = LocalDateTime.of(2017, 12, 25, 20, 30);
        System.out.println("Noite " + noite);
        LocalDateTime tarde = LocalDateTime.of(2017, 12, 25, 12, 0);
        System.out.println("Tarde " + tarde);
        System.out.println("A noite vem antes da tarde: " + noite.isBefore(tarde));
        System.out.println("A noite é depois da tarde: " + noite.isAfter(tarde));
        System.out.println("A noite é no mesmo momento que a tarde: " + noite.isEqual(tarde));
        System.out.println("");
    }

    public void compararDatasDeTimeZonesDiferentes() {
        Calendar cParis = Calendar.getInstance();
        TimeZone.setDefault(TimeZone.getTimeZone("Europe/Paris"));
        System.out.println("Horário França/Paris: " + cParis.getTime());

        Calendar cSaoPaulo = Calendar.getInstance();
        TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));
        System.out.println("Horário Brasil/São Paulo: " + cSaoPaulo.getTime());

        System.out.println("Horário de São Paulo é o mesmo de Paris: " + cSaoPaulo.equals(cParis));

        System.out.println("-----------Segunda Comparação Calendar------------");

        TimeZone.setDefault(TimeZone.getTimeZone("Europe/Paris"));
        Calendar cParis1 = Calendar.getInstance();
        cParis1.set(2017, 4, 25, 14, 0);
        System.out.println("Horário França/Paris: " + cParis1.getTime());

        TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));
        Calendar cSaoPaulo1 = Calendar.getInstance();
        cSaoPaulo1.set(2017, 4, 25, 9, 0);
        System.out.println("Horário Brasil/São Paulo: " + cSaoPaulo1.getTime());

        System.out.println("Horário de São Paulo é o mesmo de Paris: " + cSaoPaulo1.equals(cParis1));

        Calendar cSaoPaulo2 = Calendar.getInstance();
        cSaoPaulo2.set(2017, 4, 25, 9, 0);
        System.out.println("Horário Brasil/São Paulo: " + cSaoPaulo2.getTime());
        System.out.println("Horário de São Paulo é o mesmo de São Paulo: " + cSaoPaulo1.equals(cSaoPaulo2));

        System.out.println("==================================================");

        ZonedDateTime saoPaulo
                = ZonedDateTime.of(2014, 8, 30, 18, 0, 0, 0, ZoneId.of("America/Sao_Paulo"));
        System.out.println("São Paulo: " + saoPaulo);
        ZonedDateTime melbourne
                = ZonedDateTime.of(2014, 8, 30, 18, 0, 0, 0, ZoneId.of("Australia/Melbourne"));
        System.out.println("Melbourne " + melbourne);
        System.out.println("O dia e horário de São Paulo é o mesmo de Melbourne: " + saoPaulo.isEqual(melbourne));

        System.out.println("--------------Segunda Comparação------------------");

        ZonedDateTime saoPaulo1
                = ZonedDateTime.of(2014, 8, 30, 18, 0, 0, 0, ZoneId.of("America/Sao_Paulo"));
        System.out.println("São Paulo: " + saoPaulo1);
        ZonedDateTime melbourne1
                = ZonedDateTime.of(2014, 8, 31, 7, 0, 0, 0, ZoneId.of("Australia/Melbourne"));
        System.out.println("Melbourne " + melbourne1);
        System.out.println(saoPaulo1.isEqual(melbourne1));
    }

    public void anoMes() {
        MetodosCalendar mc = new MetodosCalendar();
        Calendar date = mc.dataDeHoje();
        Locale ptBr = new Locale("pt", "BR");
        String mes = date.getDisplayName(Calendar.MONTH, Calendar.LONG, ptBr);
        String anoT = date.getDisplayName(Calendar.YEAR, Calendar.LONG, ptBr);
        System.out.println(anoT + "-" + date.getWeekYear());
        int ano = date.get(Calendar.YEAR);
        System.out.println(mes + "/" + ano);

        String mes1 = date.getDisplayName(Calendar.MONTH, Calendar.SHORT, ptBr);
        System.out.println(mes1 + "/" + ano);

        String mes2 = date.getDisplayName(Calendar.MONTH, Calendar.NARROW_FORMAT, ptBr);
        System.out.println(mes2 + "/" + ano);

        System.out.println("--------------------------------------------------");

        LocalDate data = LocalDate.of(1975, 12, 19);
        YearMonth mesDoAno = YearMonth.from(data);
        System.out.println(mesDoAno.getMonth() + "/" + mesDoAno.getYear());
        System.out.println(
                mesDoAno.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault())
                + "/" + mesDoAno.getYear()
        );
        System.out.println(
                mesDoAno.getMonth().getDisplayName(TextStyle.SHORT, Locale.getDefault())
                + "/" + mesDoAno.getYear()
        );
        System.out.println(
                mesDoAno.getMonth().getDisplayName(TextStyle.NARROW,
                        Locale.getDefault()) + "/" + mesDoAno.getYear()
        );
    }

    public void diasDoAnoEMes() {
        MetodosCalendar mc = new MetodosCalendar();
        Calendar date = mc.dataDeHoje();
        System.out.println("Ano: " + date.getWeekYear());
        Locale ptBr = new Locale("pt", "BR");
        String mes = date.getDisplayName(Calendar.MONTH, Calendar.LONG, ptBr);
        System.out.println(Calendar.DAY_OF_MONTH);//captura a posição do campo
        System.out.println(date.get(Calendar.DAY_OF_MONTH) + "/" + mes);

        /* for (int i = 0; i < Calendar.FIELD_COUNT; i++) {
            System.out.println(date.get(i));
         */
        System.out.println("--------------------------------------------------");

        LocalDate data = LocalDate.of(1975, 12, 19);
        System.out.println("Ano: " + Year.from(data));
        MonthDay diaDoMes = MonthDay.from(data);
        System.out.println(diaDoMes.getDayOfMonth() + "/" + diaDoMes.getMonth());
    }

    public void metodosAt() {
        LocalDate data = Year.of(2010).atMonth(9).atDay(5);
        System.out.println(data);
        LocalDateTime dataHora = Year.of(2010).atMonth(9).atDay(5).atTime(14, 20, 30);
        System.out.println(dataHora);
    }

    public void criandoData() {
        System.out.println(Calendar.SEPTEMBER);

        LocalDate localDate = LocalDate.of(2014, 9, 19);
        System.out.println("Saída 1: " + localDate);
        localDate = LocalDate.of(2014, Month.SEPTEMBER, 19);
        System.out.println("Saída 2: " + localDate);
    }

    public void comparandoDiasDaSemana() {
        LocalDate dt1 = LocalDate.of(2013, Month.APRIL, 6);
        LocalDate dt2 = LocalDate.of(2014, Month.APRIL, 6);
        LocalDate dt3 = LocalDate.of(2015, Month.APRIL, 6);
        List<LocalDate> localDates = Arrays.asList(dt1, dt2, dt3);
        for (LocalDate date : localDates) {
            switch (date.getDayOfWeek()) {
                case SATURDAY:
                    System.out.println(date + " é Sábado");
                    break;
                case SUNDAY:
                    System.out.println(date + " é Domingo");
                    break;
                default:
                    System.out.println(date + " é " + date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault()));
            }
        }
    }

    public void formatandoData() {
        Calendar hoje = Calendar.getInstance();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:MM:ss");
        String f = sdf.format(hoje.getTime());
        System.out.println(f);

        SimpleDateFormat sdf4 = new SimpleDateFormat("EEEE, d 'de' MMMM 'de' yyyy");
        String f4 = sdf4.format(hoje.getTime());
        System.out.println(f4);

        SimpleDateFormat sdf3 = new SimpleDateFormat("d 'de' MMMM 'de' yyyy");
        String f3 = sdf3.format(hoje.getTime());
        System.out.println(f3);

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        String f1 = sdf1.format(hoje.getTime());
        System.out.println(f1);

        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yy");
        String f2 = sdf2.format(hoje.getTime());
        System.out.println(f2);

        System.out.println("--------------------------------------------------");

        LocalDateTime dataHora = LocalDateTime.now();
        System.out.println(dataHora);
        System.out.println(dataHora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:MM:ss")));

        System.out.println(dataHora.format(DateTimeFormatter.
                ofLocalizedDate(FormatStyle.FULL)));
        System.out.println(dataHora.format(DateTimeFormatter.
                ofLocalizedDate(FormatStyle.LONG)));
        System.out.println(dataHora.format(DateTimeFormatter.
                ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println(dataHora.format(DateTimeFormatter.
                ofLocalizedDate(FormatStyle.SHORT)));
    }

    public void compararDatasChrono() {
        LocalDate tiradentes = LocalDate.of(2014, 4, 21);
        LocalDate procReplublica = LocalDate.of(2014, 11, 15);
        long dias = ChronoUnit.DAYS.between(tiradentes, procReplublica);
        System.out.printf("São %s dias de diferença.", dias);
        long meses = ChronoUnit.MONTHS.between(tiradentes, procReplublica);
        System.out.printf("\nSão %s meses de diferença.", meses);
        System.out.println("");
    }

    public void dataPeriodo() {
        LocalDate brasileiro = LocalDate.of(2009, 12, 6);
        LocalDate copaDoBrasil = LocalDate.of(2013, 11, 27);
        Period dif = Period.between(brasileiro, copaDoBrasil);
        System.out.printf("%s anos, %s meses e %s dias", dif.getYears(), dif.getMonths(),
                dif.getDays());
        System.out.println("");
        System.out.println("---------------------------------------------------");
        LocalDateTime inicio = LocalDateTime.of(2013, 10, 20, 0, 0, 0);
        LocalDateTime fim = LocalDateTime.of(2014, 2, 16, 0, 0, 0);
        Duration dur = Duration.between(inicio, fim);
        System.out.printf("%s dias %s horas, %s minutos e %s segundos", dur.toDays(), dur.toHours(), dur.toMinutes(), dur.getSeconds());
        System.out.println("");
    }
}
