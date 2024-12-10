package parcial01;

public class Producto {

    String nombre;
    double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return "Nombre del producto: " + nombre;
    }

    public double getPrecio() {
        return precio;
    }

}
