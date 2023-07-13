package Services;

import Entities.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CFService {

   public final Scanner leer = new Scanner(System.in).useDelimiter("\n");
   
   //Opción 1 agregar cantante
   public void agregarCantante(ArrayList<CantanteFamoso> lista) {

      System.out.print("Ingrese el nombre del cantante: ");
      String nombre = leer.next();
      System.out.print("Ingrese el disco más vendido: ");
      String disco = leer.next();
      CantanteFamoso cf = new CantanteFamoso(nombre, disco);
      lista.add(cf);

   }

   //Opción 2 mostrar cantantes
   public void mostrarCantante(ArrayList<CantanteFamoso> lista) {
      System.out.println("-------------------------------------------------------------------------------------------");
      System.out.println("Los cantantes con sus discos son:");
      lista.forEach((cf) -> {
         System.out.println(cf.toString());
      });
   }

   public boolean menu(ArrayList<CantanteFamoso> lista) {
      boolean bol = false;

      int opc = elegirOpcion();
      switch (opc) {
         case 1:
            agregarCantante(lista);
            break;
         case 2:
            mostrarCantante(lista);
            break;
         case 3:
            eliminarCantante(lista);
            break;
         default:
            bol = salir();
      }

      return bol;
   }

   public int elegirOpcion() {
      double opc;
      do {
         opc = pedirOpc();
         if (validarOpc(opc) == true) {
            break;
         }
      } while (true);
      return (int) opc;
   }

   public double pedirOpc() {
      System.out.println("Ingrese una opcion para:\n"
              + "----------------------------------------------------\n"
              + "1. Agregar cantante\n"
              + "2. Mostrar cantantes\n"
              + "3. Eliminar producto\n"
              + "4. Salir\n"
              + "----------------------------------------------------");
      double opc = leer.nextDouble();
      return opc;
   }

   public boolean validarOpc(double opc) {
      boolean bol = true;
      if (opc < 1 || opc > 4 || opc != Math.round(opc)) {
         bol = false;
         System.out.println("Opción incorrecta\n"
                 + "----------------------------------------------------");
      }
      return bol;
   }

   //Opción 3 eliminar cantante
   public void eliminarCantante(ArrayList<CantanteFamoso> lista) {
      System.out.print("Ingrese el nombre del cantante que desee eliminar: ");
      String cantante = leer.next();
      Iterator it = lista.iterator();
      while(it.hasNext()){
         CantanteFamoso cf = (CantanteFamoso) it.next();
         if (cantante.equals(cf.getNombre())) {
            System.out.println("El cantante "+cantante+" se eliminó");
            it.remove();
         } else {
            System.out.println("No se encontró el cantante");
         }
      }
   }
   
   //Opción 4 (default) salir
   public boolean salir(){
      boolean salir = false, validar;
      String opc;
      System.out.print("Desea salir del menú? (S/N): ");
      do{
         validar=true;
         opc= leer.next().toUpperCase();
         if (!opc.equals("S") && !opc.equals("N")){
            System.out.print("Opción incorrecta, vuelva a ingresar (S/N):  ");
            validar=false;
         }
         if(validar==true){
            break;
         }
      }while(true);
      if (opc.equals("S")){
         salir = true;
         System.out.println("Ha salido del menú");
      }
     return salir;
   }

}
