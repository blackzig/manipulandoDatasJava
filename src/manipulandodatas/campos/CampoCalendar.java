/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulandodatas.campos;

import java.util.Calendar;
import static java.util.Calendar.ALL_STYLES;
import static java.util.Calendar.DAY_OF_WEEK;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import manipulandodatas.metodos.MetodosCalendar;

/**
 *
 * @author Michel
 */
public class CampoCalendar {

    public void ALLSTYLES() {
        MetodosCalendar mc = new MetodosCalendar();
        Calendar hoje = mc.dataDeHoje();
        System.out.println("dia da semana>>> " + hoje.getDisplayName(DAY_OF_WEEK, 1, Locale.US));
        System.out.println("dia da semana>>> " + hoje.getDisplayName(DAY_OF_WEEK, 2, Locale.US));
        //Nope
        //  System.out.println("mostrarNome>>> " + hoje.getDisplayName(DAY_OF_WEEK, ALL_STYLES, Locale.US));
        //A style specifier for getDisplayNames indicating names in all styles, such as "January" and "Jan".
        /*
        field -- the calendar field.
        style -- the style that will be applied to the string representations
        locale -- the string representation locale
         */
    }

    public void am() {
        MetodosCalendar mc = new MetodosCalendar();
        Calendar hoje = mc.dataDeHoje();
        hoje.set(Calendar.AM_PM, Calendar.AM);
        System.out.println("am>>> " + hoje.getTime());
    }

    public void amPm() {
        MetodosCalendar mc = new MetodosCalendar();
        Calendar hoje = mc.dataDeHoje();
        hoje.set(Calendar.AM_PM, Calendar.AM_PM);
        System.out.println("amPm>>> " + hoje.getTime());
    }

    public void voltaOMes() {
        MetodosCalendar mc = new MetodosCalendar();
        Calendar hoje = mc.dataDeHoje();
        hoje.set(Calendar.MONTH, Calendar.APRIL);
        System.out.println("abril>>> " + hoje.getTime());
        hoje.set(Calendar.MONTH, Calendar.AUGUST);
        System.out.println("agosto>>> " + hoje.getTime());
    }

    public void saoCamposConfiguraveis() {
        //como usar o campo areFieldsSet? Não sei =P
        Calendar hoje = Calendar.getInstance();
        System.out.println("hoje>>> " + hoje.getTime());
    }

    public void capturarValoresDosCampos() {
        MetodosCalendar mc = new MetodosCalendar();
        Calendar hoje = mc.dataDeHoje();
        System.out.println("DATE " + Calendar.DATE);
        System.out.println("DAY_OF_MONTH " + Calendar.DAY_OF_MONTH);
        System.out.println("DAY_OF_WEEK " + Calendar.DAY_OF_WEEK);//número do dia da semana
        System.out.println("DAY_OF_WEEK_IN_MONTH " + Calendar.DAY_OF_WEEK_IN_MONTH);//está contando o mês anterior também =P
        System.out.println("DAY_OF_YEAR " + Calendar.DAY_OF_YEAR);//está capturando o primeiro dia da semana, correspondente ao dia que estou.  
        System.out.println("ERA: " + hoje.get(Calendar.ERA));

    }

    public void offSet() {
        //https://coderanch.com/t/416744/java/ZONE-OFFSET-DST-OFFSET
        MetodosCalendar mc = new MetodosCalendar();
        Calendar hoje = mc.dataDeHoje();
        System.out.println("hoje>>> " + hoje);
        int gmtOffset = hoje.get(Calendar.ZONE_OFFSET);
        System.out.println("GMT Offset is " + gmtOffset + " milliseonds (or "
                + TimeUnit.HOURS.convert(gmtOffset, TimeUnit.MILLISECONDS) + " hours)");
    }

    public void contadorDeCampos() {
        System.out.println("FIELD_COUNT " + Calendar.FIELD_COUNT);
        Calendar calendar = Calendar.getInstance();
        for (int i = 0; i < Calendar.FIELD_COUNT; i++) {
            System.out.println(calendar.get(i));
        }
                /*        
        ERA=1,
        YEAR=2017,
        MONTH=4,
        WEEK_OF_YEAR=20,
        WEEK_OF_MONTH=3,
        DAY_OF_MONTH=20,
        DAY_OF_YEAR=140,
        DAY_OF_WEEK=7,
        DAY_OF_WEEK_IN_MONTH=3,
        AM_PM=1,
        HOUR=4,
        HOUR_OF_DAY=16,
        MINUTE=47,
        SECOND=7,
        MILLISECOND=353,
        ZONE_OFFSET=-10800000,
        DST_OFFSET=0
                 */
    }

}
