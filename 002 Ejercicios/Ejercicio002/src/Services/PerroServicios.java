
package Services;

import Entities.Perro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PerroServicios {
   
   public final Scanner leer = new Scanner(System.in).useDelimiter("\n");
   
   public Perro crearPerro(ArrayList<String> perros){
      System.out.print("Ingrese la raza del perro: ");
      String raza = leer.next();
      perros.add(raza);
      return new Perro(raza);
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
   
   public boolean pedirPerro(ArrayList<String> lista){
      System.out.println("Ingresa el perro a buscar, \nsi se encuentra se eliminará");
      String p = leer.next();
      Iterator it = lista.iterator();
      boolean bol = false;
      while(it.hasNext()){
         if (it.next().equals(p)){
            System.out.println(p+" fue eliminado");
            bol = true;
            it.remove();
         }
      }
      return bol;
   }
   
}
