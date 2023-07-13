
package Entities;

import java.util.Objects;

public class Producto {
   
   private String nombre;
   private Double precio;

   public Producto() {
   }

   public Producto(String nombre, Double precio) {
      this.nombre = nombre;
      this.precio = precio;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public Double getPrecio() {
      return precio;
   }

   public void setPrecio(Double precio) {
      this.precio = precio;
   }

   @Override
   public int hashCode() {
      int hash = 5;
      hash = 79 * hash + Objects.hashCode(this.nombre);
      hash = 79 * hash + Objects.hashCode(this.precio);
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
      final Producto other = (Producto) obj;
      if (!Objects.equals(this.nombre, other.nombre)) {
         return false;
      }
      if (!Objects.equals(this.precio, other.precio)) {
         return false;
      }
      return true;
   }
   
   @Override
   public String toString(){
      return "Producto: "+nombre+", Precio: "+precio;
   }
   
}
