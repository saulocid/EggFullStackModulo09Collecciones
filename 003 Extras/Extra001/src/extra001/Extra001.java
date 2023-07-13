package extra001;

import java.util.ArrayList;
import java.util.Scanner;

/*
Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y
los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
 */
public class Extra001 {

   public static void main(String[] args) {

      Scanner leer = new Scanner(System.in).useDelimiter("\n");
      ArrayList<Integer> numeros = new ArrayList<>();
      double num = 0;
      int suma = 0;
      System.out.println("A continuación ingresará números enteros al azar\n"
              + "éstos pueden ser positivos, negativos o 0\n"
              + "Para terminar el programa ingrese el número -99\n"
              + "NO PUEDE INGRESAR DECIMALES\n"
              + "----------------------------------------------------------------------------------------");
      do {
         do {
            System.out.print("Ingrese un número entero: ");
            num = leer.nextDouble();
            if (num != Math.round(num)) {
               System.out.println("No ingrese decimales!");
            }
            System.out.println("------------------------------------------------------------------------------------");
         } while (num != Math.round(num));
         if (num == -99) {
            break;
         } else {
            numeros.add((int) num);
         }
      } while (true);

      System.out.println("En total ingresó " + numeros.size() + " números");
      for (Integer n : numeros) {
         suma += n;
      }
      System.out.println("Su suma es " + suma + " y su promedio es " + ((double) suma / numeros.size()));
   }

}
