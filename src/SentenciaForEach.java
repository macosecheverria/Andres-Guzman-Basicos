public class SentenciaForEach {
    public static void main(String[] args) {
        Integer[] numerosPrimos = {1,2,3,5,7,9,11,15,17,19};
        for(var num: numerosPrimos){
            System.out.println(num);
        }

        String[] nombres = {"Marcos", "Juan", "Selva", "Juana", "Renato"};
        for(var nombre: nombres){
            System.out.println(nombre);
        }
    }
}
