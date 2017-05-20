/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulandodatas.metodos;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

/**
 *
 * @author Michel https://currentmillis.com/
 */

/*
http://www.tiexpert.net/programacao/java/heranca.php

Para fazermos uma classe herdar as características de uma outra, usamos a 
palavra reservada extends logo após a definicação do nome da classe.
 */

 /*
https://pt.stackoverflow.com/questions/23/qual-%C3%A9-a-diferen%C3%A7a-entre-modificadores-public-default-protected-e-private
    
Default: Tem acesso a um atributo default (identificado pela ausência de 
    modificadores) todas as classes que estiverem no mesmo pacote que a classe 
    que possui o atributo.

Protected: Esse é o que pega mais gente, ele é praticamente igual ao default, 
    com a diferença de que se uma classe (mesmo que esteja fora do pacote) 
    estende da classe com o atributo protected, ela terá acesso a ele. 
    Então o acesso é por pacote e por herança.
 */
public class MetodosCalendar extends GregorianCalendar {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    MetodosData md = new MetodosData();

    public Calendar dataDeHoje() {
        Calendar hoje = Calendar.getInstance();
        String data = sdf.format(hoje.getTime());
        System.out.println("data de hoje>>> " + data);
        return hoje;
    }

    public void dataModificada() {
        md.setTempo();
    }

    public void adicionar() {
        Calendar c = Calendar.getInstance();
        c.add(5, -1);
        System.out.println("adicionar>>> " + c);
        System.out.println("adicionar>>> " + sdf.format(c.getTime()));
        Calendar c1 = Calendar.getInstance();
        c1.add(Calendar.DAY_OF_MONTH, 1);
        System.out.println("adicionar>>> " + c1 + " mês " + Calendar.DAY_OF_MONTH);
        System.out.println("adicionar>>> " + sdf.format(c1.getTime()));
    }

    public void depois() {
        Calendar hoje = Calendar.getInstance();
        Calendar ontem = Calendar.getInstance();
        ontem.add(Calendar.DAY_OF_MONTH, -1);
        Calendar amanha = Calendar.getInstance();
        amanha.add(Calendar.DAY_OF_MONTH, 1);

        System.out.println("hoje>>> " + hoje.after(hoje));
        System.out.println("ontem>>> " + hoje.after(ontem));
        System.out.println("amanha>>> " + hoje.after(amanha));
    }

    public void antes() {
        Calendar hoje = Calendar.getInstance();
        Calendar ontem = Calendar.getInstance();
        ontem.add(Calendar.DAY_OF_MONTH, -1);
        Calendar amanha = Calendar.getInstance();
        amanha.add(Calendar.DAY_OF_MONTH, 1);

        System.out.println("hoje>>> " + hoje.before(hoje));
        System.out.println("ontem>>> " + hoje.before(ontem));
        System.out.println("amanha>>> " + hoje.before(amanha));
    }

    public void limpar() {
        Calendar hoje = dataDeHoje();
        hoje.clear();
        String data1 = sdf.format(hoje.getTime());
        System.out.println("data>>> " + data1);
    }

    public void limpar1() {
        Calendar hoje = dataDeHoje();
        //Calendar.YEAR ou digitar valor 1
        //Calendar.MONTH ou digitar valor 2
        hoje.clear(1);
        String data1 = sdf.format(hoje.getTime());
        System.out.println("data>>> " + data1);
    }

    public void clonar() {
        Calendar hoje = dataDeHoje();
        System.out.println("clonar>>> " + hoje.clone());
        Calendar agora = (Calendar) hoje.clone();
        String data = sdf.format(agora.getTime());
        System.out.println("agora>>> " + data);
    }

    public void compararPara() {
        System.out.println("com a Class Date");
        md.comparar();
        System.out.println("********************");
        Calendar hoje = Calendar.getInstance();
        String data = sdf.format(hoje.getTime());
        System.out.println("hoje " + data);

        Calendar ontem = Calendar.getInstance();
        ontem.add(Calendar.DAY_OF_MONTH, -1);
        String ontemStr = sdf.format(ontem.getTime());
        System.out.println("ontem " + ontemStr);

        Calendar amanha = Calendar.getInstance();
        amanha.add(Calendar.DAY_OF_MONTH, 1);
        String amanhaStr = sdf.format(amanha.getTime());
        System.out.println("amanhã " + amanhaStr);
        System.out.println("********************");

        System.out.println("comparar hoje>>> " + hoje.compareTo(hoje));
        System.out.println("comparar ontem>>> " + ontem.compareTo(hoje));
        System.out.println("comparar amanhã>>> " + amanha.compareTo(hoje));
    }

