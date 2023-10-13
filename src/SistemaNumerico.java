import javax.swing.*;

public class SistemaNumerico {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero");

        int numeroDecimal= 0;

        try {
            numeroDecimal = Integer.parseInt(numeroStr);

        }catch (NumberFormatException error){
            JOptionPane.showMessageDialog(null, "Error, el numero a digitar debe de ser un numero");
            main(args);
            System.exit(0);
        }


        System.out.println("numeroDecimal = " + numeroDecimal);

        String mensajeBinario = "numero de binario de = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(mensajeBinario);

        int numeroBinario = 0b11110;
        System.out.println("numeroBinario = " + numeroBinario);

        String mensajeOctal = "numero octal de = " + numeroDecimal + " = " + Integer.toOctalString(numeroBinario);
        System.out.println(mensajeOctal);

        int numeroOctal = 036;
        System.out.println("numeroOctal = " + numeroOctal);

        String mensajeHexa = "numero hexagecimal de = " + numeroDecimal + " = " + Integer.toOctalString(numeroBinario);
        System.out.println(mensajeHexa);

        int numeroHex = 0x1e;
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = mensajeBinario;
        mensaje += "\n" + mensajeOctal;
        mensaje += "\n" + mensajeHexa;

        JOptionPane.showConfirmDialog(null, mensaje);
    }
}
