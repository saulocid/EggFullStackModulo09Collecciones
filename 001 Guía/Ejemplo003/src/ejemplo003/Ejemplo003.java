package ejemplo003;

import Entities.Libro;
import java.util.ArrayList;
import java.util.Collection;

public class Ejemplo003 {

   public static void main(String[] args) {
      
      Libro libro = new Libro("El escarabajo de Oro", 125);
      ArrayList<Libro> libros = new ArrayList();
      libros.add(libro);
      
      libros.forEach((aux)-> System.out.println(aux));
      
      
   }
   
}
