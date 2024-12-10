package parcial01;
import java.util.ArrayList;

public class Menu {
    
    private ArrayList<Producto> productos;

    public Menu() {
        this.productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado: " + producto.nombre);
    }

    public void mostrarMenu() {
        if (productos.isEmpty()) {
            System.out.println("El menu está vacío.");
        } else {
            System.out.println("menu:");
            for (Producto producto : productos) {
                System.out.println(producto.getNombre());
            }
        }
    }
}