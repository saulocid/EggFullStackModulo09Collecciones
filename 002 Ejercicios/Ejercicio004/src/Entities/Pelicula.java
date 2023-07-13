
package Entities;

import java.util.Objects;

public class Pelicula {
   
   private String titulo;
   private String director;
   private Double duracion;

   public Pelicula() {
   }

   public Pelicula(String titulo, String director, Double duracion) {
      this.titulo = titulo;
      this.director = director;
      this.duracion = duracion;
   }

   public String getTitulo() {
      return titulo;
   }

   public void setTitulo(String titulo) {
      this.titulo = titulo;
   }

   public String getDirector() {
      return director;
   }

   public void setDirector(String director) {
      this.director = director;
   }

   public Double getDuracion() {
      return duracion;
   }

   public void setDuracion(Double duracion) {
      this.duracion = duracion;
   }

   @Override
   public int hashCode() {
      int hash = 7;
      hash = 67 * hash + Objects.hashCode(this.titulo);
      hash = 67 * hash + Objects.hashCode(this.director);
      hash = 67 * hash + Objects.hashCode(this.duracion);
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
      final Pelicula other = (Pelicula) obj;
      if (!Objects.equals(this.titulo, other.titulo)) {
         return false;
      }
      if (!Objects.equals(this.director, other.director)) {
         return false;
      }
      if (!Objects.equals(this.duracion, other.duracion)) {
         return false;
      }
      return true;
   }
   
}
