//Autor Nicolas Garcia Guerrero C.C. 1091355683
package service;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.FirebaseDatabase;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Facade {
    private static FirebaseDatabase firebaseDB = null;
    
    public static FirebaseDatabase getConnection(){
        try {
            if(firebaseDB == null){
            FirebaseOptions firebaseOptions = new FirebaseOptions.Builder()
                    .setDatabaseUrl("https://bodega-parcial-default-rtdb.firebaseio.com/")
                    .setServiceAccount(new FileInputStream(new File("src/service/bodega-parcial.json")))
                    .build();

            FirebaseApp.initializeApp(firebaseOptions);
            firebaseDB = FirebaseDatabase.getInstance();
            } 
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        
        return firebaseDB;
    }
}

