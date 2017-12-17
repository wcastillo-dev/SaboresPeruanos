package pe.edu.upc.saboresperuanos_v12.entidades;

/**
 * Created by itsoportetecnico on 16/12/2017.
 */

public class Plato {
    private String nombre;
    private String descripcion;
    private String precio;
    private int imgPlato;

    public Plato(String nombre, String descripcion, String precio, int imgPlato) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.imgPlato = imgPlato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public int getImgPlato() {
        return imgPlato;
    }

    public void setImgPlato(int imgPlato) {
        this.imgPlato = imgPlato;
    }
}
