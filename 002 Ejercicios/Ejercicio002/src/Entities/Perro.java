
package Entities;

import java.util.Objects;

public class Perro {
   
   private String raza;

   public Perro() {
   }

   public Perro(String raza) {
      this.raza = raza;
   }

   public String getRaza() {
      return raza;
   }

   public void setRaza(String raza) {
      this.raza = raza;
   }

   @Override
   public int hashCode() {
      int hash = 5;
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
      final Perro other = (Perro) obj;
      if (!Objects.equals(this.raza, other.raza)) {
         return false;
      }
      return true;
   }
   
}
