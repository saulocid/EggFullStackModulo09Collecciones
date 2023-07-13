package Services;

import Entities.Ciudad;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

/*
Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el
número.
• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario.
• Muestra por pantalla los datos
• Agregar una ciudad con su código postal correspondiente más al HashMap.
• Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
• Muestra por pantalla los datos
 */
public class CiudadService {

   public final Scanner leer = new Scanner(System.in).useDelimiter("\n");

   public void crearCiudad(HashMap<Integer, String> ciudades) {
      System.out.println("Ingrese los datos para crear la ciudad");
      Integer cp = 0;
      System.out.print("Ingrese Código Postal (CP): ");
      cp = validarInt();
      System.out.print("Ingrese el nombre de la ciudad: ");
      String city = leer.next();
      Ciudad c = new Ciudad(cp, city);
      ciudades.put(cp, city);
   }

   public Integer validarInt() {
      double aux;
      do {
         aux = leer.nextDouble();
         if (aux < 1 || aux != Math.round(aux)) {
            System.out.print("CP inválido, vuelva a ingresar: ");
         }
      } while (aux < 1 || aux != Math.round(aux));
      return (int) aux;
   }

   public void mostrarCiudades(HashMap<Integer, String> ciudades) {
      System.out.println("--------------------------------------------------------");
      System.out.println("Las ciudades son:");
      for (Map.Entry<Integer, String> city : ciudades.entrySet()) {
         System.out.println("Ciudad: " + city.getValue() + " || CP: " + city.getKey());
      }
      System.out.println("--------------------------------------------------------");
   }

   public void pedirCP(HashMap<Integer, String> ciudades) {
      System.out.println("Ingrese un CP para buscar la ciudad correspondiente");
      Integer aux = validarInt();
      boolean bol = false;
      for (Map.Entry<Integer, String> city : ciudades.entrySet()) {
         if (Objects.equals(city.getKey(), aux)) {
            System.out.println("La ciudad de CP " + aux + " es " + city.getValue());
            bol = true;
         }
      }
      if (bol == false) {
         System.out.println("No se encontró una ciudad relacionada al CP " + aux);
      }
   }

   public void eliminar(HashMap<Integer, String> ciudades) {
      
      System.out.println("Ingrese 3 CP para eliminar la ciudad");
      Integer aux;
      boolean bol;
      for (int i = 0; i < 3; i++) {
         do {
            Iterator it = ciudades.keySet().iterator();
            bol = false;
            System.out.print("CP número " + (i + 1) + " a eliminar: ");
            aux = validarInt();
            while (it.hasNext()) {
               if (Objects.equals(aux, it.next())) {
                  bol = true;
               }
               
            }
            if (bol == false) {
               System.out.println("INCORRECTO! Ingrese un CP válido!");
            }
         } while (bol == false);
         
         String aux2="";
         for (Map.Entry<Integer, String> city : ciudades.entrySet()) {
            if(Objects.equals(city.getKey(), aux)){
               aux2=city.getValue();
            }
         }
         
         Iterator it = ciudades.keySet().iterator();
         while (it.hasNext()) {
            if (Objects.equals(aux, it.next())) {
               System.out.println(aux2 + " se há eliminado");
               it.remove();
            }
         }

      }

   }

}
