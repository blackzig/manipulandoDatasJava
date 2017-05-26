/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulandodatas.Exemplo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Michel
 */
public class Ex3 {

    public void Elly() {
        Calendar cal = Calendar.getInstance();
        String aktdat = cal.get(Calendar.DAY_OF_MONTH) + "." + (cal.get(Calendar.MONTH) + 1) + "." + cal.get(Calendar.YEAR);
        System.out.println(aktdat);
        String akttime = cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE);
        System.out.println(akttime);

        if ("10.06.2017".equals(aktdat) && "12:00".equals(akttime)) {
            System.out.println("Hello, World!");
        }

        EllyPlus();
    }

    private void EllyPlus() {
        System.out.println("--------------------------------------------------");
        LocalDateTime dataHoraAtual = LocalDateTime.now();
        System.out.println("Data e horário: " + dataHoraAtual);

        LocalDate dataAtual = LocalDate.now();
        System.out.println("Data: " + dataAtual);

        String dataHojeBR = dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Hoje: " + dataHojeBR);

        LocalTime dataHora = LocalTime.now();
        System.out.println("Horário: " + dataHora);
        
        String horarioHoje = dataHora.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println("Horário sem os nanossegudos: " + horarioHoje);        
    }

}
