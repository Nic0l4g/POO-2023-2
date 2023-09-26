//Autor Nicolas Garcia Guerrero C.C. 1091355683
package controller;

import access.ItemDAO;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;
import model.item;

public class ItemController {
    Scanner scaStr = new Scanner (System.in);
    Scanner scaDou = new Scanner (System.in);
    Scanner scaLon = new Scanner (System.in);
    Scanner scaInt = new Scanner (System.in);
    
    public void handleItems(){
        int opcion;
            do{
            System.out.println("Bodega".toUpperCase());
            System.out.println("1. Agregar item");
            System.out.println("2. Ver item");
            System.out.println("3. Modificar item");
            System.out.println("4. Eliminar item");
            System.out.println("5. Lista de items");
            System.out.println("6. Salir");
            System.out.print("Elija una opcion : ");
            opcion = scaInt.nextInt();
            scaInt.nextLine();
            switch(opcion){
                case 1: agrItem(); break;
                case 2: verItem(); break;
                case 3: modItem(); break;
                case 4: quiItem(); break;
                case 5: verItems(); break;
            }   
        }while( opcion != 6);
    }
    private void agrItem(){
        int op;
        do{
            ItemDAO itemDao = new ItemDAO();
            System.out.println("Agregar Item".toUpperCase());
            System.out.println("Ingrese 0 para finalizar  another o otro numero para continuar : ");
            op = scaInt.nextInt();

             
          if (op != 0){  

            System.out.println("Agregar Item:");
            System.out.println("Stock item: ");
            Long stock = scaLon.nextLong();
            
            System.out.println("Nombre item (para separar palabras use el ´-´):");
            String nombre = scaStr.next();
            
            System.out.println("Precio item: ");
            Double precio = scaDou.nextDouble();
            
            System.out.println("Ubicacion del item en la bodega: ");
            String ubi_bod = scaStr.next();
            
            String id = UUID.randomUUID().toString().substring(0, 6);
            System.out.println("El codigo del nuevo item es: " + id);
            Map<String, Object> items = new HashMap<String, Object>(){
            {
             put("nombre" , nombre);
             put("precio" , precio);
             put("stock" , stock);   
             put("Ubicación en la bodega", ubi_bod);
          }
        };
          
           
            itemDao.saveItem(id, items);
            System.out.println("¡Item guardado correctamente!");
          }     
            
        }while (op != 0);
        
        
        
    }
    
    private void verItem(){
        ItemDAO itemDao = new ItemDAO();
        System.out.println("Verificar Item".toUpperCase());
        
        System.out.println("Codigo item:");
        String code = scaStr.nextLine();
        
        itemDao.recoverItem(code);
    }
    
    private void modItem(){
        ItemDAO itemDao = new ItemDAO();
        System.out.println("Modifica item".toUpperCase());
        
        System.out.println("codigo item:");
        String code = scaStr.next();
    
        System.out.println("Nombre item (para separar palabras use el ´-´): ");
        String nombre = scaStr.next();
            
        System.out.println("Precio item: ");
        Double precio = scaDou.nextDouble();
        
        System.out.println("Stock item: ");
        Long stock = scaLon.nextLong();
        
        System.out.println("Ubicacion del item en la bodega: ");
        String ubi_bod = scaStr.next();
        
        Map<String, Object> items = new HashMap<String, Object>(){
            {
             put(code + "/nombre" , nombre);
             put(code + "/precio" , precio);
             put(code + "/stock" , stock);
             put(code + "/ubi_bod" , ubi_bod);
          }
        };
        
        itemDao.updateItem( code,items);
        System.out.println("¡Item modificado correctamente!");
    }
    
    private void quiItem() {
        ItemDAO itemDao = new ItemDAO();
        System.out.println("Borrar item".toUpperCase());
        
        System.out.println("Codigo item:");
        String code = scaStr.nextLine();
        
        itemDao.deleteItem(code);
        System.out.println("¡Item borrado correctamente!");
    }
    
    private void verItems() {
        ItemDAO itemDao = new ItemDAO();
        System.out.println("LISTA Items".toUpperCase());
        itemDao.listItems();
    }
    
    
    
}