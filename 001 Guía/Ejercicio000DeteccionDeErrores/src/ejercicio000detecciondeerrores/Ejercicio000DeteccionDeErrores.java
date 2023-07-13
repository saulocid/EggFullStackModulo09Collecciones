package ejercicio000detecciondeerrores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeMap;

public class Ejercicio000DeteccionDeErrores {

   public static void main(String[] args) {

      ArrayList<String> array1 = new ArrayList();
      LinkedList<Boolean> logico1 = new LinkedList();
      HashSet<Double> doble1  = new HashSet();
      TreeSet<Float> arbol1 = new TreeSet();
      LinkedHashSet<Integer> int1 = new LinkedHashSet();
      HashMap<Integer,String> column1 = new HashMap();
      TreeMap<Integer,Double> dobles2 = new TreeMap();
      LinkedHashMap<Integer,Boolean>  banderas = new LinkedHashMap();
      
      //Detección 001
      ArrayList<Integer> listado = new ArrayList();
      TreeSet<String> arbol= new TreeSet();
      HashMap<Integer,String> personas = new HashMap<>();

      //Detección 002
      HashMap<Integer, String> personas2 = new HashMap<>();
      String n1 = "Albus";
      String n2 = "Severus";
      personas.put(0, n1);
      personas.put(1, n2);

      //Detección 003
      ArrayList<String> bebidas = new ArrayList();
      bebidas.add("café");
      bebidas.add("té");
      Iterator<String> it = bebidas.iterator();
      while (it.hasNext()) {
         if (it.next().equals("café")) {
            it.remove();
         }
      }
      

   }

}
