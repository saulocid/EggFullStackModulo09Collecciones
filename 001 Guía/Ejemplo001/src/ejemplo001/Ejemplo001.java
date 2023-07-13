package ejemplo001;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Ejemplo001 {

   public static void main(String[] args) {

      Scanner leer = new Scanner(System.in).useDelimiter("\n");

      //LISTAS:
      ArrayList<Integer> numerosA = new ArrayList();
      for (int i = 0; i < 5; i++) {
         numerosA.add(leer.nextInt());
      }

      //CONJUNTOS:
      HashSet<Integer> numerosB = new HashSet();
      for (int i = 0; i < 5; i++) {
         numerosB.add(leer.nextInt());
      }

      //MAPAS:
      HashMap<Integer, String> alumnos = new HashMap();
      for (int i = 0; i < 5; i++) {
         alumnos.put(leer.nextInt(), leer.next());
      }

      for (Integer aux : numerosA) {
         System.out.println(aux);
      }

      for (Integer aux : numerosB) {
         System.out.println(aux);
      }

      for (Map.Entry<Integer, String> aux : alumnos.entrySet()) {
         System.out.println(aux.getKey() + " " + aux.getValue());
      }

   }

}
