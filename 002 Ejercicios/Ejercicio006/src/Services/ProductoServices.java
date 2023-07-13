package Services;

import Entities.Producto;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas. 
 */
public class ProductoServices {

   public final Scanner leer = new Scanner(System.in).useDelimiter("\n");

   public void Programa(HashMap<String, Double> ps, Producto p) {
      int opc = 0;
      do {
         if (ps.isEmpty()) {
            System.out.println("No hay productos creados, cree al menos 1");
            p = crearProducto(p);
            ps.put(p.getNombre(), p.getPrecio());
         } else {
            opc = opcion(opc);
            switch (opc) {
               case 1:
                  p = crearProducto(p);
                  ps.put(p.getNombre(), p.getPrecio());
                  break;
               case 2:
                  modificarPercio(ps);
                  break;
               case 3:
                  eliminarProducto(ps);
                  break;
               case 4:
                  mostrarProductos(ps);
                  break;
               default:
                  System.exit(0);
            }
         }
      } while (true);

   }

   public double pedirOpc() {
      System.out.println("Ingrese una opcion para:\n"
              + "----------------------------------------------------\n"
              + "1. Crear producto\n"
              + "2. Modificar precio\n"
              + "3. Eliminar producto\n"
              + "4. Mostrar productos\n"
              + "5. Salir\n"
              + "----------------------------------------------------");
      double opc = leer.nextDouble();
      return opc;
   }

   public boolean validarOpc(double o) {
      boolean bol = true;
      if (o < 1 || o > 5 || o != Math.round(o)) {
         bol = false;
         System.out.println("Opción incorrecta\n"
                 + "----------------------------------------------------");
      }
      return bol;
   }

   public int opcion(double o) {
      do {
         o = pedirOpc();
         if (validarOpc(o) == true) {
            break;
         }
      } while (true);
      return (int) o;
   }

   //Opcion 1 Crear Producto
   public Producto crearProducto(Producto p) {
      System.out.print("Ingrese el nombre del producto: ");
      p.setNombre(leer.next());
      p.setPrecio(ingresarPrecio());
      return p;
   }

   //Opcion 2 Modificar Precio
   public void modificarPercio(HashMap<String, Double> ps) {
      System.out.print("Ingrese nombre del producto para modificar su precio: ");
      String nombre = leer.next();
      boolean bol = false;
      for (Map.Entry<String, Double> p : ps.entrySet()) {
         if (p.getKey().equals(nombre)) {
            System.out.print("Ingrese el precio a modificar: ");
            p.setValue(ingresarPrecio());
            bol = true;
         }
      }
      if (bol == false) {
         System.out.println("No se encontró el producto.");
      }
   }

   public double ingresarPrecio() {
      double precio;
      do {
         System.out.print("Ingrese el precio, positivo hasta con 2 decimales: ");
         precio = leer.nextDouble();
         if (precio < 0) {
            System.out.println("Precio inválido!");
         }
      } while (precio < 0);
      return precio;
   }

   //Opcion 3 Eliminar Producto
   public void eliminarProducto(HashMap<String, Double> ps) {
      System.out.print("Ingrese nombre del producto que desee eliminar: ");
      String nombre = leer.next();
      boolean bol = false;

      Iterator<String> it = ps.keySet().iterator();

      while (it.hasNext()) {
         String p = it.next();
         if (p.equals(nombre)) {
            System.out.println(p + " se eliminó");
            it.remove();
            bol = true;
         }
      }
      if (bol == false) {
         System.out.println("No se encontró el producto.");
      }
   }

   //Opcion 4 Mostrar Productos
   public void mostrarProductos(HashMap<String, Double> ps) {
      System.out.println("Los productos son:");
      int cont = 0;
      for (Map.Entry<String, Double> p : ps.entrySet()) {
         cont++;
         System.out.println("Producto " + cont + " " + p.getKey() + ". Precio $" + p.getValue());
      }
   }
}
