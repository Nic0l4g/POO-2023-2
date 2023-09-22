package modelView;
import java.util.Scanner;
/**
 *
 * @author nicga
 */
public class Menu {
    String Comida;
    String Acompañante1;
    String Acompañante2;
    String Bebida;
    static Scanner ic = new Scanner (System.in);
    
    
    
    


    
    public String Menu1() {
        String Hamburguesa;
        String Papas;
        String Gaseosa;
        String Comida = Hamburguesa;
        String Acompañante1 = Papas;
        String Bebida = Gaseosa;
        System.out.println("Hamburguesa, papas a la francesa y gaseosa");
        System.out.println("¿Este es el menu que desea?");
        System.out.println("1.");
        
            }
        }

        if (found) {
            System.out.println("The value " + cedulai + " is present in the vector.");
            return "Registro exitoso";
        } else {
            System.out.println("The value " + cedulai + " is not present in the vector.");
            return "Registro no exitoso";
        }

        
    }
    
     public static String registrarEstudiante(int[] cedulasE, int value) {

        System.out.print("ingrese la nueva cedula: ");
        
        int[] ncedula = new int[cedulasE.length + 1];
         // aaa

        int newIndex = 0;
        
        
        boolean found = false;
        for (int i = 0; i < cedulasE.length; i++) {
            if (cedulasE[i] == ncedula) {
                found = true;
                break;
            } else {
            }
        }

        if (found) {
            System.out.println("The value " + ncedula + " is present in the vector.");
            return "Usuario ya registrado";
        } else {
            System.out.println("The value " + ncedula + " is not present in the vector.");
            return "Nuevo usuario registrado";
        }
    
 
        return "Registro exitoso";
    }
}


    

