/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulandodatas.Exemplo;

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
import java.util.List;
import java.util.Locale;
import java.util.Set;

/**
 *
 * @author Michel http://www.devmedia.com.br/revista-easy-java-magazine-44/31505
 */
public class Ex2 {

    public void capturaHoje() {
        LocalDate dataAtual = LocalDate.now();
        System.out.println("Data: " + dataAtual);
        LocalTime horaAtual = LocalTime.now();
        System.out.println("Hora: " + horaAtual);
        LocalDateTime dataHoraAtual = LocalDateTime.now();
        System.out.println("Data e Hora: " + dataHoraAtual);
    }

    public void fusoHorarios() {
        LocalDateTime datHoraAtual = LocalDateTime.now();
        System.out.println("Data atual local: " + datHoraAtual);
        LocalDateTime datHoraAtual1 = LocalDateTime.now(ZoneId.of("America/Sao_Paulo"));
        System.out.println("Data atual local: " + datHoraAtual1);
        LocalDateTime dataHoraAtualJapao = LocalDateTime.now(Clock.system(ZoneId.of("Japan")));
        System.out.println("Data atual no Japão: " + dataHoraAtualJapao);
        LocalDateTime dataHoraAtualAtenas = LocalDateTime.now(ZoneId.of("Europe/Athens"));
        System.out.println("Data atual no Atenas: " + dataHoraAtualAtenas);

        Set<String> zi = ZoneId.getAvailableZoneIds();

        zi.stream().forEach((s) -> {
            System.out.println(s);
        });
    }

    public void incrementoData() {
        LocalDateTime dataHora = LocalDateTime.now();
        System.out.println("Data e Hora atuais: " + dataHora);
        dataHora = dataHora.plusMonths(1).plusDays(4);
        System.out.println("Adicionando 1 mês e 4 dias " + dataHora);
        dataHora = dataHora.plusHours(2).plusMinutes(10);
        System.out.println("Adicionando 2 horas e 10 minutos " + dataHora);
    }

    public void capturarAno() {
        LocalDate data = LocalDate.now();
        System.out.println("Data atual: " + data);
        data = data.withYear(2015);
        System.out.println("Ano alterado: " + data);
    }

    public void alterarData() {
        LocalDate data = LocalDate.now();
        System.out.println("Data atual: " + data);
        data = data.withMonth(10);
        System.out.println("Alterando para o mês 10: " + data);
        data = data.withDayOfMonth(29);
        System.out.println("Alterando para o dia 29 do mês atual: " + data);
        data = data.withDayOfYear(25);
        System.out.println("Alterando para o 25° dia do ano: " + data);
    }

    public void metodoOf() {
        int ano = 2014;
        int mes = 12;
        int dia = 25;
        int hora = 15;
        int min = 35;
        int sec = 15;
        LocalDateTime localDateTime = LocalDateTime.of(ano, mes, dia, hora, min, sec);
        System.out.println("Data pré-definida: " + localDateTime);
    }

    public void compararDatas() {
        LocalDate anoNovo = LocalDate.of(2014, 1, 1);
        System.out.println("Ano novo " + anoNovo);
        LocalDate natal = LocalDate.of(2014, 12, 25);
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

        System.out.println("-----------------------------------------------------");
        LocalDateTime anoNovoAlmoco = LocalDateTime.of(anoNovo, almoco);
        System.out.println("Almoço do ano novo " + anoNovoAlmoco);
        LocalDateTime natalJantar = LocalDateTime.of(natal, jantar);
        System.out.println("Jantar de natal " + natalJantar);
        System.out.println("O almoço do ano novo é antes do jantar de natal: " + anoNovoAlmoco.isBefore(natalJantar));
        System.out.println("O almoço do ano novo é depois do jantar de natal: " + anoNovoAlmoco.isAfter(natalJantar));
        System.out.println("O almoço do ano novo é no mesmo dia e horário do jantar de natal: " + anoNovoAlmoco.isEqual(natalJantar));
    }

    public void compararDatasDeTimeZonesDiferentes() {
        ZonedDateTime saoPaulo
                = ZonedDateTime.of(2014, 8, 30, 18, 0, 0, 0, ZoneId.of("America/Sao_Paulo"));
        System.out.println("São Paulo: " + saoPaulo);
        ZonedDateTime melbourne
                = ZonedDateTime.of(2014, 8, 30, 18, 0, 0, 0, ZoneId.of("Australia/Melbourne"));
        System.out.println("Melbourne " + melbourne);
        System.out.println("O dia e horário de São Paulo é o mesmo de Melbourne: " + saoPaulo.isEqual(melbourne));
        System.out.println("----------------------------------------------------");
        ZonedDateTime saoPaulo1
                = ZonedDateTime.of(2014, 8, 30, 18, 0, 0, 0, ZoneId.of("America/Sao_Paulo"));
        System.out.println("São Paulo: " + saoPaulo1);
        ZonedDateTime melbourne1
                = ZonedDateTime.of(2014, 8, 31, 7, 0, 0, 0, ZoneId.of("Australia/Melbourne"));
        System.out.println("Melbourne " + melbourne1);
        System.out.println(saoPaulo1.isEqual(melbourne1));
    }

    public void anoMes() {
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
        LocalDateTime dataHora = LocalDateTime.now();
        System.out.println(dataHora);
        System.out.println(dataHora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:MM:ss")));
        System.out.println("---------------------------------------------------");
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
