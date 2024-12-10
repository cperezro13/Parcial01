package parcial01;

import java.util.Scanner;

public class Parcial01 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Menu menu1 = new Menu();
        Menu menu2 = new Menu();
        Menu menu3 = new Menu();

        Producto pescado = new Producto("pescado", 6000.00);
        Producto carne = new Producto("carne", 8000.00);
        Producto pollo = new Producto("pollo", 7000.00);
        Producto arroz = new Producto("arroz", 1000.00);
        Producto lenteja = new Producto("lenteja", 1500.00);
        Producto arveja = new Producto("arveja", 1000.00);
        Producto mora = new Producto("mora", 1000.00);
        Producto maracruya = new Producto("maracruya", 1000.00);
        Producto mango = new Producto("mango", 1000.00);

        menu1.agregarProducto(pescado);
        menu2.agregarProducto(carne);
        menu3.agregarProducto(pollo);
        menu1.agregarProducto(arroz);
        menu2.agregarProducto(lenteja);
        menu3.agregarProducto(arveja);
        menu1.agregarProducto(mora);
        menu2.agregarProducto(maracruya);
        menu3.agregarProducto(mango);

        menu1.mostrarMenu();
        menu2.mostrarMenu();
        menu3.mostrarMenu();
        System.out.println("Seleccione un menu");

        int m = s.nextInt();
        if (m == 1) {
            System.out.println("Usted ha seleccionado:");
            menu1.mostrarMenu();
        } else if (m == 2) {
            System.out.println("Usted ha seleccionado:");
            menu2.mostrarMenu();
        } else{
            System.out.println("Usted ha seleccionado:");
            menu3.mostrarMenu();
        }
    }
}

