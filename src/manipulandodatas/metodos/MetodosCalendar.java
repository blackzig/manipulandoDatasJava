/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulandodatas.metodos;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

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
    
    

}
