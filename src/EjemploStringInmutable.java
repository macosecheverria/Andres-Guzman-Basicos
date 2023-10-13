public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String profesor = "Andres Guzman";

        String resultado = curso.concat(profesor);
        System.out.println(curso);
        System.out.println(resultado);
        System.out.println(curso == resultado);

        String resultado2 = curso.transform(c -> c.concat(profesor));
        System.out.println(resultado2);

        String resultado3 = resultado.replace("a", "A");
        System.out.println(resultado3);
    }
}