    public void completar() {
        MetodosCalendar mc = new MetodosCalendar();
        mc.set(GregorianCalendar.YEAR, 1998);
        mc.complete();
        String data = sdf.format(mc.getTime());
        System.out.println("completar>>> " + data);
    }

    public void computarCampos() {
        //Converts the current millisecond time value time to calendar field values in fields[].
        MetodosCalendar mc = new MetodosCalendar();
        mc.computeFields();
        System.out.println("mcF>>> " + mc);
        String data = sdf.format(mc.getTime());
        System.out.println("computarCampos>>> " + data);
    }

    public void computarTempo() {
        //Converts the current calendar field values in fields[] to the millisecond time value time.
        MetodosCalendar mc = new MetodosCalendar();
        mc.computeTime();
        System.out.println("mcT>>> " + mc);
        String data = sdf.format(mc.getTime());
        System.out.println("computarTempo>>> " + data);
    }

    public void iguais() {
        System.out.println("**********Class Date**********");
        md.iguais();
        System.out.println("**********Class Calendar**********");
        Calendar hoje = Calendar.getInstance();
        Calendar ontem = Calendar.getInstance();
        ontem.add(Calendar.DAY_OF_MONTH, -1);
        Calendar amanha = Calendar.getInstance();
        amanha.add(Calendar.DAY_OF_MONTH, 1);

        System.out.println("iguais hoje " + hoje.equals(hoje));
        System.out.println("iguais ontem " + hoje.equals(ontem));
        System.out.println("iguais amanhã " + hoje.equals(amanha));
    }

    public void pegar() {
        Calendar hoje = dataDeHoje();
        System.out.println("pegar>>> " + hoje.getTime());
        System.out.println("pegar YEAR>>> " + hoje.get(YEAR));
        System.out.println("pegar DATE>>> " + hoje.get(DATE));
        System.out.println("pegar MONTH>>> " + hoje.get(MONTH));
        System.out.println("pegar DAY_OF_MONTH>>> " + hoje.get(DAY_OF_MONTH));
        System.out.println("pegar HOUR>>> " + hoje.get(HOUR));
        System.out.println("pegar HOUR_OF_DAY>>> " + hoje.get(HOUR_OF_DAY));
    }

    public void pegarMaximo() {
        Calendar hoje = dataDeHoje();
        System.out.println("pegar>>> " + hoje.getTime());
        System.out.println("pegar YEAR>>> " + hoje.getMaximum(YEAR));
        System.out.println("pegar DATE>>> " + hoje.getMaximum(DATE));
        System.out.println("pegar MONTH>>> " + hoje.getMaximum(MONTH));
        System.out.println("pegar DAY_OF_MONTH>>> " + hoje.getMaximum(DAY_OF_MONTH));
        System.out.println("pegar HOUR>>> " + hoje.getMaximum(HOUR));
        System.out.println("pegar HOUR_OF_DAY>>> " + hoje.getMaximum(HOUR_OF_DAY));
    }

    public void pegarMinimo() {
        Calendar hoje = dataDeHoje();
        System.out.println("pegar>>> " + hoje.getTime());
        System.out.println("pegar YEAR>>> " + hoje.getMinimum(YEAR));
        System.out.println("pegar DATE>>> " + hoje.getMinimum(DATE));
        System.out.println("pegar MONTH>>> " + hoje.getMinimum(MONTH));
        System.out.println("pegar DAY_OF_MONTH>>> " + hoje.getMinimum(DAY_OF_MONTH));
        System.out.println("pegar HOUR>>> " + hoje.getMinimum(HOUR));
        System.out.println("pegar HOUR_OF_DAY>>> " + hoje.getMinimum(HOUR_OF_DAY));
    }

    public void tiposDeCalendariosAvaliados() {
        Set set = Calendar.getAvailableCalendarTypes();
        set.stream().forEach((s) -> {
            System.out.println(s);
        });
        // import java.time.chrono;
        //Class ThaiBuddhistChronology;
        //Class JapaneseChronology
        //Class JapaneseDate
    }

