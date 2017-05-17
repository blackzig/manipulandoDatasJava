/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulandodatas.metodos;

import java.time.Instant;
import java.util.Date;
import static java.util.Date.UTC;

/**
 *
 * @author Michel
 */
public class MetodosData {

    public void depois() {
        Date date = new Date();
        System.out.println("depois>>> " + date.after(date));
        Date d = new Date(2017 - 1900, 11, 12);
        System.out.println("depois>>> " + d.after(date));

        Date dateFail = new Date(2011, 5, 21);
        System.out.println("dateFail " + dateFail);

        Date dateNotFail = new Date(2011 - 1900, 5, 21);
        System.out.println("dateNotFail " + dateNotFail);
    }

    public void antes() {
        Date date = new Date();
        System.out.println("antes>>> " + date.before(date));
        Date d = new Date(2016 - 1900, 11, 12);
        System.out.println("antes>>> " + d.before(date));
    }

    public void clonar() {
        Date date = new Date();
        System.out.println("agora>>> " + date);
        System.out.println("clonado>>> " + date.clone());
    }

    public void comparar() {
        Date date = new Date();
        System.out.println("comparar hoje>>> data " + date + " | " + date.compareTo(date));//0
        Date antes = new Date(2016 - 1900, 11, 12);
        System.out.println("comparar antes>>> data " + antes + " | " + antes.compareTo(date));//-1
        Date depois = new Date(2017 - 1900, 11, 12);
        System.out.println("comparar depois>>> depois " + depois + " | " + depois.compareTo(date));//1
    }

    public void iguais() {
        Date date = new Date();
        Date hoje = new Date();
        Date antes = new Date(2016 - 1900, 11, 12);
        Date antesAux = new Date(2016 - 1900, 11, 12, 22, 30);
        System.out.println("iguais>>> " + date.equals(antes));
        System.out.println("iguais>>> " + date.equals(hoje));
        System.out.println("iguais>>> " + antes.equals(antesAux));
    }

    public void dateToInstant() {
        //a partir do Java 8
        /*
        http://stackoverflow.com/questions/8405087/what-is-this-date-format-2011-08-12t201746-384z
        The T is just a literal to separate the date from the time, 
        and the Z means "zero hour offset" also known as "Zulu time" (UTC). 
         */
        Date date = new Date();
        System.out.println("date>>> " + date);
        Instant inst = date.toInstant();
        System.out.println("inst>>> " + inst + " objeto da classe: " + inst.getClass().getName());
        instantToDate(inst);
    }

    public void instantToDate(Instant inst) {
        Date newDate = Date.from(inst);
        System.out.println("newDate>>> " + newDate);
    }

    public void pegueOMesDeprecated() {
        Date date = new Date();
        System.out.println("mês>>> " + date.getMonth());
    }

    public void pegueDiaDeprecated() {
        Date date = new Date();
        System.out.println("dia>>> " + date.getDate());
    }

    public void pegueDiaDaSemanaDeprecated() {
        Date date = new Date();
        System.out.println("dia da semana>>> " + date.getDay());
    }

    public void pegueHoraDeprecated() {
        Date date = new Date();
        System.out.println("hora>>> " + date.getHours());
    }

    public void pegueMinutosDeprecated() {
        Date date = new Date();
        System.out.println("minutos>>> " + date.getMinutes());
    }

    public void pegueSegundosDeprecated() {
        Date date = new Date();
        System.out.println("segundos>>> " + date.getSeconds());
    }

    public void pegueOsMilissegundos() {
        Date date = new Date();
        System.out.println("milissegundos>>> " + date.getTime());
        Date data = new Date(date.getTime());
        System.out.println("data " + data);
    }

    public void pegueOsMilissegundosAgoraDeprecated() {
        Date date = new Date();
        System.out.println("minutos>>> " + date.getTimezoneOffset());
    }

    public void pegueAnoDeprecated() {
        Date date = new Date();
        System.out.println("ano>>> " + date.getYear());
    }

    public void pegueHashCode() {
        //https://www.youtube.com/watch?v=AbRfF3yHB_Y
        Date antes = new Date(2016 - 1900, 11, 12);
        System.out.println("hashcode>>> " + antes.hashCode());
    }

    public void stringToDateMilissegundosDeprecated() {
        String s = "2/24/2009";
        System.out.println("transformar>>> " + Date.parse(s));

        Date dataAux = new Date(Date.parse(s));
        System.out.println("dataAux>>> " + dataAux);
    }

    public void setDiaDeprecated() {
        Date data = new Date();
        data.setDate(6);
        System.out.println("setDia>>> " + data);
    }

    public void setMesDeprecated() {
        Date data = new Date();
        data.setMonth(11);
        System.out.println("setMes>>> " + data);
    }

    public void setHoraDeprecated() {
        Date data = new Date();
        data.setHours(22);
        System.out.println("setHora>>> " + data);
    }

    public void setMinutosDeprecated() {
        Date data = new Date();
        data.setMinutes(30);
        System.out.println("setMinutos>>> " + data);
    }

    public void setSegundosDeprecated() {
        Date data = new Date();
        data.setSeconds(55);
        System.out.println("setSegundos>>> " + data);
    }

    public void setTempo() {
        Date data = new Date();
        data.setTime(1494639436965L);
        System.out.println("setSegundos>>> " + data);
    }

    public void setAno() {
        Date data = new Date();
        data.setYear(2016 - 1900);
        System.out.println("setAno>>> " + data);
    }

    public void gmtString() {
        Date data = new Date();
        System.out.println("gmtString>>> " + data.toGMTString());
        System.out.println("gmtString>>> " + data.toGMTString().getClass());
    }

    public void localeString() {
        Date data = new Date();
        System.out.println("localeString>>> " + data.toLocaleString());
        System.out.println("localeString>>> " + data.toLocaleString().getClass());
    }

    public void paraString() {
        Date data = new Date();
        System.out.println("paraString>>> " + data.toString());
        System.out.println("paraString>>> " + data.toString().getClass());
    }

    public void utc() {
        Long m = UTC(2009 - 1900, 1, 24, 0, 0, 0);
        System.out.println("utc>>> " + m);
        //UTC 1235433600000
        //Tue Feb 24 2009 00:00:00

        //Local 1235433600000
        //Mon Feb 23 2009 21:00:00
        //Local 1235444400000
        //Tue Feb 24 2009 00:00:00
    }
}
