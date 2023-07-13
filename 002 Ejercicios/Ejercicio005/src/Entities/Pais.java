
package Entities;

import java.util.Objects;

public class Pais {
   
   private String pais;

   public Pais() {
   }

   public String getPais() {
      return pais;
   }

   public void setPais(String pais) {
      this.pais = pais;
   }

   @Override
   public int hashCode() {
      int hash = 3;
      hash = 67 * hash + Objects.hashCode(this.pais);
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
      final Pais other = (Pais) obj;
      if (!Objects.equals(this.pais, other.pais)) {
         return false;
      }
      return true;
   }
   
}
