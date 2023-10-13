public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = 'h';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal == caracter: = " + (decimal == caracter));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo == caracter = " + (simbolo == caracter));

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("char corresponde en bytes = " + Character.BYTES);
        System.out.println("char corresponde en bities = " + Character.SIZE);
        System.out.println("char con el mayor valor = " + Character.MAX_VALUE);
        System.out.println("char con el menor valor = " + Character.MIN_VALUE);

    }
}
