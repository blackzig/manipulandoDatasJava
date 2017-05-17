/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulandodatas.metodos;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Michel https://currentmillis.com/
 */
public class MetodosCalendar {

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

}
