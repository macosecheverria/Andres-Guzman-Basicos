import java.util.Properties;

public class EjemploPropiedadesDeSistemas {
    public static void main(String[] args) {
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);
        
        String home = System.getProperty("user.home");
        System.out.println("home = " + home);
        
        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);
        
        String java = System.getProperty("java.version");
        System.out.println("java = " + java);
        
        String lineSeparator = System.getProperty("line.separator");
        System.out.println("lineSeparator  = " + lineSeparator + "una nueva linea");
        
        String osname = System.getProperty("os.name");
        System.out.println("osname = " + osname);

        Properties properties = System.getProperties();
        properties.list(System.out);
    }    
}
