package Services;

import Entities.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PaisesServices {

   public final Scanner leer = new Scanner(System.in).useDelimiter("\n");

   public void crearPais(HashSet<Pais> ps) {
      do {
         Pais p = new Pais();
         System.out.print("Ingrese un país para agregar: ");
         String pais = leer.next().toUpperCase();
         boolean bol = false;
         for (Pais aux : ps) {
            if (aux.getPais().equals(pais)) {
               bol = true;
            }
         }

         if (bol == true) {
            System.out.println("El país ya fue ingresado!");
         } else {
            p.setPais(pais);
            ps.add(p);
         }

         if (seguir() == false) {
            break;
         }
      } while (true);

   }

   public boolean seguir() {
      boolean bol = true;
      String salir;
      do {
         System.out.println("Desea agreagar otra país? (S/N)");
         salir = leer.next().toUpperCase();
         if (!salir.equals("S") && !salir.equals("N")) {
            System.out.println("Respuesta errónea");
         }
      } while (!salir.equals("S") && !salir.equals("N"));
      if (salir.equals("N")) {
         bol = false;
      }
      return bol;
   }

   public void mostrarPaises(HashSet<Pais> ps) {
      System.out.println("Los países son: ");
      for (Pais aux : ps) {
         System.out.println("- " + aux.getPais());
      }
   }

   public void ordenar(HashSet<Pais> ps) {
      ArrayList<Pais> aux = new ArrayList(ps);
      Collections.sort(aux, (Pais a1, Pais a2) -> a1.getPais().compareTo(a2.getPais()));
      System.out.println("Los países ordenados son:");
      for (Pais pais : aux) {
         System.out.println("- "+pais.getPais());
      }
   }

   public void buscar(HashSet<Pais> ps) {

      System.out.print("Ingrese un país a buscar: ");
      String buscar = leer.next().toUpperCase();

      boolean bol = false;
      ArrayList<String> nombre = new ArrayList();

      for (Pais p : ps) {
         nombre.add(p.getPais());
      }

      Iterator it = nombre.iterator();

      while (it.hasNext()) {
         if (it.next().equals(buscar)) {
            it.remove();
            bol = true;
         }
      }

      if (bol == true) {
         System.out.println("Los países son:");
         for (String aux : nombre) {
            System.out.println("- "+ aux);
         }
      } else {
         System.out.println("No se encontró el país " + buscar);
      }
   }

}
