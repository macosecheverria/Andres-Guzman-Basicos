public class PrimitivosEnteros {
    public static void main(String[] args) {
        byte numeroByte = 127;
        System.out.println("NumeroByte: " + numeroByte);
        System.out.println("Tipo Byte corresponde en byte a: " + Byte.BYTES);
        System.out.println("Tipo Byte corresponde a bities a: " + Byte.SIZE);
        System.out.println("Valor maximo de un byte" + Byte.MAX_VALUE);
        System.out.println("Valor minimo de un byte" + Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("NumeroShort: " + numeroShort);
        System.out.println("Tipo Short corresponde en byte a: " + Short.BYTES);
        System.out.println("Tipo Short corresponde a bities a: " + Short.SIZE);
        System.out.println("Valor maximo de un short" + Short.MAX_VALUE);
        System.out.println("Valor minimo de un short" + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("NumeroInt: " + numeroInt);
        System.out.println("Tipo int corresponde en byte a: " + Integer.BYTES);
        System.out.println("Tipo Int corresponde a bities a: " + Integer.SIZE);
        System.out.println("Valor maximo de un short: " + Integer.MAX_VALUE);
        System.out.println("Valor minimo de un short: " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("NumeroLong: " + numeroLong);
        System.out.println("Tipo Long corresponde en byte a: " + Long.BYTES);
        System.out.println("Tipo Long corresponde a bities a: " + Long.SIZE);
        System.out.println("Valor maximo de un short: " + Long.MAX_VALUE);
        System.out.println("Valor minimo de un short: " + Long.MIN_VALUE);
    }
}
