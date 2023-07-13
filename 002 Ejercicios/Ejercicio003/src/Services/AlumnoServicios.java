package Services;

import Entities.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoServicios {

   public final Scanner leer = new Scanner(System.in).useDelimiter("\n");

   public void crearAlumno(ArrayList<Alumno> alumnos) {

      do {
         Alumno al = new Alumno();
         ArrayList<Integer> notas = new ArrayList();

         System.out.print("Ingrese el nombre del alumno: ");
         al.setNombre(leer.next());

         double nota;
         for (int i = 0; i < 3; i++) {
            do {
               System.out.print("Ingrese número válida (1/10) para nota " + (i + 1) + ": ");
               nota = leer.nextDouble();
               if (nota < 1 || nota > 10 || nota != Math.round(nota)) {
                  System.out.println("Valor erróneo!");
               }
            } while (nota < 1 || nota > 10 || nota != Math.round(nota));
            notas.add((int) nota);
            al.setNotas(notas);
         }
         alumnos.add(al);
         if (seguir() == false) {
            break;
         }
      } while (true);
   }

   public boolean seguir() {
      boolean bol = true;
      String salir;
      do {
         System.out.println("Desea ingresar otro alumno? (S/N)");
         salir = leer.next().toUpperCase();
         if (!salir.equals("S") && !salir.equals("N")) {
            System.out.println("Respuesta errónea, vuelve a ingresar");
         }
      } while (!salir.equals("S") && !salir.equals("N"));
      if (salir.equals("N")) {
         bol = false;
      }
      return bol;
   }

   public double notaFinal(Alumno alumno) {
      double prom = 0;
      for (Integer nota : alumno.getNotas()) {
         prom += nota;
      }
      return prom / 3;
   }

   public void buscarAlumno(ArrayList<Alumno> alumnos) {
      System.out.print("ingrese un alumno a buscar: ");
      String al = leer.next();
      boolean bol = false;
      for (Alumno alumno : alumnos) {
         if (alumno.getNombre().equals(al)) {
            System.out.println("El promedio de " + al + " es " + notaFinal(alumno));
            bol = true;
         }
      }
      if (bol==false){
         System.out.println("No se encontró el alumno "+al);
      }
   }

}
