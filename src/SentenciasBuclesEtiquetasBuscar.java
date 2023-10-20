public class SentenciasBuclesEtiquetasBuscar {
    public static void main(String[] args) {
        String frase = "Tres tristes tigres tragan trigo en un trigal";
        String palabra= "trigo";
        int maxPalabra = frase.length();
        int maxFrase = frase.length() - maxPalabra;
        int cantidad = 0;
        char letra = 'g';
        buscar:
        for(int i = 0; i <= maxFrase; i++){
            int k = i;
            for(int j = 0; j < maxPalabra; i++){
                if(frase.charAt(k++) != palabra.charAt(j)){
                    i++;
                    continue buscar;
                }
            }
            cantidad++;
             i = i + maxPalabra;
        }

        System.out.println("Encontrado = " + cantidad + "veces el caracter '"+letra+"'");
    }
}