    public void locaisAvaliados() {
        Locale[] l = Calendar.getAvailableLocales();
        for (Locale lo : l) {
            System.out.println(lo);
        }
    }

    public void tipoCalendario() {
        Calendar hoje = dataDeHoje();
        System.out.println("tipo calendário>>> " + hoje.getCalendarType());
    }

    public void mostrarNome() {
        //https://www.tutorialspoint.com/java/util/calendar_getdisplayname.htm
        Calendar hoje = dataDeHoje();
        System.out.println("hoje " + hoje.getTime());
        System.out.println("mostrarNome>>> " + hoje.getDisplayName(DAY_OF_WEEK, ALL_STYLES, Locale.US));
        /*
        field -- the calendar field.
        style -- the style that will be applied to the string representations
        locale -- the string representation locale
         */
    }

    public void mostrarNomes() {
        Calendar hoje = dataDeHoje();
        System.out.println("hoje " + hoje.getTime());
        Map<String, Integer> map = hoje.getDisplayNames(DAY_OF_WEEK, 2, Locale.US);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }
    }

    public void primeiroDiaDaSemana() {
        Calendar hoje = dataDeHoje();
        System.out.println("primeiroDiaDaSemana>>> " + hoje.getFirstDayOfWeek());
        hoje.setFirstDayOfWeek(2);
        System.out.println("primeiroDiaDaSemana>>> " + hoje.getFirstDayOfWeek());
    }

    public void oMaiorNumeroMinimo() {
        Calendar hoje = dataDeHoje();
        System.out.println("oMaiorNumeroMinimo>>> " + hoje.getGreatestMinimum(DAY_OF_WEEK));
    }

    public void outraInstaciaDeLocal() {
        Calendar hoje = Calendar.getInstance(Locale.CANADA);
        System.out.println("outraInstaciaDeLocal>> " + hoje.getTime());
    }

    public void instanciaDeTempo() {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        Calendar calendar = Calendar.getInstance(timeZone);
        SimpleDateFormat simpleDateFormat
                = new SimpleDateFormat("EE MMM dd HH:mm:ss zzz yyyy", Locale.US);
        simpleDateFormat.setTimeZone(timeZone);
        System.out.println("instanciaDeTempo>> " + calendar.getTime());
        System.out.println("UTC:     " + simpleDateFormat.format(calendar.getTime()));
    }

    public void instanciaDeTempoLocal() {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        Calendar calendar = Calendar.getInstance(timeZone, Locale.US);
        SimpleDateFormat simpleDateFormat
                = new SimpleDateFormat("EE MMM dd HH:mm:ss zzz yyyy");
        simpleDateFormat.setTimeZone(timeZone);
        System.out.println("instanciaDeTempo>> " + calendar.getTime());
        System.out.println("UTC:     " + simpleDateFormat.format(calendar.getTime()));
    }

    public void peloMenosOMaximo() {
        Calendar hoje = dataDeHoje();
        System.out.println("peloMenosOMaximo>>> " + hoje.getLeastMaximum(DAY_OF_WEEK));
    }

    public void oMaximo() {
        Calendar hoje = dataDeHoje();
        System.out.println("oMaximo>>> " + hoje.getMaximum(DAY_OF_WEEK));
    }

    public void oMinimo() {
        Calendar hoje = dataDeHoje();
        System.out.println("oMinimo>>> " + hoje.getMinimum(DAY_OF_WEEK));
    }

    public void oPrimeiroDiaDaPrimeiraSemana() {
        Calendar hoje = dataDeHoje();
        System.out.println("oPrimeiroDiaDaPrimeiraSemana>>> " + hoje.getMinimalDaysInFirstWeek());
        hoje.setMinimalDaysInFirstWeek(2);
        System.out.println("oPrimeiroDiaDaPrimeiraSemana>>> " + hoje.getMinimalDaysInFirstWeek());
    }

    public void capturaAData() {
        Calendar hoje = dataDeHoje();
        System.out.println("capturaAData>>> " + hoje.getTime());
    }

    public void retornaOsMilissegundos() {
        Calendar hoje = dataDeHoje();
        System.out.println("retornaOsMilissegundos>>> " + hoje.getTimeInMillis());
        hoje.setTimeInMillis(1494639436965L);
        System.out.println("retornaOsMilissegundos>>> " + hoje.getTimeInMillis());
        System.out.println("data agora>>> " + hoje.getTime());
    }

    public void retornaTimeZone() {
        Calendar hoje = dataDeHoje();
        System.out.println("retornaTimeZone>>> " + hoje.getTimeZone());
        System.out.println("retornaTimeZone>>> " + hoje.getTimeZone().getDisplayName() + " data: " + hoje.getTime());
        TimeZone tz = TimeZone.getTimeZone("GMT");
        hoje.setTimeZone(tz);
        System.out.println("retornaTimeZone modificado>>> " + hoje.getTimeZone());
        System.out.println("retornaTimeZone modificado>>> " + hoje.getTimeZone().getDisplayName() + " data: " + hoje.getTime());
    }

    public void numerosDeSemanasNoAno() {
        Calendar hoje = dataDeHoje();
        System.out.println("numerosDeSemanasNoAno>>> " + hoje.getWeeksInWeekYear());
    }

    public void retornaOAno() {
        Calendar hoje = dataDeHoje();
        System.out.println("retornaOAno>>> " + hoje.getWeekYear());
    }

    public void codigoHash() {
        Calendar hoje = dataDeHoje();
        System.out.println("codigoHash>>> " + hoje.hashCode());
    }

    public void capturaInterna() {
        MetodosCalendar mc = new MetodosCalendar();
        System.out.println("capturaInterna>>> " + mc.internalGet(DAY_OF_WEEK));
    }

    public void leniente() {
        Calendar hoje = dataDeHoje();
        System.out.println("leniente>>> " + hoje.isLenient());
        hoje.setLenient(false);
        System.out.println("leniente>>> " + hoje.isLenient());
    }

    public void ehSet() {
        Calendar hoje = dataDeHoje();
        System.out.println("ehSet>>> " + hoje.isSet(DAY_OF_WEEK));
        hoje.clear();
        System.out.println("ehSet>>> " + hoje.isSet(DAY_OF_WEEK));
    }

    public void estaSemanaESuportada() {
        Calendar hoje = dataDeHoje();
        System.out.println("estaSemanaESuportada>>> " + hoje.isWeekDateSupported() + " data " + hoje.getTime());
        hoje.setWeekDate(2017, 49, 4);
        System.out.println("estaSemanaESuportada>>> " + hoje.isWeekDateSupported() + " data " + hoje.getTime());
    }

    public void rolar() {
        Calendar hoje = dataDeHoje();
        hoje.roll(Calendar.MONTH, true);
        System.out.println("Para frente>>> " + hoje.getTime());
        Calendar hoje1 = dataDeHoje();
        hoje1.roll(Calendar.MONTH, false);
        System.out.println("Para trás>>> " + hoje1.getTime());
    }

    public void rolar1() {
        Calendar hoje = dataDeHoje();
        hoje.roll(Calendar.MONTH, 1);
        System.out.println("Para frente>>> " + hoje.getTime());
        Calendar hoje1 = dataDeHoje();
        hoje1.roll(Calendar.MONTH, -1);
        System.out.println("Para trás>>> " + hoje1.getTime());
    }

    public void configurar() {
        Calendar hoje = dataDeHoje();
        hoje.set(Calendar.MONTH, 11);
        System.out.println("configurar>>> " + hoje.getTime());
    }

    public void configuracaoTotalData() {
        Calendar hoje = dataDeHoje();
        hoje.set(1978, 11, 6);
        System.out.println("mudar data>>> " + hoje.getTime());
        hoje.set(1978, 11, 6, 22, 0);
        System.out.println("mudar horário>>> " + hoje.getTime());
        hoje.set(1978, 11, 6, 22, 0, 30);
        System.out.println("mudar horário e segundos>>> " + hoje.getTime());
    }

    public void instante() {
        Calendar hoje = dataDeHoje();
        Instant inst = hoje.toInstant();
        System.out.println("inst>>> " + inst + " objeto da classe: " + inst.getClass().getName());
        Date newDate = Date.from(inst);
        System.out.println("newDate>>> " + newDate);
    }
    
    public void paraString(){
        Calendar hoje = dataDeHoje();
        System.out.println("paraString>>> " + hoje.toString());        
        System.out.println("paraString>>> " + hoje.toString().getClass());
    }
}
