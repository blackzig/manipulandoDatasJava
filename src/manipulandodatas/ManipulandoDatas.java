/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulandodatas;

import java.text.ParseException;
import manipulandodatas.construtores.ConstrutoresData;
import manipulandodatas.metodos.MetodosCalendar;

/**
 *
 * @author Michel
 */
public class ManipulandoDatas {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {

        /**
         * ********Construtores*********
         */
        ConstrutoresData cd = new ConstrutoresData();
        cd.construtorDate();
        cd.construtorDateDeprecated();
        cd.construtorDateDeprecatedComHorario();
        cd.construtorDateDeprecatedComHorarioESegundos();
        cd.construtorDateMilissegundos();
        cd.construtorDateDeprecatedComString();

        /**
         * ********Métodos*********
         */
        /* MetodosData md = new MetodosData();
        md.depois();
        System.out.println("---------------------------------------------------");
        md.antes();
        System.out.println("---------------------------------------------------");
        md.clonar();
        System.out.println("---------------------------------------------------");
        md.comparar();
        System.out.println("---------------------------------------------------");
        md.iguais();
        System.out.println("---------------------------------------------------");
        md.dateToInstant();
        System.out.println("---------------------------------------------------");
        md.pegueDiaDeprecated();
        System.out.println("---------------------------------------------------");
        md.pegueOMesDeprecated();
        System.out.println("---------------------------------------------------");
        md.pegueDiaDaSemanaDeprecated();
        System.out.println("---------------------------------------------------");
        md.pegueHoraDeprecated();
        System.out.println("---------------------------------------------------");
        md.pegueMinutosDeprecated();
        System.out.println("---------------------------------------------------");
        md.pegueSegundosDeprecated();
        System.out.println("---------------------------------------------------");
        md.pegueOsMilissegundos();
        System.out.println("---------------------------------------------------");
        md.pegueOsMilissegundosAgoraDeprecated();
        System.out.println("---------------------------------------------------");
        md.pegueAnoDeprecated();
        System.out.println("---------------------------------------------------");
        md.pegueHashCode();
        System.out.println("---------------------------------------------------");
        md.stringToDateMilissegundosDeprecated();
        System.out.println("---------------------------------------------------");
        md.setDiaDeprecated();
        System.out.println("---------------------------------------------------");
        md.setMesDeprecated();
        System.out.println("---------------------------------------------------");
        md.setHoraDeprecated();
        System.out.println("---------------------------------------------------");
        md.setMinutosDeprecated();
        System.out.println("---------------------------------------------------");
        md.setSegundosDeprecated();
        System.out.println("---------------------------------------------------");
        md.setTempo();
        System.out.println("---------------------------------------------------");
        md.setAno();
        System.out.println("---------------------------------------------------");
        md.gmtString();
        System.out.println("---------------------------------------------------");
        md.localeString();
        System.out.println("---------------------------------------------------");
        md.paraString();
        System.out.println("---------------------------------------------------");
        md.utc();
         */
        /**
         * ********Construtores class Calendar*********
         */
        /*   ConstrutoresCalendar cc = new ConstrutoresCalendar();
        System.out.println("---------------------------------------------------");
        cc.calendario();
        System.out.println("---------------------------------------------------");
        cc.calendario1();
         */
        /**
         * ********Métodos class Calendar*********
         */
        MetodosCalendar mc = new MetodosCalendar();
        System.out.println("---------------------------------------------------");
        mc.adicionar();
        System.out.println("----------------------AFTER------------------------");
        mc.depois();
        System.out.println("----------------------BEFORE-----------------------");
        mc.antes();
        System.out.println("----------------------CLEAR------------------------");
        mc.limpar();
        System.out.println("----------------------CLEAR()----------------------");
        mc.limpar1();
        System.out.println("---------------------------------------------------");
        mc.clonar();
        System.out.println("---------------------------------------------------");
        mc.compararPara();
        System.out.println("---------------------------------------------------");
        mc.completar();
        System.out.println("--------------------------?------------------------");
        mc.computarCampos();
        System.out.println("--------------------------?------------------------");
        mc.computarTempo();
        System.out.println("---------------------------------------------------");
        mc.iguais();
        System.out.println("---------------------------------------------------");
        mc.pegar();
    }

}
