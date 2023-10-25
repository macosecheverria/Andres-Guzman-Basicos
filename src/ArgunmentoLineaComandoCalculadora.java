public class ArgunmentoLineaComandoCalculadora {
    public static void main(String[] args) {

        if(args.length != 3) System.out.println("Por favor ingresar una operacion y dos numeros enteros" +
                "(suma, resta, div, multi)");

        String operacion = args[0];
        int a = 0;
        int b = 0;
        double resultado = 0.0;

        try {
            a = Integer.parseInt(args[1]);
            b = Integer.parseInt(args[2]);
        }catch (Exception e){
            System.err.println("Error el numero a digitar debe de ser un numeros entero" + e.getMessage());
        }


        switch (operacion){
            case "suma":
                resultado = a + b;
                break;
            case "resta":
                resultado = a - b;
                break;
            case "mult":
                resultado = a * b;
                break;
            case "div":
                if(a == 0) System.exit(-1);
                if(b == 0) System.exit(-1);
                System.err.println("No se puede dividir por '0'");
                resultado = (double)a / b;
                break;
            default:
                System.err.println("Error no corresponde a ninguna operacion");

        }

        System.out.println("Resultado de la operacion es = " + resultado);
    }
}
