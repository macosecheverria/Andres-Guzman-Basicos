public class PrimitivosFloat {
    public static void main(String[] args) {
        float realFloat = 0.000000015f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("Float corresponde a byte a: " + Float.BYTES);
        System.out.println("Float corresponde en bites a: " + Float.SIZE);
        System.out.println("Maximo valor de float: " + Float.MAX_VALUE);
        System.out.println("Minimo valo de float: " + Float.MIN_VALUE);

        double realDouble = 3.4028235E38;
        System.out.println("realDouble = " + realDouble);
        System.out.println("Double corresponde a byte a: " + Double.BYTES);
        System.out.println("Double corresponde en bites a: " + Double.SIZE);
        System.out.println("Maximo valor de double: " + Double.MAX_VALUE);
        System.out.println("Minimo valo de double: " + Double.MIN_VALUE);

        var varFlotante = 3.1416;
        System.out.println("varFlotante = " + varFlotante);
    }
}