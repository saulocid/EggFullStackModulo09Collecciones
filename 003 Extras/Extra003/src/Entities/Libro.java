package Entities;

public class Libro {
   
   private String titulo;
   private String autor;
   private Integer ejemplares;
   private Integer ejemplaresPrestados;

   public Libro() {
   }

   public Libro(String titulo, String autor, Integer ejemplares, Integer ejemplaresPrestados) {
      this.titulo = titulo;
      this.autor = autor;
      this.ejemplares = ejemplares;
      this.ejemplaresPrestados = ejemplaresPrestados;
   }

   public String getTitulo() {
      return titulo;
   }

   public void setTitulo(String titulo) {
      this.titulo = titulo;
   }

   public String getAutor() {
      return autor;
   }

   public void setAutor(String autor) {
      this.autor = autor;
   }

   public Integer getEjemplares() {
      return ejemplares;
   }

   public void setEjemplares(Integer ejemplares) {
      this.ejemplares = ejemplares;
   }

   public Integer getEjemplaresPrestados() {
      return ejemplaresPrestados;
   }

   public void setEjemplaresPrestados(Integer ejemplaresPrestados) {
      this.ejemplaresPrestados = ejemplaresPrestados;
   }

   @Override
   public String toString() {
      return "El libro "+titulo+" es del autor "+autor+". Dispone de "+ejemplares+" ejemplares y se han prestado "+ejemplaresPrestados;
   }
   
}
