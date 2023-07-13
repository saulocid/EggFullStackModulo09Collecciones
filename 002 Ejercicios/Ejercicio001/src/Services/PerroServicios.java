
package Services;

import Entities.Perro;
import java.util.ArrayList;
import java.util.Scanner;

public class PerroServicios {
   
   public final Scanner leer = new Scanner(System.in).useDelimiter("\n");
   
   public Perro crearPerro(ArrayList<String> perros){
      System.out.print("Ingrese la raza del perro: ");
      String raza = leer.next();
      Perro p = new Perro(raza);
      perros.add(raza);
      return p;
   }
   
   public boolean seguir(){
      boolean bol=true;
      String salir;
      do{
         System.out.println("Desea agregar otro perro? (S/N)");
         salir = leer.next().toUpperCase();
         if (!salir.equals("S") && !salir.equals("N")){
            System.out.println("Respuesta errónea, vuelve a ingresar");
         }
      } while (!salir.equals("S") && !salir.equals("N"));
      if (salir.equals("N")){
         bol = false;
      }
      return bol;
   }
   
}
