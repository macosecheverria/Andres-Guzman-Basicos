import javax.swing.*;

public class SentenciaForArreglos {
    public static void main(String[] args) {
        String[] nombres = {"Marcos","Juan","Selva","Juana","Renato"};
        int count = nombres.length;
        for(int i = 0; i < count; i++){
            if(nombres[i].equalsIgnoreCase("marcos") ||
                    nombres[i].equalsIgnoreCase("juana")) {
                continue;
            }
            System.out.println(i + " = " + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Marcos\" \"Juana\"");
        boolean encontrado = false;
        for(int i = 0; i < count; i++){
            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
        }

        JOptionPane.showMessageDialog(null,
                buscar + (
                        encontrado
                                ? "El usuario ha sido encontrado"
                                : "El usuario no ha sido encontrado"
                )
        );

        /*if(!encontrado){
            JOptionPane.showMessageDialog(null, buscar + "No se ha encontrado");
        }else {
            JOptionPane.showMessageDialog(null,buscar + "El usuario ha sido encontrado");
        }*/
    }
}
