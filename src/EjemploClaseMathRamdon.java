import java.util.Random;

public class EjemploClaseMathRamdon {
    public static void main(String[] args) {

        String[] colores = {"azul", "verde", "rojo", "amarillo", "lila"};
        double ramdon = Math.random();
        System.out.println("ramdon = " + ramdon);
        ramdon *= 7;

        System.out.println("ramdon = " + ramdon);

        ramdon = Math.floor(ramdon);
        System.out.println("ramdon = " + ramdon);

        System.out.println("colores = " + colores[(int) ramdon]);

        Random randomObj = new Random();
        int randomInt = randomObj.nextInt(7);
        System.out.println("randomInt = " + randomInt);

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);
    }
}
