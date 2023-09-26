//Autor Nicolas Garcia Guerrero C.C. 1091355683
package access;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ValueEventListener;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.item;
import service.Facade;

public class ItemDAO {
    
    public void saveItem(String id, Map<String, Object> items ){
        FirebaseDatabase connexion = null;
       try {
               connexion = Facade.getConnection();
           DatabaseReference ref = connexion.getReference("/");
           DatabaseReference childReference = ref.child("items/"+ id);

        
        childReference.setValue(items);
        Thread.sleep(2000);
        } catch (InterruptedException ex) {
           Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null,
        ex);
        }
    };
    

    public void updateItem(String id, Map<String, Object> itemUpdate){
        FirebaseDatabase connexion = null;
        try {
        connexion = Facade.getConnection();
        final DatabaseReference dataBase = connexion.getReference("/").child("items");
     
        dataBase.updateChildren(itemUpdate);
        Thread.sleep(2000);
        } catch (InterruptedException ex) {
        Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null,
        ex);
        }
    }
            

    public void deleteItem(String id){
        FirebaseDatabase connexion = null;
        try {
        connexion = Facade.getConnection();
        final DatabaseReference dataBase = connexion.getReference("/").child("items/"+id);
        dataBase.removeValue();
        Thread.sleep(2000);
        } catch (InterruptedException ex) {
        Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null,
        ex);
        }
    }

    public void listItems(){
        FirebaseDatabase connexion = null;
        try {
        connexion = Facade.getConnection();
        DatabaseReference ref = connexion.getReference("/").child("items");
        ref.addValueEventListener(new ValueEventListener() {
        
            
            
        @Override
        public void onDataChange(DataSnapshot dataSnapshot) {
        GenericTypeIndicator<Map<String, item>> typeIndicator = new GenericTypeIndicator<Map<String, item>>() {};
        Map<String, item> items = dataSnapshot.getValue(typeIndicator);
        System.out.println("Item list: ");
        
        for (Map.Entry<String, item> entry : items.entrySet()) {
            String key = entry.getKey();
            item value = entry.getValue();
            
        System.out.println(
                "Item \n" 
                + "Id=" + key + "\n"
                + "Nombre=" + value.getNombre() + "\n" 
                + "Precio=" + value.getPrecio() + "\n" 
                + "Stock=" + value.getStock() + "\n"
                + "Ubicación en la bodega=" + value.getUbi_bod()+ "\n"
        );
        }
        

        }
        @Override
        public void onCancelled(DatabaseError databaseError) {
        System.out.println("The read failed: " + databaseError.getCode());
        }
        });
        Thread.sleep(2000);
        } catch (InterruptedException ex) {
        Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null,
        ex);
        }
 
    }
    
    public void recoverItem(String id){
                FirebaseDatabase connexion = null;
        try {
        connexion = Facade.getConnection();
        DatabaseReference ref = connexion.getReference("/").child("items");
        ref.addValueEventListener(new ValueEventListener() {
        @Override
        public void onDataChange(DataSnapshot dataSnapshot) {
    GenericTypeIndicator<Map<String, item>> typeIndicator = new GenericTypeIndicator<Map<String, item>>() {};
    Map<String, item> items = dataSnapshot.getValue(typeIndicator);

    System.out.println("Item list: ");

    if (items != null) {


        if (items.containsKey(id)) {
            item item = items.get(id);

            System.out.println(
                "Item \n"
                + "Id=" + id + "\n"
                + "Nombre=" + item.getNombre() + "\n"
                + "Precio=" + item.getPrecio() + "\n"
                + "Stock=" + item.getStock() + "\n"
                + "Ubicación en bodega=" + item.getUbi_bod()+ "\n"
            );
        } else {
            System.out.println("The specified key doesn´t exist!");
        }
    } else {
        System.out.println("No data available.");
    }
        }
        @Override
        public void onCancelled(DatabaseError databaseError) {
        System.out.println("The read failed: " + databaseError.getCode());
        }
        });
        Thread.sleep(2000);
        } catch (InterruptedException ex) {
        Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null,
        ex);
        }

    }
    
    
}
