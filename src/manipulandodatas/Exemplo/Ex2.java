/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulandodatas.Exemplo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author Michel
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

}
