public class EjemploMetodoGetClass {
    public static void main(String[] args) {
        String texto = "Hola que tal";
        Class strClass = texto.getClass();

        System.out.println("strClass = " + strClass);
        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName());
        System.out.println("strClass.getSimpleName() = " + strClass.getPackageName());
        
        for(var i: strClass.getMethods()){
            System.out.println("i.getName() = " + i.getName());
        }

        Integer num = 34;
        Class intClass = num.getClass();
        Class objClass = intClass.getSuperclass().getSuperclass();
        System.out.println("intClass.getSimpleName() = " + intClass.getSimpleName());
        System.out.println("objClass = " + objClass);

        for(var i: objClass.getMethods()){
            System.out.println("i.getName() = " + i.getName());
        }
    }
}
