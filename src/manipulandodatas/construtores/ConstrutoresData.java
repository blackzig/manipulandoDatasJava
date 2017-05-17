/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulandodatas.construtores;

import java.util.Date;

/**
 *
 * @author Michel
 */
public class ConstrutoresData {

    public void construtorDate() {
        Date date = new Date();
        System.out.println("date " + date);
    }

    public void construtorDateDeprecated() {
        Date date = new Date(2017 - 1900, 4, 12);
        System.out.println("date " + date);
    }

    public void construtorDateDeprecatedComHorario() {
        Date date = new Date(2017 - 1900, 4, 12, 22, 30);
        System.out.println("date " + date);
    }

    public void construtorDateDeprecatedComHorarioESegundos() {
        Date date = new Date(2017 - 1900, 4, 12, 22, 30, 50);
        System.out.println("date " + date);
    }

    public void construtorDateMilissegundos() {
        //https://currentmillis.com/
        Date date = new Date(1494639436965L);
        System.out.println("date " + date);
    }

    public void construtorDateDeprecatedComString() {
        Date date = new Date("May 12 2017");
        System.out.println("date " + date);
    }
}
