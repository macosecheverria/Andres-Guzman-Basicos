class Persona{
    private String nombre;

     void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    String getNombre(){
         return nombre;
    }
}
public class PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Marcos");

        System.out.println("Iniciamos el main: ");
        System.out.println("persona = " + persona.getNombre());

        System.out.println("Antes de llamar al metodo test");
        test(persona);
        System.out.println("Despues de llamar al metodo test");
        System.out.println("persona.nombre" + persona.getNombre());
        System.out.println("Finaliza el metodo main con los datos del arreglo modificados");
    }
    static void test(Persona persona){
        System.out.println("Iniciamos el metodo test: ");
        persona.setNombre("Marquinho");
        System.out.println("Finaliza el metodo test");
    }
}
