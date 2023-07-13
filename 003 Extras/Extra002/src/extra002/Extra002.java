
package extra002;

import Entities.CantanteFamoso;
import Services.CFService;
import java.util.ArrayList;

/*
Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5 objetos
de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada cantante
y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el usuario
elija o de salir del programa. Al final se deberá mostrar la lista con todos los cambios

*/

public class Extra002 {
   
   public static void main(String[] args) {
      
      ArrayList<CantanteFamoso> lista = new ArrayList();
      CFService cfs = new CFService();
      
      System.out.println("A continuación agregue 5 cantantes famosos y su  disco más vendido");
      for (int i = 0; i < 5; i++) {
         cfs.agregarCantante(lista);
      }
      
      cfs.mostrarCantante(lista);
      
      do{
         if (cfs.menu(lista)==true) {
            break;
         }
      }while(true);
      
      cfs.mostrarCantante(lista);
      
   }
   
}
