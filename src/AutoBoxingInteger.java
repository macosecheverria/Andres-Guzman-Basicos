public class AutoBoxingInteger {
    public static void main(String[] args) {
        Integer[] numeros = {1,2,3,4,5,6,7,8,9,10};
        int suma = 0;

        /*for(var i: numeros){
            if(i.intValue()%2==0){
                suma += i.intValue();
            }
        }*/

        for(var i: numeros){
            if(i%2==0){
                suma += i;
            }
        }
        System.out.println("suma = " + suma);
    }
}
