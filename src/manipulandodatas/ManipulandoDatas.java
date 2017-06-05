/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulandodatas;

import java.text.ParseException;
import manipulandodatas.Exemplo.Ex1;
import manipulandodatas.Exemplo.Ex2;
import manipulandodatas.Exemplo.Ex3;
import manipulandodatas.JavaTime.Duracao;
import manipulandodatas.JavaTime.Relogio;
import manipulandodatas.apresentacao.Principal;
import manipulandodatas.campos.CampoCalendar;
import manipulandodatas.construtores.ConstrutoresData;
import manipulandodatas.metodos.MetodosCalendar;
import manipulandodatas.view.Inicio;

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

        /*Mostrar exemplos visual*/
        // Inicio i = new Inicio();
        //i.setVisible(true);

        /*Class comparações Date, Calendar e Java.time*/
 /*
        Principal p = new Principal();
        System.out.println("*******************dataAgora()********************");
        p.dataAgora();
        System.out.println("**********configuraDataComMilissegundos()*********");
        p.configuraDataComMilissegundos();
        System.out.println("******************fusoHorarios()******************");
        p.fusoHorarios();
        System.out.println("*****************incrementoData()*****************");
        p.incrementoData();
        System.out.println("*****************alterarAno()*********************");
        p.alterarAno();
        System.out.println("****************alterarData()*********************");
        p.alterarData();
        System.out.println("**************dataPreDefinida()*******************");
        p.dataPreDefinida();
        System.out.println("***************compararDatas()********************");
        p.compararDatas();
        System.out.println("*****compararDatasDeTimeZonesDiferentes()*********");
        p.compararDatasDeTimeZonesDiferentes();
        System.out.println("********************anoMes()**********************");
        p.anoMes();
        System.out.println("*****************diasDoAnoEMes()******************");
        p.diasDoAnoEMes();
        System.out.println("*******************metodosAt()********************");
        p.metodosAt();
        System.out.println("******************criandoData()*******************");
        p.criandoData();
        System.out.println("*************comparandoDiasDaSemana()*************");
        p.comparandoDiasDaSemana();
        System.out.println("*****************formatandoData()*****************");
        p.formatandoData();
        System.out.println("**************compararDatasChrono()***************");
        p.compararDatasChrono();
        System.out.println("******************dataPeriodo()*******************");
        p.dataPeriodo();
         */
 /*JAVA TIME*/
        Duracao d = new Duracao();
        d.abs1();
        System.out.println("**************************************************");
        d.adicionarTempo();
        System.out.println("**************************************************");
        d.entre();
        System.out.println("**************************************************");
        d.comparar();
        System.out.println("**************************************************");
        d.divididoPor();
        System.out.println("**************************************************");
        d.igual();
        System.out.println("**************************************************");
        d.origem();
        System.out.println("**************************************************");
        d.capturar();
        System.out.println("**************************************************");
        d.capturarNano();
        System.out.println("**************************************************");
        d.capturarSegundo();
        System.out.println("**************************************************");
        d.capturarUnidade();
        System.out.println("**************************************************");
        d.codigoHash();
        System.out.println("**************************************************");
        d.ehNegativo();
        System.out.println("**************************************************");
        d.ehZero();
        /*Relogio*/
 /*
        Relogio r = new Relogio();
        r.ehIgual();
        System.out.println("**************************************************");
        r.fixado();
        System.out.println("**************************************************");
        r.captureAZone();
        System.out.println("**************************************************");
        r.codigoHash();
        System.out.println("**************************************************");
        r.instante();
        System.out.println("**************************************************");
        r.millissegundos();
        System.out.println("**************************************************");
        r.offConfiguracao();
        System.out.println("**************************************************");
        r.sistema();
        System.out.println("**************************************************");
        r.sistemaPadrao();
        System.out.println("**************************************************");
        r.sistemaUTC();
        System.out.println("**************************************************");
        r.tiqueTaque();
        System.out.println("**************************************************");
        r.tiqueTaqueMinutos();
        System.out.println("**************************************************");
        r.tiqueTaqueSegundos();
        System.out.println("**************************************************");
        r.comZona();
         */
 /*
        Ex3 e3 = new Ex3();
        e3.Elly();
         */

 /*
        Ex2 e2 = new Ex2();
        e2.capturaHoje();
        System.out.println("---------------------------------------------------");
        e2.fusoHorarios();
        System.out.println("---------------------------------------------------");
        e2.incrementoData();
        System.out.println("---------------------------------------------------");
        e2.capturarAno();
        System.out.println("---------------------------------------------------");
        e2.alterarData();
        System.out.println("---------------------------------------------------");
        e2.metodoOf();
        System.out.println("---------------------------------------------------");
        e2.compararDatas();
        System.out.println("---------------------------------------------------");
        e2.compararDatasDeTimeZonesDiferentes();
        System.out.println("---------------------------------------------------");
        e2.anoMes();
        System.out.println("---------------------------------------------------");
        e2.diasDoAnoEMes();
        System.out.println("---------------------------------------------------");
        e2.metodosAt();
        System.out.println("---------------------------------------------------");
        e2.criandoData();
        System.out.println("---------------------------------------------------");
        e2.comparandoDiasDaSemana();
        System.out.println("---------------------------------------------------");
        e2.formatandoData();
        System.out.println("---------------------------------------------------");
        e2.compararDatasChrono();
        System.out.println("---------------------------------------------------");
        e2.dataPeriodo();
         */
 /*
        Ex1 e1 = new Ex1();
        e1.dataAgoraComAClasseDate();
        System.out.println("---------------------------------------------------");
        e1.dataAgoraComAClasseCalendar();
        System.out.println("---------------------------------------------------");
        e1.modificarData();
        System.out.println("---------------------------------------------------");
        e1.formatacaoData();
        System.out.println("---------------------------------------------------");
        e1.formatacaoDataBrasil();
        System.out.println("---------------------------------------------------");
        e1.converterDatas();
        System.out.println("---------------------------------------------------");
        e1.dataConformeOLocal();        
         */
        /**
         * ********Construtores class Date*********
         */
        /*
        ConstrutoresData cd = new ConstrutoresData();
        cd.construtorDate();
        cd.construtorDateDeprecated();
        cd.construtorDateDeprecatedComHorario();
        cd.construtorDateDeprecatedComHorarioESegundos();
        cd.construtorDateMilissegundos();
        cd.construtorDateDeprecatedComString();
         */
        /**
         * ********Métodos class Date*********
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
        /*
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
        System.out.println("---------------------------------------------------");
        mc.pegarMaximo();
        System.out.println("---------------------------------------------------");
        mc.pegarMinimo();
        System.out.println("---------------------------------------------------");
        mc.tiposDeCalendariosAvaliados();
        System.out.println("---------------------------------------------------");
        mc.locaisAvaliados();
        System.out.println("---------------------------------------------------");
        mc.tipoCalendario();
        System.out.println("---------------------------------------------------");
        mc.mostrarNome();
        System.out.println("---------------------------------------------------");
        mc.mostrarNomes();
        System.out.println("---------------------------------------------------");
        mc.primeiroDiaDaSemana();
        System.out.println("---------------------------------------------------");
        mc.oMaiorNumeroMinimo();
        System.out.println("---------------------------------------------------");
        mc.outraInstaciaDeLocal();
        System.out.println("---------------------------------------------------");
        mc.instanciaDeTempo();
        System.out.println("---------------------------------------------------");
        mc.instanciaDeTempoLocal();
        System.out.println("---------------------------------------------------");
        mc.peloMenosOMaximo();
        System.out.println("---------------------------------------------------");
        mc.oMaximo();
        System.out.println("---------------------------------------------------");
        mc.oMinimo();
        System.out.println("---------------------------------------------------");
        mc.oPrimeiroDiaDaPrimeiraSemana();
        System.out.println("---------------------------------------------------");
        mc.capturaAData();
        System.out.println("---------------------------------------------------");
        mc.retornaOsMilissegundos();
        System.out.println("---------------------------------------------------");
        mc.retornaTimeZone();
        System.out.println("---------------------------------------------------");
        mc.numerosDeSemanasNoAno();
        System.out.println("---------------------------------------------------");
        mc.retornaOAno();
        System.out.println("---------------------------------------------------");
        mc.codigoHash();
        System.out.println("---------------------------------------------------");
        mc.capturaInterna();
        System.out.println("---------------------------------------------------");
        mc.leniente();
        System.out.println("---------------------------------------------------");
        mc.ehSet();
        System.out.println("---------------------------------------------------");
        mc.estaSemanaESuportada();
        System.out.println("---------------------------------------------------");
        mc.rolar();
        System.out.println("---------------------------------------------------");
        mc.rolar1();
        System.out.println("---------------------------------------------------");
        mc.configurar();
        System.out.println("---------------------------------------------------");
        mc.configuracaoTotalData();
        System.out.println("--------------------Class Date---------------------");
        mc.dataModificada();
        System.out.println("---------------------------------------------------");
        mc.instante();
        System.out.println("---------------------------------------------------");
        mc.paraString();*/
        /**
         * ********Campos class Calendar*********
         */
        /*
        CampoCalendar cc = new CampoCalendar();
        System.out.println("-------------------ALL_STYLES----------------------");
        cc.ALLSTYLES();
        System.out.println("-------------------AM------------------------------");
        cc.am();
        System.out.println("-------------------PM------------------------------");
        cc.pm();
        System.out.println("-------------------AM_PM---------------------------");
        cc.amPm();
        System.out.println("---------------------------------------------------");
        cc.voltaOMes();
        //System.out.println("---------------------------------------------------");
        //cc.saoCamposConfiguraveis();
        System.out.println("---------------------------------------------------");
        cc.capturarValoresDosCampos();
        System.out.println("---------------------------------------------------");
        cc.offSet();
        System.out.println("---------------------------------------------------");
        cc.contadorDeCampos();
         */
    }

}
