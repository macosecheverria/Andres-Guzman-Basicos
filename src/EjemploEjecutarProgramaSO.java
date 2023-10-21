public class EjemploEjecutarProgramaSO {
    public static void main(String[] args) {
        try {
            if(
                    System.getProperty("os.name").toLowerCase().contains("nix") ||
                    System.getProperty("os.name").toLowerCase().contains("nux")
            ){
               ProcessBuilder processBuilder = new ProcessBuilder("code");
               Process process =  processBuilder.start();
               int exitCode =  process.waitFor();

               if(exitCode == 0){
                   System.out.println("El proceso se ejecuto exitosamente");
               }else {
                   System.out.println("El proceso termino con un codigo de salida" + exitCode);
               }
            }

        }catch (Exception e){
            System.err.println("El comando es desconocido");
        }

        System.out.println("Se ha cerrado el editor");
        System.exit(0);
    }
}
