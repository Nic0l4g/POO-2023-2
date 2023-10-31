//Autor Nicolas Garcia Guerrero C.C. 1091355683
package modelview;

import view.*;


public class Bodegaparcial {
    
    static ventana bienvenido = new ventana();
    static menu menu = new menu();
    static agregaritem aggitem = new agregaritem();
    static veritems veritem = new veritems();
    public static void main(String[] args) {

        bienvenido.setLocation(300,100);
        bienvenido.add(menu);
        bienvenido.add(aggitem);
        bienvenido.add(veritem);
        bienvenido.setVisible(true);
        menu.setSize(450, 350);
        menu.setVisible(true);

    }
    public static void agregaritem(){
        aggitem.setSize(450, 350);
        menu.setVisible(false);
        aggitem.setVisible(true);
    }
    public static void volver1(){
        menu.setSize(450, 350);
        aggitem.setVisible(false);
        menu.setVisible(true);
}
    public static void veritem(){
        veritem.setSize(450, 350);
        menu.setVisible(false);
        veritem.setVisible(true);
    }
    public static void volver2(){
        menu.setSize(450, 350);
        veritem.setVisible(false);
        menu.setVisible(true);
    }
}
