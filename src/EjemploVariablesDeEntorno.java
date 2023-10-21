import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {
        Map<String, String> varEnv = System.getenv();
        System.out.println("Varibles e ambiennte del sistema = " + varEnv);

        System.out.println("Listando variables de entorno");

        for(var i: varEnv.keySet()){
            System.out.println(i + " => " + varEnv.get(i));
        }

        String logname = System.getenv("LOGNAME");
        System.out.println("logname = " + logname);
        
        String lang = System.getenv("LANG");
        System.out.println("lang = " + lang);
        
        String home = System.getenv("HOME");
        System.out.println("home = " + home);
        
        String path = System.getenv("PATH");
        System.out.println("path = " + path);

        String lognameVarEnv = varEnv.get("LOGNAME");
        System.out.println("lognameVarEnv = " + lognameVarEnv);

        String langVarEnv = varEnv.get("LANG");
        System.out.println("langVarEnv = " + langVarEnv);

        String homeVarEnv = varEnv.get("HOME");
        System.out.println("homeVarEnv = " + homeVarEnv);

        String pathVarEnv = varEnv.get("PATH");
        System.out.println("pathVarEnv = " + pathVarEnv);
    }
}
