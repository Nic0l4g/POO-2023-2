
package simulacro;
import java.util.Scanner;

public class Simulacro {

    static Scanner s = new Scanner (System.in);

    public static void main(String[] args) {

        mostrarMenu();  
    }
    
    
    private static void mostrarMenu() {
         //casos de uso principales del sistema
        System.out.println("Elija una de las opciones de menú (1, 2 o 3)");
        System.out.println("1. Hamburguesa");
        System.out.println("2. Perro caliente");
        System.out.println("3. salchipapa");
        
        String opcion = String.valueOf(s.nextInt());
        
        if(opcion.equals("1")){
            System.out.println("Usted selecciono la opcion de menu 1");
            System.out.println(e1.registrarAsistencia());
        }
        else if (opcion.equals("2")){
            System.out.println("Usted selecciono la opcion de menu 2");
        }
        else if (opcion.equals("3")){
            System.out.println("Usted selecciono la opcion de menu 3");
        }
    }
}
    
