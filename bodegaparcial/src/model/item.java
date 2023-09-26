//Autor Nicolas Garcia Guerrero C.C. 1091355683
package model;


public class item {
    private String nombre;
    private Double precio;
    private Long stock;
    private String ubi_bod;

    public item(String nombre, Double precio, Long stock, String ubi_bod) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.ubi_bod = ubi_bod;
    }

    public item() {
    }
    
    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public String getUbi_bod (){
        return ubi_bod;
    }   
    public void setUbi_bod (String ubi_bod){
        this.ubi_bod = ubi_bod;
    }
}