package ejemplo002;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Ejemplo002 {

   public static void main(String[] args) {
      
      ArrayList<Integer> numerosA = new ArrayList();
      int x = 20;
      numerosA.add(x);
      numerosA.remove(0);
      
      HashSet<Integer> numerosB = new HashSet();
      Integer y = 20;
      numerosB.add(y);
      numerosB.remove(20);

      HashMap<Integer,String> alumnos = new HashMap();
      int dni = 34576189;
      String nombreAlumno = "Pepe";
      alumnos.put(dni,nombreAlumno);
      alumnos.remove(34576189);
      
      
   }
   
}
