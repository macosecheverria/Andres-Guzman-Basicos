import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {
        Date fecha = new Date();
        System.out.println("fecha = " + fecha);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM, yyyy");
        String fechaStr = dateFormat.format(fecha);
        System.out.println("fechaStr = " + fechaStr);
        
        long j = 0;
        for(int i = 0; i < 1000000; i++){
            j += i;            
        }

        System.out.println("j = " + j);
        
        Date fecha2 = new Date();
        long tiempoFinal = fecha.getTime() - fecha2.getTime();
        System.out.println("Tiempo transcurrido en el for= " + tiempoFinal);
    }
}
