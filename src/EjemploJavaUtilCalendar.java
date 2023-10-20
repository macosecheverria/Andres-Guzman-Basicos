import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();

        calendario.set(2021, 8,20, 23,40,56);
        calendario.set(Calendar.YEAR, 2020);
        calendario.set(Calendar.MONTH, 10);
        calendario.set(Calendar.DAY_OF_MONTH, 40);
        calendario.set(Calendar.DAY_OF_YEAR, 304);
        calendario.set(Calendar.HOUR, 23);
        calendario.set(Calendar.MINUTE, 40);
        calendario.set(Calendar.SECOND, 20);
        calendario.set(Calendar.MILLISECOND,300);

        Date fecha = calendario.getTime();
        System.out.println("fecha sin formato = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fechaConFormato = formato.format(fecha);
        System.out.println("fecha con formato = " + fechaConFormato);
    }
}
