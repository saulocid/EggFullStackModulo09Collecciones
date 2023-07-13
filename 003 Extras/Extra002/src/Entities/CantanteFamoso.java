package Entities;

import java.util.Objects;

public class CantanteFamoso {
   
   private String nombre;
   private String discoConMasVentas;

   public CantanteFamoso() {
   }

   public CantanteFamoso(String nombre, String discoConMasVentas) {
      this.nombre = nombre;
      this.discoConMasVentas = discoConMasVentas;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getDiscoConMasVentas() {
      return discoConMasVentas;
   }

   public void setDiscoConMasVentas(String discoConMasVentas) {
      this.discoConMasVentas = discoConMasVentas;
   }

   @Override
   public int hashCode() {
      int hash = 5;
      hash = 83 * hash + Objects.hashCode(this.nombre);
      hash = 83 * hash + Objects.hashCode(this.discoConMasVentas);
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
      final CantanteFamoso other = (CantanteFamoso) obj;
      if (!Objects.equals(this.nombre, other.nombre)) {
         return false;
      }
      if (!Objects.equals(this.discoConMasVentas, other.discoConMasVentas)) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return nombre + " , con su disco más vendido llamado " + discoConMasVentas;
   }
   
}
