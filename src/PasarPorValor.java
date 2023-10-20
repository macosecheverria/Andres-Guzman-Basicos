public class PasarPorValor {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("Iniciamos el main: " + i);

        test(i);
    }
    static void test(int num){
        System.out.println("Iniciamos el metodo test: " + num);
        num = 26;
        System.out.println("Finaliza: " + num);
    }
}
