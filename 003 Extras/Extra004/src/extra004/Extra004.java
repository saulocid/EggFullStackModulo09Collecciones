package extra004;

import Services.CiudadService;
import java.util.HashMap;

public class Extra004 {

   public static void main(String[] args) {
      
      HashMap<Integer,String> ciudades = new HashMap();
      CiudadService cs = new CiudadService();
      
      System.out.println("A continuación cargaremos 10 ciudades para usarlas");
            
      do {         
         cs.crearCiudad(ciudades);
      } while (ciudades.size()<10);
      
      cs.mostrarCiudades(ciudades);
      
      cs.pedirCP(ciudades);
      
      cs.mostrarCiudades(ciudades);
      
      cs.crearCiudad(ciudades);
      
      cs.mostrarCiudades(ciudades);
      
      cs.eliminar(ciudades);
      
      cs.mostrarCiudades(ciudades);
      
   }
   
}
