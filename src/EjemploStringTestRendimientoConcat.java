public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = "a";

        StringBuilder sb = new StringBuilder(a);

        Long inicio = System.currentTimeMillis();

        for(int i = 0; i < 10000; i++){
            sb.append(a).append(b).append("\n");

        }

        System.gc();

        Long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
        System.exit(0);
    }
}
