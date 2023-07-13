package Entities;

import java.util.ArrayList;
import java.util.Objects;

public class Alumno {
   
   private String nombre;
   private ArrayList<Integer> notas;

   public Alumno() {
   }

   public Alumno(String nombre, ArrayList<Integer> notas) {
      this.nombre = nombre;
      this.notas = notas;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public ArrayList<Integer> getNotas() {
      return notas;
   }

   public void setNotas(ArrayList<Integer> notas) {
      this.notas = notas;
   }

   @Override
   public int hashCode() {
      int hash = 7;
      hash = 97 * hash + Objects.hashCode(this.nombre);
      hash = 97 * hash + Objects.hashCode(this.notas);
      return hash;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (obj == null) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      final Alumno other = (Alumno) obj;
      if (!Objects.equals(this.nombre, other.nombre)) {
         return false;
      }
      if (!Objects.equals(this.notas, other.notas)) {
         return false;
      }
      return true;
   }
   
}
