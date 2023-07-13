package ejercicio006;

import Entities.Producto;
import Services.ProductoServices;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio006 {

   public static void main(String[] args) {

      Scanner leer  = new Scanner(System.in).useDelimiter("\n");
      
      ProductoServices ps = new ProductoServices();
      
      HashMap<String, Double> productos = new HashMap();
      
      Producto producto = new Producto();
      
      ps.Programa(productos, producto);

   }

}
