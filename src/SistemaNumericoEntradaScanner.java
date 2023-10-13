import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaNumericoEntradaScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        //String numeroStr = scanner.nextLine();
        int numeroDecimal= 0;

        try {
            numeroDecimal = scanner.nextInt();

        }catch (Exception error){
            System.out.println("Error se debe de ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String mensajeBinario = "numero de binario de = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String mensajeOctal = "numero octal de = " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String mensajeHexa = "numero hexagecimal de = " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        String mensaje = mensajeBinario;
        mensaje += "\n" + mensajeOctal;
        mensaje += "\n" + mensajeHexa;

        System.out.println(mensaje);
    }
}
