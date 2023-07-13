
package Entities;

import java.util.Objects;

public class Ciudad {
   
   private Integer CP;
   private String nombre;

   public Ciudad() {
   }

   public Ciudad(Integer CP, String nombre) {
      this.CP = CP;
      this.nombre = nombre;
   }

   public Integer getCP() {
      return CP;
   }

   public void setCP(Integer CP) {
      this.CP = CP;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   @Override
   public int hashCode() {
      int hash = 7;
      hash = 47 * hash + Objects.hashCode(this.CP);
      hash = 47 * hash + Objects.hashCode(this.nombre);
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
      final Ciudad other = (Ciudad) obj;
      if (!Objects.equals(this.nombre, other.nombre)) {
         return false;
      }
      if (!Objects.equals(this.CP, other.CP)) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "Ciudada de "+nombre+", CP= "+CP;
   }
   
}
