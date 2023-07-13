package ejercicio002;

import Entities.Perro;
import Services.PerroServicios;
import java.util.ArrayList;

/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
*/

public class Ejercicio002 {

   public static void main(String[] args) {
      
      ArrayList<String> perros = new ArrayList();
      PerroServicios ps = new PerroServicios();
      do{
         Perro perro = ps.crearPerro(perros);
      }while(ps.seguir()==true);
      
      perros.forEach((p)->System.out.println("El perro es de raza "+p));
      
      perros.sort(String.CASE_INSENSITIVE_ORDER);
      
      if (ps.pedirPerro(perros)==true){
         perros.forEach((p)->System.out.println("El perro es de raza "+p));
      } else {
         System.out.println("El perro no fue encontrado");
         perros.forEach((p)->System.out.println("El perro es de raza "+p));
      }
      
            
   }
   
}
