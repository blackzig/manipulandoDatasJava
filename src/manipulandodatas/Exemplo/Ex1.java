/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulandodatas.Exemplo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Michel
 *
 * Construtor Date()
 *
 * Métodos after(Date when) before(Date when) clone() compareTo(Date
 * anotherDate) equals(Object obj) from(Instant instant) getTime() hashCode()
 * setTime(long time) toInstant() toString()
 */
public class Ex1 {

    public void dataAgoraComAClasseDate() {
        Date data = new Date();
        System.out.println("Data Agora: " + data);
    }

    public void dataAgoraComAClasseCalendar() {
        Calendar c = Calendar.getInstance();
        System.out.println("Data e Hora atual: " + c.getTime());
        System.out.println("Ano: " + c.get(Calendar.YEAR));
        System.out.println("Mês: " + c.get(Calendar.MONTH));
        System.out.println("Dia do Mês: " + c.get(Calendar.DAY_OF_MONTH));
    }

    public void modificarData() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 1995);
        c.set(Calendar.MONTH, Calendar.MARCH);
        c.set(Calendar.DAY_OF_MONTH, 20);

        System.out.println("Data e Hora atual: " + c.getTime());
        System.out.println("Ano: " + c.get(Calendar.YEAR));
        System.out.println("Mês: " + c.get(Calendar.MONTH));
        System.out.println("Dia do Mês: " + c.get(Calendar.DAY_OF_MONTH));
    }

    public void formatacaoData() {
        Calendar c = Calendar.getInstance();
        System.out.println("Data atual sem formatação: " + c.getTime());
        //Formata a data
        DateFormat formataData = DateFormat.getDateInstance();
        //método format sempre retorna uma String
        System.out.println("Data atual com formatação: " + formataData.format(c.getTime()));
        DateFormat hora = DateFormat.getTimeInstance();
        //Formata Hora
        System.out.println("Hora formatada: " + hora.format(c.getTime()));

        //Formata Data e Hora
        DateFormat dtHora = DateFormat.getDateTimeInstance();
        System.out.println(dtHora.format(c.getTime()));
    }

    public void formatacaoDataBrasil() {
        Calendar c = Calendar.getInstance();
        DateFormat f = DateFormat.getDateInstance(DateFormat.FULL); //Data COmpleta
        System.out.println("Data brasileira: " + f.format(c.getTime()));

        f = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println("Data sem o dia descrito: " + f.format(c.getTime()));

        f = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println("Data resumida 1: " + f.format(c.getTime()));

        f = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println("Data resumida 2: " + f.format(c.getTime()));
    }

    public void converterDatas() throws ParseException {
        //BRST = Brasília Summer Time (Time Zone Abbreviation)
        DateFormat f = DateFormat.getDateInstance();
        Date data2 = f.parse("12/01/1995");
        System.out.println(data2);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Data formatada: " + sdf.format(data2)); //retorna String

        //Converte Objetos
        System.out.println("Data convertida: " + sdf.parse("12/01/1995"));//retorna Date
    }

    public void dataConformeOLocal() {
        Calendar c = Calendar.getInstance();
        Date data = c.getTime();

        Locale brasil = new Locale("pt", "BR"); //Retorna do país e a língua
        Locale eua = Locale.US;
        Locale italia = Locale.ITALIAN;

        DateFormat f2 = DateFormat.getDateInstance(DateFormat.FULL, brasil);
        System.out.println("Data e hora brasileira: " + f2.format(data));

        DateFormat f3 = DateFormat.getDateInstance(DateFormat.FULL, eua);
        System.out.println("Data e hora US: " + f3.format(data));

        DateFormat f4 = DateFormat.getDateInstance(DateFormat.FULL, italia);
        System.out.println("Data e hora Italian: " + f4.format(data));
    }

}
