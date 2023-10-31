//Autor Nicolas Garcia Guerrero C.C. 1091355683
package modelview;

import model.ItemDAO;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;
import model.item;

public class ItemController {
    private String nombre;
    private long stock;
    private double precio;
    private String ubi_bod;
    private String id;
    
    public void agrItem(long stock, String nombre, double precio, String ubi_bod){ 
        ItemDAO itemDao = new ItemDAO();
        this.stock = stock;
        this.nombre = nombre;
        this.precio = precio;
        this.ubi_bod = ubi_bod;
        
            
            String id = UUID.randomUUID().toString().substring(0, 6);
            //System.out.println("El codigo del nuevo item es: " + id);
            Map<String, Object> items = new HashMap<String, Object>(){
            {
             put("nombre" , nombre);
             put("precio" , precio);
             put("stock" , stock);   
             put("Ubicación en la bodega", ubi_bod);
          }
        };
          
           
            itemDao.saveItem(id, items);
            //System.out.println("¡Item guardado correctamente!");
          }     
            

         
    
    
    private void verItem(String id){
        this.id = id;
        ItemDAO itemDao = new ItemDAO();
        itemDao.recoverItem(id);
        
    }
    
    private void modItem(){
        ItemDAO itemDao = new ItemDAO();
        System.out.println("Modifica item".toUpperCase());
        
        System.out.println("codigo item:");
        //String code = scaStr.next();
    
        System.out.println("Nombre item (para separar palabras use el ´-´): ");
        //String nombre = scaStr.next();
            
        System.out.println("Precio item: ");
        //Double precio = scaDou.nextDouble();
        
        System.out.println("Stock item: ");
        //Long stock = scaLon.nextLong();
        
        System.out.println("Ubicacion del item en la bodega: ");
        //String ubi_bod = scaStr.next();
        
        Map<String, Object> items = new HashMap<String, Object>(){
            {
             //put(code + "/nombre" , nombre);
             //put(code + "/precio" , precio);
             //put(code + "/stock" , stock);
             //put(code + "/ubi_bod" , ubi_bod);
          }
        };
        
        //itemDao.updateItem( code,items);
        System.out.println("¡Item modificado correctamente!");
    }
    
    private void quiItem() {
        ItemDAO itemDao = new ItemDAO();
        System.out.println("Borrar item".toUpperCase());
        
        System.out.println("Codigo item:");
        //String code = scaStr.nextLine();
        
        //itemDao.deleteItem(code);
        System.out.println("¡Item borrado correctamente!");
    }
    
    private void verItems() {
        ItemDAO itemDao = new ItemDAO();
        System.out.println("LISTA Items".toUpperCase());
        itemDao.listItems();
    }
    
    
    
}