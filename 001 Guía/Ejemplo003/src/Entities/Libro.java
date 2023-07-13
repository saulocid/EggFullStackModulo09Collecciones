
package Entities;

import java.util.ArrayList;
import java.util.Objects;

public class Libro {
   
   private String titulo;
   private Integer paginas;

   public Libro() {
   }

   public Libro(String titulo, Integer paginas) {
      this.titulo = titulo;
      this.paginas = paginas;
   }

   public Integer getPaginas() {
      return paginas;
   }

   public void setPaginas(Integer paginas) {
      this.paginas = paginas;
   }

   public String getTitulo() {
      return titulo;
   }

   public void setTitulo(String titulo) {
      this.titulo = titulo;
   }

   @Override
   public int hashCode() {
      int hash = 7;
      hash = 71 * hash + Objects.hashCode(this.titulo);
      hash = 71 * hash + Objects.hashCode(this.paginas);
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
      final Libro other = (Libro) obj;
      if (!Objects.equals(this.titulo, other.titulo)) {
         return false;
      }
      if (!Objects.equals(this.paginas, other.paginas)) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "El libro se llama "+titulo+" con una cantidad de "+paginas+" páginas";
   }
        
}
