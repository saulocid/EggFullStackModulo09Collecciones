package Services;

import Entities.Libro;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class LibroService {

   public final Scanner leer = new Scanner(System.in).useDelimiter("\n");

   public Libro crearLibro() {
      System.out.print("Ingrese el título del libro: ");
      String titulo = leer.next();
      System.out.print("Ingrese el autor del libro: ");
      String autor = leer.next();
      System.out.print("Ingrese la cantidad de ejemplares: ");
      double cant = 0;
      cant = validar(cant);
      return new Libro(titulo, autor, (int) cant, 0);
   }

   public double validar(double c) {
      boolean bol = true;
      do {
         c = leer.nextDouble();
         if (c < 1 || c != Math.round(c)) {
            System.out.println("Valor erróneo, vuelva a ingresar: ");
            bol = false;
         }
         if (bol == true) {
            break;
         }
      } while (true);
      return c;
   }

   public boolean seguir() {
      boolean bol = true;
      String opc;
      System.out.print("Desea registrar otro libro? (S/N) ");
      do {
         opc = leer.next().toUpperCase();
         if (!opc.equals("S") && !opc.equals("N")) {
            System.out.print("Opción errónea, vuelva a ingresar (S/N) ");
         }
      } while (!opc.equals("S") && !opc.equals("N"));
      if (opc.equals("S")) {
         bol = false;
      }
      return bol;
   }

   public void menu(HashSet<Libro> libros) {
      System.out.println("Ingrese el nombre del libro que desee usar");
      String nombre = leer.next();
      int opc = 0;
      boolean bol = false;
      for (Libro lib : libros) {
         if (nombre.equals(lib.getTitulo())) {
            System.out.println("Elija 1 para llevarse un ejemplar\n"
                    + "Elija 2 si lo quiere devolver\n"
                    + "Elija 3 para mostrar libreo\n"
                    + "Elija 4 para Salir");
            System.out.print("Opción: ");
            opc = validarInt();
            bol = true;
         }
      }
      if (bol == false) {
         System.out.println("No se encontró el libro, vuelva a buscar");
      } else {
         switch (opc) {
            case 1:
               prestamo(libros, nombre);
               break;
            case 2:
               devolucion(libros, nombre);
               break;
            case 3:
               mostrar(libros);
               break;
            default:
               System.exit(0);
         }
      }
   }

   public int validarInt() {
      boolean validar;
      double num;
      do {
         validar = true;
         num = leer.nextDouble();
         if (num < 1 || num > 4 || num != Math.round(num)) {
            System.out.print("Opción incorrecta. Elija entre 1 y 4: ");
            validar = false;
         }
         if (validar == true) {
            break;
         }
      } while (true);
      return (int) num;
   }

   public void prestamo(HashSet<Libro> libros, String nombre) {
      Iterator it = libros.iterator();
      while (it.hasNext()) {
         Libro lib = (Libro) it.next();
         if (lib.getTitulo().equals(nombre)) {
            if (lib.getEjemplares() == lib.getEjemplaresPrestados()) {
               System.out.println("No se pueden prestar más ejemplares");
            } else {
               System.out.println("Se prestó un ejemplar");
               lib.setEjemplaresPrestados(lib.getEjemplaresPrestados() + 1);
            }
         }
      }
   }

   public void devolucion(HashSet<Libro> libros, String nombre) {
      Iterator it = libros.iterator();
      while (it.hasNext()) {
         Libro lib = (Libro) it.next();
         if (lib.getTitulo().equals(nombre)) {
            if (lib.getEjemplaresPrestados() <= lib.getEjemplares() && lib.getEjemplaresPrestados() > 0) {
               System.out.println("Se devolvió un ejemplar");
               lib.setEjemplaresPrestados(lib.getEjemplaresPrestados() - 1);
            } else {
               System.out.println("No se pueden devolver más ejemplares");
            }
         }
      }
   }

   public void mostrar(HashSet<Libro> libros) {
      System.out.println("Los libros son:");
      for (Libro l : libros) {
         Libro lib = l;
         System.out.println(lib.toString());
      }
   }
}
