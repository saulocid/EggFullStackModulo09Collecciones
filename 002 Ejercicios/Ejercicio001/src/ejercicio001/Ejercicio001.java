package ejercicio001;

import Entities.Perro;
import Services.PerroServicios;
import java.util.ArrayList;

/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList. 
*/

public class Ejercicio001 {

   public static void main(String[] args) {
      
      ArrayList<String> perros = new ArrayList();
      PerroServicios ps = new PerroServicios();
      do{
         Perro perro = ps.crearPerro(perros);
      }while(ps.seguir()==true);
      
      perros.forEach((p)->System.out.println("El perro es de raza "+p));
      
   }
   
}
