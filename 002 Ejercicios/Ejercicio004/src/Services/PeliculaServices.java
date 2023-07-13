package Services;

import Entities.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;

public class PeliculaServices {

   public final Scanner leer = new Scanner(System.in).useDelimiter("\n");

   public void crearPelicula(ArrayList<Pelicula> peliculas) {

      do {
         Pelicula pel = new Pelicula();

         System.out.print("Ingrese el nombre del título de la película: ");
         pel.setTitulo(leer.next());

         System.out.print("Ingrese el nombre del director de la película: ");
         pel.setDirector(leer.next());

         double horas;
         do {
            System.out.print("Ingrese la cantidad de horas de duración de la película: ");
            horas = leer.nextDouble();
            if (horas < 0) {
               System.out.println("Valor erróneo!");
            }
         } while (horas < 0);
         pel.setDuracion(horas);

         peliculas.add(pel);
         if (seguir() == false) {
            break;
         }
      } while (true);

   }

   public boolean seguir() {
      boolean bol = true;
      String salir;
      do {
         System.out.println("Desea agreagar otra pelicula? (S/N)");
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

   public void mostrarPelicula(ArrayList<Pelicula> peliculas) {
      for (Pelicula pelicula : peliculas) {
         System.out.println("La película es " + pelicula.getTitulo() + " dirigida por  " + pelicula.getDirector() + " y dura " + pelicula.getDuracion() + " horas");
      }
   }

   public void mostrarPelicula1hora(ArrayList<Pelicula> peliculas) {
      System.out.println("Películas de más de 1 hora:");
      for (Pelicula pelicula : peliculas) {
         if (pelicula.getDuracion() > 1) {
            System.out.println("La película es " + pelicula.getTitulo() + " dirigida por  " + pelicula.getDirector() + " y dura " + pelicula.getDuracion() + " horas");
         }
      }
   }
   
   public void ordenDuracion(ArrayList<Pelicula> peliculas){
      System.out.println("Orden por duración");
      Collections.sort(peliculas, (Pelicula pelicula1, Pelicula pelicula2) -> Double.compare(pelicula2.getDuracion(), pelicula1.getDuracion()));
      mostrarPelicula(peliculas);
   }
   
   public void ordenTitulo(ArrayList<Pelicula> peliculas){
      System.out.println("Orden alfabético por título");
      Collections.sort(peliculas, (Pelicula pelicula1, Pelicula pelicula2) -> pelicula1.getTitulo().compareTo(pelicula2.getTitulo()));
      mostrarPelicula(peliculas);
   }
   
   public void ordenDirector(ArrayList<Pelicula> peliculas){
      System.out.println("Orden alfabético por director");
      Collections.sort(peliculas, (Pelicula pelicula1, Pelicula pelicula2) -> pelicula1.getDirector().compareTo(pelicula2.getDirector()));
      mostrarPelicula(peliculas);
   }

}
